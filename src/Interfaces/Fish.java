package Interfaces;

public class Fish implements Animal{

    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("fish eats");
    }

    /**
     *
     */
    @Override
    public void sleep() {
        System.out.println("fish sleep");
    }

    /**
     *
     */
    @Override
    public void walk() {
        System.out.println("fish doesn't walk");
    }
}
