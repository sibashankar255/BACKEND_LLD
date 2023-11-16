package DesignPattern.Factory.Abstract.componant.Button;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {

        System.out.println("changing the size");
    }
}
