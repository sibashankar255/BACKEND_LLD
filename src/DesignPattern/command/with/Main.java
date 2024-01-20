package DesignPattern.command.with;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        MyRemoteControl remote = new MyRemoteControl();

        remote.setCommand(new TurnAcOnCommand(ac));
        remote.pressButton();
        remote.undo();
    }
}
