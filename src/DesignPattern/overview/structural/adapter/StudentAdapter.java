package DesignPattern.overview.structural.adapter;

public class StudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public StudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent= schoolStudent;
    }

    @Override
    public String getName() {
        return this.schoolStudent.getFirstName();
    }

    @Override
    public String surname() {
        return this.schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return this.schoolStudent.getEmail();
    }

    @Override
    public String toString() {
        return "StudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}
