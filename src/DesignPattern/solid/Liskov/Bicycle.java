package DesignPattern.solid.Liskov;

public class Bicycle implements Bike{

    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine");
    }

    @Override
    public void accelerate() {

    }
}
