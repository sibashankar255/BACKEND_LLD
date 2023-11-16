package DesignPattern.singleton;

import DesignPattern.singleton.eagerloading.EagerDBConnection;

public class Client {

    public static void main(String[] args) {


        DBConnection one = DBConnection.createInstance();
        DBConnection two = DBConnection.createInstance();

//        System.out.println("first object"+ one);
//        System.out.println("second object"+ two);

        EagerDBConnection eagerDBConnection = EagerDBConnection.createInstance();
        EagerDBConnection eagerDBConnection1 = EagerDBConnection.createInstance();

        System.out.println("first object"+ eagerDBConnection);
        System.out.println("second object"+ eagerDBConnection1);



    }



}
