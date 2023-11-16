package DesignPattern.PrototypeRegistry;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;


    public Student(Student s){
        this.age=s.age;
        this.averageBatchPsp =s.averageBatchPsp;
        this.name=s.name;
        this.batch=s.batch;
        this.studentPsp=s.studentPsp;
    }

    public Student() {

    }

    public Student clone(){
        return new Student(this);
    }

//    public Student clone(){
//        Student s = new Student();
//        s.age=this.age;
//        s.name=this.name;
//        s.batch=this.batch;
//        s.averageBatchPsp=this.averageBatchPsp;
//        s.studentPsp = this.studentPsp;
//        return s;
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }


//
//    @Override
//    public Student clone() {
//        return null;
//    }
}
