package DesignPattern.PrototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> studentMap = new HashMap<>();

    //inserts the prototype into map
    void register(String key, Student student){
        studentMap.put(key, student);
    }

    //returns a prototype from the map
    Student get(String key){
        return studentMap.get(key);
    }
}
