package DesignPattern.singleton;

public class DBConn {
    String url;
    String uname;
    String password;

//    DBConn instance=null;
//
//    private DBConn(){
//    }
//
//    public static DBConn createInstance(){
//        if (this.instance==null){
//            return instance=new DBConn();
//        }
//        return this.instance;
//    }


    //////////////////////////////////////////////////////////////////////////////////////

    static DBConn instance = new DBConn();

    private DBConn(){
    }

    private static DBConn createInstance(){
        return instance;
    }



}
