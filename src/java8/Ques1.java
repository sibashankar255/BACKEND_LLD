package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ques1 {
    /**
     * given an employee list , sort employees based on their salaries in desc order
     *
     * fetch top 3 salary from this.
     *
     * fetch all employees having salary less than 3rd highest salary
     *
     *
     *
     */

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "A",13,500));
        employeeList.add(new Employee(2, "B",11,4000));
        employeeList.add(new Employee(3, "C",12,1500));
        employeeList.add(new Employee(4, "A",11,1000));
        employeeList.add(new Employee(5, "C",10,3500));
        employeeList.add(new Employee(6, "C",13,400));


        List<Employee> sorted = employeeList.stream()
                .sorted((emp1,emp2) -> (int)(emp2.getSalary()-emp1.getSalary())).limit(3).collect(Collectors.toList());



        List<Employee> sorted1 = employeeList.stream()
                .sorted((emp1,emp2) -> (int)(emp2.getSalary()-emp1.getSalary())).skip(3).collect(Collectors.toList());


        System.out.println(sorted1.toString());

    }
}
