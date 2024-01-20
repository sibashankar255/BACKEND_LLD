package javaInterview;

import java.util.*;
import java.util.stream.Stream;

public class Overview {
    public static void main(String[] args) {

        Job.print();

        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        String s5 ="hi";


//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s3));
//        System.out.println(System.identityHashCode(s4));
//        System.out.println(System.identityHashCode(s5));

        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        List<int[]> resultList = splitArray(original, splitSize);

        for (int[] subArray : resultList) {
            System.out.println(Arrays.toString(subArray));
        }
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {
        List<int[]> subArrays = new ArrayList<>();

        for (int i=0; i<array.length; i++){
            int endIndex = Math.min(i + splitSize, array.length);
            int[] subArray = Arrays.copyOfRange(array, i, endIndex);
            subArrays.add(subArray);
        }
        return subArrays;
    }

    public static Integer[] flatten1(Object[] inputArray)  {
        Integer[] flat = Arrays.stream(inputArray)
                .flatMap(element -> {
                    try {
                        return element instanceof Object[]
                        ? Arrays.stream(flatten((Object[]) element))
                        : Stream.of((Integer) element);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                        .toArray(Integer[] ::new);

        return flat;
    }

    public static Integer[] flatten(Object[] inputArray) throws Exception {
        List<Integer> flattenedList = new ArrayList<>();
        flattenArray(inputArray, flattenedList);
        return flattenedList.toArray(new Integer[flattenedList.size()]);
    }

    private static void flattenArray(Object[] input, List<Integer> output) {
        for (Object element : input) {
            if (element instanceof Integer) {
                output.add((Integer) element);
            } else if (element instanceof Object[]) {
                flattenArray((Object[]) element, output);
            } else {
                throw new IllegalArgumentException("Array contains non-integer elements");
            }
        }
    }

    public static List<int[]> splitArray1(int[] array, int splitSize) {
        List<int[]> subArrays = new ArrayList<>();

        for (int i = 0; i < array.length; i += splitSize) {
            int endIndex = Math.min(i + splitSize, array.length);
            int[] subArray = Arrays.copyOfRange(array, i, endIndex);
            subArrays.add(subArray);
        }

        return subArrays;
    }

    public static String commonCharacters(String a, String b) {
        Set<Character> commonSet = new HashSet<>();
        for (char c : a.toCharArray()) {
            if (b.indexOf(c) != -1) {
                commonSet.add(c);
            }
        }
        return String.valueOf(commonSet);
    }

    public static String compareCards(String card1, String card2) {
        String[] cardRankOrder = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int rank1 = Arrays.asList(cardRankOrder).indexOf(card1);
        int rank2 = Arrays.asList(cardRankOrder).indexOf(card2);

        if (rank1 > rank2) {
            return card1;
        } else if (rank2 > rank1) {
            return card2;
        } else {
            return "Equal"; // Cards have the same rank
        }
    }


}
