package DesignPattern.overview.structural.flyWeight;

import java.util.AbstractMap;
import java.util.Map;

public class FlyWeight {
    private static final String color[] = {"green", "yellow", "pink"};
    private static final Map<String, String> urlMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<String,String>("green","url1"),
            new AbstractMap.SimpleEntry<String,String>("yellow","url2"),
            new AbstractMap.SimpleEntry<String,String>("pink","url3")
    );

    public static void main(String[] args) {

    }
}
