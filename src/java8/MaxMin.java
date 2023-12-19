package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
    /**
     *
     * given emp DB, fetch max aged employee, min aged employee , find average age of all emps
     * working in an organization etc.
     *
     * stream().mapToInt(x -> x).summaryStatistics();
     *
     * since these statistics operations are numeric in nature, its essential to call the mapToInt() method
     * It provides us utility method like getMin(), getMax(), getSum() or getAverage()
     *
     * By using these general purpose methods, you can easily do a lot of things that require a lot of code
     * before java 8
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

        List<Integer> ages = employeeList.stream().map(emp -> emp.getAge()).collect(Collectors.toList());

        double y = ages.stream().mapToInt(x -> x).summaryStatistics().getAverage();

        System.out.println(y);
    }
}
