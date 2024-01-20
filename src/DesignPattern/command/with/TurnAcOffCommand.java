package DesignPattern.command.with;

public class TurnAcOffCommand implements ICommand{
    AirConditioner ac;

    TurnAcOffCommand(AirConditioner ac){
        this.ac= ac;
    }

    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
