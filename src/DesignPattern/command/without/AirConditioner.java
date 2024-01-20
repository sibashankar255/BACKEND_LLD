package DesignPattern.command.without;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAC(){
        isOn =true;
        System.out.println("AC is on");
    }
    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is off");
    }

    public void setTemperature(int temp){
        this.temperature=temp;
        System.out.println("temperature changed to: "+temperature);
    }

}
