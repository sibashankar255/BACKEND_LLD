package DesignPattern.Factory.Abstract.componant;

public class Flutter {

    public void setTheme(){
        System.out.println("setting theme in both ios and android..");
    }

    public UIFactory createUIFactory(String platform){
        if (platform.equals("android")){
            return new AndroidFactory();
        }else if (platform.equals("ios")){
            return new IosFactory();
        }
        return null;
    }

}
