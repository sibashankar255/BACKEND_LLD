package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Overview {
    public static void main(String[] args) {
//        Employee e1 =new Employee(1,"A", 1000);
//        Employee e2 =new Employee(1,"A", 1000);
//        Employee e3 =new Employee(3,"B", 1000);
//        Employee e4 =new Employee(4,"C", 1000);
//        Employee e5 =new Employee(5,"D", 1000);

        HashMap<Employee, String> hashMap = new HashMap<>();

//        hashMap.put(e1,"X");
//        hashMap.put(e2,"X");




//        e1.setId(1);
//        e1.setName("siba");
//
//        Employee e2 = new Employee();
//        e2.setId(2);
//        e2.setName("siba");
//
//        System.out.println("shallow compare"+ (e1==e2)); //it will check the reference
//
//        System.out.println("deep compare"+ e1.equals(e2)); //it will check the object
//
//
//        HashMap<String,Employee> hashMap = new HashMap<>();
//
//        hashMap.put("abc",e1);
//        hashMap.put("abc",e2);
//
//        System.out.println(hashMap.get("abc"));

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",3);
        map.put("d",4);
        map.put("c",1);
        map.put("t",0);
        map.put("y",-1);

        HashMap<String,Integer> map1 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e1,e2) -> e1, LinkedHashMap::new));

        map1.forEach((key,value) -> System.out.println(key+" "+value));

        String input="";
        Character result =  input.chars()           // IntStream
                .mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i)))  // convert to lowercase & then to Character object Stream
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // store in a LinkedHashMap with the count
                .entrySet().stream()                       // EntrySet stream
                .filter(entry -> entry.getValue() == 1L)   // extracts characters with a count of 1
                .map(entry -> entry.getKey())              // get the keys of EntrySet
                .findFirst().get();                        // get the first entry from the keys



        String inputString="siba shankar";
        Map<Character, Long> charMap =inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        HashSet<Integer> set =new HashSet<>();

    }


}
