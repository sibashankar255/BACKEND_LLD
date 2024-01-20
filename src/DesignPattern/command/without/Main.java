package DesignPattern.command.without;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        ac.turnOnAC();
        ac.setTemperature(24);
        ac.turnOffAC();
    }

    /**
     * Lack of abstraction:-
     * process of turning on AC is  simple, but if there are more steps,
     * client has to aware all of that which is not good
     *
     * Undo/Redo Functionality:-
     *
     * Difficult in code Maintenance:-
     *
     *
     */
}
