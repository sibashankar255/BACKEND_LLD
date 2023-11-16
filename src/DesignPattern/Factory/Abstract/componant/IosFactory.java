package DesignPattern.Factory.Abstract.componant;

import DesignPattern.Factory.Abstract.componant.Button.IosButton;
import DesignPattern.Factory.Abstract.componant.Menu.IosMenu;


public class IosFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
