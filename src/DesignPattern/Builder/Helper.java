package DesignPattern.Builder;

public class Helper {
    String name;
    String email;
    int age;
    String phoneNo;
    double psp;

    public Helper(){
    }

    public Helper(String name, String email, int age, String phoneNo, double psp) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phoneNo = phoneNo;
        this.psp = psp;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public double getPsp() {
        return psp;
    }
}
