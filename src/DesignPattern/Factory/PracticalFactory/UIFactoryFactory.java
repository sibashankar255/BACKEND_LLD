package DesignPattern.Factory.PracticalFactory;

import DesignPattern.Factory.Abstract.componant.AndroidFactory;
import DesignPattern.Factory.Abstract.componant.IosFactory;
import DesignPattern.Factory.Abstract.componant.UIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryPlatform(String platform){
        if (platform.equals("android")){
            return new AndroidFactory();
        }else if (platform.equals("ios")){
            return new IosFactory();
        }
        return null;
    }
}
