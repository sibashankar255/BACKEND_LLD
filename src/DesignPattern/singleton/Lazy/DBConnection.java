package DesignPattern.singleton.Lazy;

public class DBConnection {
    private static DBConnection dbConnection=null;
    private DBConnection(){
    }

    public static DBConnection createInstance(){
        if(dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }
}

//public class LazySingleton {
//    private static LazySingleton instance;
//
//    private LazySingleton() {
//        // Private constructor to prevent instantiation
//    }
//
//    public static LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }
//}
