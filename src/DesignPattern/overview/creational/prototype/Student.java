package DesignPattern.overview.creational.prototype;

public class Student implements Prototype {
    int age;
    private int rollNumber;
    String name;

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public Prototype clone() {
        return new Student(age,rollNumber,name);
    }
}
