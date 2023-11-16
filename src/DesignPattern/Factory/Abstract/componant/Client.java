package DesignPattern.Factory.Abstract.componant;

import DesignPattern.Factory.Abstract.componant.Button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter= new Flutter();

        UIFactory af = flutter.createUIFactory("ios");

        Button b =af.createButton();
        b.changeSize();
    }
}
