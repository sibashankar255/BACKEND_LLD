package DesignPattern.command.with;

public class TurnAcOnCommand implements ICommand{
    AirConditioner ac;
    TurnAcOnCommand(AirConditioner ac){
        this.ac=ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
