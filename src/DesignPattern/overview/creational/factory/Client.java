package DesignPattern.overview.creational.factory;

public class Client {
    public static void main(String[] args) {

        ShapeInstanceFactory factoryObj = new ShapeInstanceFactory();

        Shape circleObj = factoryObj.getShapeInstance("Square");

        circleObj.computeArea();
    }
}
