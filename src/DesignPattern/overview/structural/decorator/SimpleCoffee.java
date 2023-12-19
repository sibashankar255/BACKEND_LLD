package DesignPattern.overview.structural.decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "simple coffee";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
