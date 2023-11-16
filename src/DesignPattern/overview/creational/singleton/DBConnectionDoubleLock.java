package DesignPattern.overview.creational.singleton;

public class DBConnectionDoubleLock {
    private static DBConnectionDoubleLock dbConnectionDoubleLockObj;

    private DBConnectionDoubleLock(){
    }

    public static DBConnectionDoubleLock getInstance(){

        if (dbConnectionDoubleLockObj==null){
            synchronized (DBConnectionDoubleLock.class){
                if (dbConnectionDoubleLockObj==null){
                    dbConnectionDoubleLockObj = new DBConnectionDoubleLock();
                }
            }
        }
        return dbConnectionDoubleLockObj;
    }
}
