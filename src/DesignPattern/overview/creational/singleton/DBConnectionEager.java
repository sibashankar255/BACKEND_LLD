package DesignPattern.overview.creational.singleton;

public class DBConnectionEager {

    //create a eager instance
    private static DBConnectionEager dbConnectionEagerObj = new DBConnectionEager();

    //restrict it from creating new object
    private DBConnectionEager(){
    }

    //through getInstance method return the instance created
    public static DBConnectionEager getInstance(){
        return dbConnectionEagerObj;
    }


}
