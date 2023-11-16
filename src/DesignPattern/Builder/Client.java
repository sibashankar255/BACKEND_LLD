package DesignPattern.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Helper helper = new Helper("yash","yash@gamil.com", 10, "1234567890",10.2);

        Student student = new Student(helper);
        System.out.println(student);
    }
}
