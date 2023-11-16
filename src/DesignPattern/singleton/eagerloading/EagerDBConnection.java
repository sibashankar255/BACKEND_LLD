package DesignPattern.singleton.eagerloading;

import DesignPattern.singleton.DBConnection;

public class EagerDBConnection {
    private EagerDBConnection(){

    }

    private static EagerDBConnection eagerDBConnection = new EagerDBConnection();

    public static EagerDBConnection createInstance(){

        return eagerDBConnection;
    }

    /*
    problem:-
    many classes on app start could load to increase in app start time.
     */
}
