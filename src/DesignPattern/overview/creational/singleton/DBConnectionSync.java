package DesignPattern.overview.creational.singleton;

public class DBConnectionSync {
    private static DBConnectionSync dbConnectionSyncObj;

    private DBConnectionSync(){
    }

    synchronized public static DBConnectionSync getInstance(){
        if (dbConnectionSyncObj==null){
            dbConnectionSyncObj = new DBConnectionSync();
        }
        return dbConnectionSyncObj;
    }
}
