package DesignPattern.overview.creational.prototype;

public class PrototypeWithClone {
    public static void main(String[] args) {
        Student obj = new Student(20, 76, "ram");

        Student cloneObj = (Student) obj.clone();
    }
}
