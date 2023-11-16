package Inheritance;

public class Client {
    public static void main(String[] args) {
        User user  = new User();
        user.emailId ="abc@gmail.com";
        user.password="asdfgh";

        Student student = new Student();
        student.login();

    }
}
