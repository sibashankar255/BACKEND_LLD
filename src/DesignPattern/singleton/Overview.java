package DesignPattern.singleton;

public class Overview {

    //allows us to create only 1 object at a time for any class that is singleton


    //multiple connection is actually waste of cpu usage
    //you can have only 1 connection object :- utilize the same
    //leads to better efficiency of the system

    //Need of singleton object :-
    //when creating same object is expensive and not useful.(when object remains same across system)

    //when not to use singleton design pattern:-
    //when data for object can be changed

    //singleton objects are immutable



    //in multithreaded env:-
    //eager loading:-

    //use locks in createInstance()

    //double check locking

    //1.create a private constructor
    //2.create static method
    //3.double check for instance



}
