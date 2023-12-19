package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {
    /**
     * using Set.add() method:
     * if the element is present in that set already, then this Set.add() return false.
     * we can collect them.
     * Set.add() return false if the element was already present in the set.
     * filter such element and Collect duplicate elements in the set.
     *
     * stream.filter(n -> !items.add(n)).collect(Collectors.toSet());
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "A",13));
        employeeList.add(new Employee(2, "B",11));
        employeeList.add(new Employee(3, "C",12));
        employeeList.add(new Employee(4, "A",11));
        employeeList.add(new Employee(5, "C",10));
        employeeList.add(new Employee(6, "C",13));

        List<String> names= employeeList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        Set<String> uniqueName = new HashSet<>();
        Set<String> duplicate = names.stream().filter(name -> !uniqueName.add(name)).collect(Collectors.toSet());

        System.out.println(duplicate.toString());

        Set<String> duplicate1 =names.stream().filter( name ->Collections.frequency(names,name) ==1)
                .collect(Collectors.toSet());

        System.out.println(duplicate1);


    }


}
