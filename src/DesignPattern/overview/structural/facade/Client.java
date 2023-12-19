package DesignPattern.overview.structural.facade;

import collection.Car;

public class Client {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        System.out.println("starting the car--------------");
        carFacade.startCar();

        System.out.println("stopping the car--------------");
        carFacade.stopCar();
    }
}
