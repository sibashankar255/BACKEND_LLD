package DesignPattern.overview.structural.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription());
        System.out.println(simpleCoffee.cost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription());
        System.out.println(milkCoffee.cost());

        Coffee milkSugarCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(milkSugarCoffee.getDescription());
        System.out.println(milkSugarCoffee.cost());
    }
}
