package DesignPattern.Factory.Abstract.componant;


import DesignPattern.Factory.Abstract.componant.Button.Button;
import DesignPattern.Factory.Abstract.componant.Menu.Menu;

public interface UIFactory {
     Button createButton();
     Menu createMenu();

}
