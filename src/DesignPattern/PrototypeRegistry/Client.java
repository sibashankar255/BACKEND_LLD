package DesignPattern.PrototypeRegistry;

public class Client {
    public static void main(String[] args) {


        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student copy = registry.get("wed_13_sep").clone();

        Student isCopy = registry.get("wed_13_sep_is").clone();

        System.out.println(copy);


    }


    private static void fillRegistry(StudentRegistry registry){
        Student original = new Student();
        original.setBatch("august");
        original.setAverageBatchPsp(78);

        registry.register("wed_13_sep",original);


        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("august");
        is.setAverageBatchPsp(70);

        registry.register("wed_13_sep_is",is);

    }
}
