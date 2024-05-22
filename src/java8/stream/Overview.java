package java8.stream;

import java.io.Flushable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Overview {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(56);
        integerList.add(52);

//        Stream<Integer> openStream = integerList.stream();
//        Stream<Integer> filteredStream = openStream.filter(e -> e>20);
//        List<Integer> filteredList = filteredStream.collect(Collectors.toList());
//
//        filteredList.stream().forEach(x -> System.out.println(x));


        long startTime = System.currentTimeMillis();
//        Stream<Integer> sortedStream = integerList.parallelStream()
//                .sorted((i1,i2) -> i2.compareTo(i1));
//
//        sortedStream.forEach(x -> System.out.println(x));

//        int minValue = integerList.stream().min((i1,i2) -> i2.compareTo(i1)).get();
//        System.out.println(minValue);

//        List<Integer> doubledNumbers = integerList.parallelStream()
//                .map(n -> n * 2)
//                .collect(Collectors.toList());
//
//        long endTime = System.currentTimeMillis();
//        long elapsedTime = endTime - startTime;
//
//        System.out.println("Time taken by the thread: " + elapsedTime + " milliseconds");

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Alice",12,4000),
                new Employee(2,"Blice",12,5000),
                new Employee(3,"Aalice",12,6000),
        new Employee(4,"A",12,7000),
        new Employee(5,"calice",12,8000)
        );

        List<Employee> employees = employeeList.stream()
                .filter(employee -> employee.getName().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());

        employees.forEach(System.out::println);

        Optional<Employee> name = employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed()).findFirst();

        name.ifPresentOrElse(
                employee -> System.out.println("second highest salary"+ employee.getSalary()),
                () -> System.out.println("there is no second highest salary")
        );




    }
}
