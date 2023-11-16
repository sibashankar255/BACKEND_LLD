package DesignPattern.Factory.PracticalFactory;

import DesignPattern.Factory.Abstract.componant.UIFactory;

public class Flutter {
    public void setTheme(){

        System.out.println("setting theme in both ios and android..");
    }

    public UIFactory createUIFactory(String platform){

        return UIFactoryFactory.getUIFactoryPlatform(platform);
    }
}
