package DesignPattern.Builder;

import java.util.Objects;

public class Student {
    String name;
    String email;
    int age;
    String phoneNo;
    double psp;

    public Student(Helper helper) throws Exception {
        if (helper.getAge()>100){
            throw new Exception("Age should be less then 100");
        }
        if (helper.getPsp()<0){
            throw new Exception("psp should be > than 0");
        }
        this.age=helper.getAge();
        this.email=helper.getEmail();
        this.phoneNo=helper.phoneNo;
        this.name=helper.getName();
        this.psp=helper.getPsp();
    }

    public Helper getBuilder(){
        return new Helper();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return age == student.age && Double.compare(student.psp, psp) == 0 && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(phoneNo, student.phoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age, phoneNo, psp);
    }
}
