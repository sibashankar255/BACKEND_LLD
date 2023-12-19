package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Default {
    /**
     * given an employee DB fetch employee by ID and return the name of employee. if its not present
     * return default name using java 8.
     *
     * the orElse() method is used to retrieve the value wrapped inside an optional instance.
     * it takes one parameter, which acts as a default value. the orElse method returns the wrapped value if
     * its present , and its argument otherwise.
     *
     * String name = Optional.ofNullable(nullName).orElse("Anonymous");
     *
     * String name = Optional.ofNullable(nullName).orElseGet("Anonymous");
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



//        String name = Optional.ofNullable().orElse("Anonymous");

    }
}
