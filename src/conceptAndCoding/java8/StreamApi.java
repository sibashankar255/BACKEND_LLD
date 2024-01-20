package conceptAndCoding.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "A", 20, 10000, "Male");
        Employee employee2 = new Employee(2, "B", 10, 20000, "FeMale");
        Employee employee3 = new Employee(3, "C", 30, 15000, "Male");
        Employee employee4 = new Employee(4, "D", 15, 30000, "FeMale");
        Employee employee5 = new Employee(5, "E", 40, 110000, "Male");
        Employee employee6 = new Employee(6, "F", 44, 9000, "Male");
        Employee employee7 = new Employee(7, "G", 66, 80000, "Male");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

//        int  salary = employeeList.stream()
//                .filter(employee -> "Male".equals(employee.getGender()))
//                .mapToDouble(employee -> employee.salary)
//                .sorted()
//                .skip(2)
//                .findFirst().orElse(0);

//        System.out.println(salary);
    }
}
