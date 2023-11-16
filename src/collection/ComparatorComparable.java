package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ComparatorComparable {

    public static void main(String[] args) {

        Integer[] arr = {17,5,6,1,0,3};

        Arrays.sort(arr, (Integer a, Integer b) -> a-b);

        Arrays.sort(arr);


        Car[] carArray = new Car[3];
        carArray[0] = new Car("suv", "petrol");
        carArray[1] = new Car("sedan", "diesel");
        carArray[2] = new Car("hatch", "cng");

//        Arrays.sort(carArray); it gives error of comparable

        Arrays.sort(carArray,(Car car1, Car car2) -> car2.type.compareTo(car1.type) );


        Map<Integer,String> stringHashMap = new HashMap<>();

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();



    }
}

