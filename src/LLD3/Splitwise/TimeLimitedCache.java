package LLD3.Splitwise;

import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimeLimitedCache<K, V> {
    private final Map<K, WeakReference<ValueWithTimestamp<V>>> cache = new HashMap<>();
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    public TimeLimitedCache(long expirationTime, TimeUnit timeUnit) {
        // Schedule the cleanup task to run at fixed intervals
        scheduler.scheduleAtFixedRate(this::cleanup, expirationTime, expirationTime, timeUnit);
    }
    public void put(K key, V value) {
        cache.put(key, new WeakReference<>(new ValueWithTimestamp<>(value)));
    }
    public V get(K key) {
        WeakReference<ValueWithTimestamp<V>> ref = cache.get(key);
        if (ref != null) {
            ValueWithTimestamp<V> valueWithTimestamp = ref.get();
            if (valueWithTimestamp != null) {
                return valueWithTimestamp.getValue();
            } else {
                // Entry has been garbage collected, remove the weak reference
                cache.remove(key);
            }
        }
        return null;
    }

    private void cleanup() {
        long currentTime = System.currentTimeMillis();
        cache.entrySet().removeIf(entry -> {
            WeakReference<ValueWithTimestamp<V>> ref = entry.getValue();
            return ref == null || ref.get() == null || ref.get().isExpired(currentTime);
        });
    }
    private static class ValueWithTimestamp<T> {
        private final T value;
        private final long timestamp;
        public ValueWithTimestamp(T value) {
            this.value = value;
            this.timestamp = System.currentTimeMillis();
        }
        public T getValue() {
            return value;
        }
        public boolean isExpired(long currentTime) {
            // Check if the entry has exceeded the expiration time
            return currentTime - timestamp > /* expiration time in milliseconds */ 5000;
        }
    }

    public static void main(String[] args) {
        // Example usage
        TimeLimitedCache<String, String> cache = new TimeLimitedCache<>(1, TimeUnit.SECONDS);

        cache.put("key1", "value1");
        cache.put("key2", "value2");

        System.out.println(cache.get("key1")); // Output: value1

        // Wait for more than 1 second (expiration time) before retrieving
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(cache.get("key1")); // Output: null (entry expired)
    }

    public static void printPermutations(String str) {
        printPermutationsHelper(str.toCharArray(), 0);
    }
    private static void printPermutationsHelper(char[] chars, int index) {
        if (index == chars.length - 1) {
            // Base case: reached the end of the string, print the permutation
            System.out.println(new String(chars));
        } else {
            // Recursive case: generate permutations for the remaining characters
            for (int i = index; i < chars.length; i++) {
                // Swap the current character with the character at index
                swap(chars, index, i);
                // Recursively generate permutations for the remaining characters
                printPermutationsHelper(chars, index + 1);

                // Backtrack: undo the swap to explore other possibilities
                swap(chars, index, i);
            }
        }
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static int[] addArraysAsNumbers(int[] num1, int[] num2) {
        int maxLength = Math.max(num1.length, num2.length);
        List<Integer> result = new ArrayList<>();

        int carry = 0;
        for (int i = 0; i < maxLength || carry != 0; i++) {
            int digit1 = i < num1.length ? num1[num1.length - 1 - i] : 0;
            int digit2 = i < num2.length ? num2[num2.length - 1 - i] : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.add(sum % 10);
        }

        Collections.reverse(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
