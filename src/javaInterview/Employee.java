package javaInterview;

public class Employee {


    public static void main(String[] args) {

        System.out.println(Company.a);
//        Job e1 = new Employee();

//        e1.instanceMethod();
        Job.print(); // in static, no need to call from an object, directly call method with the interface
//        e1.add(); // in default, no need of implementation of method

    }

//    @Override
//    public void instanceMethod() {
//        System.out.println("instance");
//    }
}
