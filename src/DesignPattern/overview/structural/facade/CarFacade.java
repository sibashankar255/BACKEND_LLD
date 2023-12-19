package DesignPattern.overview.structural.facade;

public class CarFacade {
    private Engine engine;
    private AirConditioner airConditioner;
    private NavigationSystem navigationSystem;

    public CarFacade() {
        this.engine = new Engine();
        this.airConditioner = new AirConditioner();
        this.navigationSystem = new NavigationSystem();
    }

    public void startCar(){
        engine.start();
        airConditioner.turnOn();
        navigationSystem.activate();
        System.out.println("car is ready to go");
    }

    public void stopCar(){
        navigationSystem.deactivate();
        airConditioner.turnOff();
        engine.stop();
        System.out.println("car stopped");
    }


}
