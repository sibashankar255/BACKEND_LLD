package java8;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProblems {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        HashMap<String,Integer>map1=map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1,e2)->e1,LinkedHashMap::new));



        /*
        //Sort the map based on values
        HashMap<String,Integer>map1=map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1,e2)->e1,LinkedHashMap::new));

        map1.forEach((key,value)->System.out.println(key+""+value));


        //First non-repeating character
        String str = "siba shankar sahu";
        char[] characters = str.toCharArray();
        Map<Character, Long> charCountMap = characters.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         char c = characters.stream()
                .filter(character -> charCountMap.get(character) ==1 )
                .findFirst() .orElseThrow(() -> new RuntimeException("No non-repeating character found"));

         List<Integer> numbers = new ArrayList<>();
        //First non-repeating element
        Map<Integer, Long> countMap = numbers.stream() .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int number = numbers.stream() .filter(number -> countMap.get(number) == 1) .findFirst();

        //Get the duplicate elements from a list
        List<Integer> list = new ArrayList<>();
        Set<Integer> elements = new HashSet<Integer>();
        List<Integer> duplicateElements= list.stream() .filter(n -> !elements.add(n)) .collect(Collectors.toList());

        //Get the duplicate characters from a String
        String inputString="";
        List<Character>list1=inputString.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        //largest element in a list in java 8
        Optional<Integer> maxElement = numbers.stream() .max(Integer::compareTo);

        //return the characterwise count in java 8
        String inputString1="sibashankar";
        Map<Character,Long>charMap=inputString.chars()
                .mapToObj(c1->(char)c1)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

         */

//       System.out.println(findFirstNonRepeatingCharacter("siba shankar sahu"));


       List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1, 5, 6, 6);
        Set<Integer> elements = new HashSet<Integer>();
        List<Integer> list1= list.stream() .filter(n -> !elements.add(n)) .collect(Collectors.toList());
        Optional<Integer> y = list.stream() .filter(n -> !elements.add(n)).findFirst();

        String inputString="siba shankar sahu";
        List<Character> list11 =inputString.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        for (char x : list11){
            System.out.println(x);
        }

    }

    private static Character findFirstNonRepeatingCharacter(String input) {
        // Create a map to store character counts
        Map<Character,Long>charMap=input.chars()
                .mapToObj(c1->(char)c1)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()));

        // Find the first non-repeating character using streams
        java.util.Optional<Character> firstNonRepeatingChar =
                charMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        // Return the result or a default value ('\0' for no result)
        return firstNonRepeatingChar.orElse('\0');
    }

    private static <T> T findFirstNonRepeatingElement(List<T> list) {
        // Create a map to store element counts
        Map<T, Long> elementCountMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        // Find the first non-repeating element using streams
        java.util.Optional<Integer> firstNonRepeatingElement =
                (java.util.Optional<Integer>) list.stream()
                .filter(element -> elementCountMap.get(element) == 1)
                .findFirst();

        // Return the result or null if no non-repeating element is found
        return (T) firstNonRepeatingElement.orElse(null);
    }

}
