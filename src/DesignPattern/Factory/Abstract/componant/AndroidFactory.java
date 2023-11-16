package DesignPattern.Factory.Abstract.componant;

import DesignPattern.Factory.Abstract.componant.Button.AndroidButton;
import DesignPattern.Factory.Abstract.componant.Menu.AndroidMenu;
import DesignPattern.Factory.Abstract.componant.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
