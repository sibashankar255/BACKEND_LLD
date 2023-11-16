package Inheritance.constructor;

public class D extends C{

    public D(){

    }

    public D(String x){
        super(x); //it will call parent constructor with given argument
        //should always be the 1st line in your child constructor
        System.out.println("constructor of D "+x);
    }
}
