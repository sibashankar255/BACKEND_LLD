package DesignPattern.overview.creational.singleton;

public class DBConnectionLazy {

    private static DBConnectionLazy connectionLazyObj;

    private DBConnectionLazy(){
    }

    public static DBConnectionLazy getInstance(){
        if (connectionLazyObj==null){
            connectionLazyObj=new DBConnectionLazy();
        }
        return connectionLazyObj;
    }
}
