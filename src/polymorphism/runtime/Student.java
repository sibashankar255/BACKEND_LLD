package polymorphism.runtime;

public class Student extends User{

    String univ;
    double psp;

    public void canTalk(){
        super.canTalk();
        System.out.println("student can talk");
    }

    public void logIn(){

    }
}
