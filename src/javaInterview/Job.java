package javaInterview;

 interface Job {

     default void add(){
         System.out.println("default method");
     }
     static void print() {
         System.out.println("static method");
     }

     void instanceMethod();
 }
