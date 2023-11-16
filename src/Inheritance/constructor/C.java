package Inheritance.constructor;

public class C extends B{
    public C(){

    }
    public C(String x){
        System.out.println("constructor of C "+x);
    }

    public C(String x, String y){
        System.out.println("constructor of C: "+ x +" and "+y);
    }


}
