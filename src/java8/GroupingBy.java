package java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingBy {
    /**
     * given a stream of objects, there are scenarios these objects need to be
     * grouped based on a certain distinguishing characteristics they pose
     *
     * create a map with key as age and value as list of employees in that age group
     *
     * this concept of grouping is the same as the group by clause in SQL which takes an
     * attribute, or a calculated value derived from attributes to divide the retrieved records
     * in distinct groups.
     *
     * generally what we used to do to group by is:-
     * iterating over each object, checking which group the object being examined falls in and then
     * adding that object in its correct group. the group itself is held together using a collection instance
     *
     * grouping collector use a classification function, which is an instance of the function<T,K>
     * T -> type of object in stream
     * K are the grouping name or grouping key
     *
     * for very value of K there is a collection of objects all of which return that value of K when
     * subjected to the classification function
     *
     * All these K-values and corresponding Collection of stream objects are sorted by the grouping
     * collector in a Map<K, Collection<T>>
     *
     *
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

        Map<Integer, List<Employee>> newEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge()));

        Map<Integer, Set<Employee>> newEmployee1 = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge(), Collectors.toSet()));

        Map<Integer, Set<Employee>> newEmployee2 = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getAge(), TreeMap::new, Collectors.toSet()));

        newEmployee.forEach((age, employees) -> {
            System.out.println("age"+ age);
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        });
    }
}


