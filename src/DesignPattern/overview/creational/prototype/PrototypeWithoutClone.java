package DesignPattern.overview.creational.prototype;

public class PrototypeWithoutClone {
    public static void main(String[] args) {

        Student obj = new Student(20, 76, "ram");



        //can not write the code like below:-
//        Student cloneObj = new Student();
//        cloneObj.name= obj.name;
//        cloneObj.age=obj.age;
//        cloneObj.rollnumber = obj.rollnumber;



    }
}
