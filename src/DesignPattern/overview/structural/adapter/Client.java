package DesignPattern.overview.structural.adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        List<Student> studentList = studentClient.getStudent();

        System.out.println(studentList.toString());
    }
}
