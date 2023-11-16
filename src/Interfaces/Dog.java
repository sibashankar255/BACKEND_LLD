package Interfaces;

public class Dog implements Animal{
    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("dog eats");
    }

    /**
     *
     */
    @Override
    public void sleep() {
        System.out.println("dog sleep");
    }

    /**
     *
     */
    @Override
    public void walk() {
        System.out.println("dog walk");
    }
}
