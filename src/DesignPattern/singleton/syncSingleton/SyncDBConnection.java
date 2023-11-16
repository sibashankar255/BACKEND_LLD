package DesignPattern.singleton.syncSingleton;


public class SyncDBConnection {

    private static SyncDBConnection syncDBConnection=null;

    private SyncDBConnection(){

    }

    public static synchronized SyncDBConnection createInstance(){
        if(syncDBConnection==null){
            syncDBConnection=new SyncDBConnection();
        }
        return syncDBConnection;
    }

    /*
    this will work in multithreaded env
    problem:- as it is taking lock on complete method., it will hamper performance
     */
}
