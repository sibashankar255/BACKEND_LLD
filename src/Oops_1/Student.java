package Oops_1;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    private void display(){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old");
    }

    private void sayHello(String name2){
        System.out.println(name+ " says hello to "+name2);
    }
}
