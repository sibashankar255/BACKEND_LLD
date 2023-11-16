package DesignPattern.singleton.doubleChecklock;

import DesignPattern.singleton.syncSingleton.SyncDBConnection;

public class DoubleCheckDBConnection {

    private static DoubleCheckDBConnection doubleCheckDBConnection=null;

    private DoubleCheckDBConnection(){

    }

    public static synchronized DoubleCheckDBConnection createInstance(){

        if (doubleCheckDBConnection==null){
            synchronized (DoubleCheckDBConnection.class){
                if (doubleCheckDBConnection==null){
                    doubleCheckDBConnection=new DoubleCheckDBConnection();
                }
            }
        }

        return doubleCheckDBConnection;
    }
}
