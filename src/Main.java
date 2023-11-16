import constructor.copy.Student;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student();

        //s1 -> stored in stack memory

        //heap -> #1214 -> name, age, email
        //stack -> s1-> #1214


    }

    //copy constructor
    //new object of class which have same values as that of old one
    // Student s1 = new Student("yash", 21, "abc@gmail.com");

    //1.
    // s2 = new Student();
    //s2.name = s1.name;
    //s2.age = s1.age;

    //2.
    // s1 -> have
    //s2 = new Student(s1);
    //

    //how copies work in java
    //1.non-primitive(object/string)(Heap)
    //2.primitive(int/double/boolean)(stack)
    //

    //shallow copy:
    // created a new copy
    //internally they pointed to same location for attributes
    // they shared variables

    //deep copy:
    //where old and new object don't share data

    //in java is it easy to create deep copy
    //Student

    //java is pass by value
    // the pass value is address





}