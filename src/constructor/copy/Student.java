package constructor.copy;

import java.security.PublicKey;

public class Student {
    String name;
    double psp;
    String emailId;

    public Student(){
    }

    public Student(String name, double psp, String emailId) {
        this.name = name;
        this.psp = psp;
        this.emailId = emailId;
    }

    public Student(Student old){
        name = old.name;
        psp = old.psp;
        emailId = old.emailId;

    }
}
