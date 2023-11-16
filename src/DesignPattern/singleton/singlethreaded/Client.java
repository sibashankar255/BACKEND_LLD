package DesignPattern.singleton.singlethreaded;

public class Client {

    public static void main(String[] args) {

        
        DBConnection one = DBConnection.createInstance();
        DBConnection two = DBConnection.createInstance();

        System.out.println("first object"+ one);
        System.out.println("second object"+ two);


    }



}
