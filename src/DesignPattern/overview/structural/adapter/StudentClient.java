package DesignPattern.overview.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudent(){
        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("siba","sahu","abc@gmail.com");

        SchoolStudent schoolStudent = new SchoolStudent("shankar", "sahu", "xyz@gmail.com");

        students.add(collegeStudent);
//        students.add(schoolStudent); // it won't add because it is not compatible
//        with the interface so need to
        // create a StudentAdapter class and implement the Student interface in that
        //
        students.add(new StudentAdapter(schoolStudent));

        return students;
    }
}
