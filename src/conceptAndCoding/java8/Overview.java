package conceptAndCoding.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Overview {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();
        salaryList.add(3000);
        salaryList.add(4000);
        salaryList.add(9000);
        salaryList.add(1000);
        salaryList.add(3500);
        salaryList.add(4500);

        int count=0;
        for (Integer salary : salaryList){
            if (salary>3000){
                count++;
            }
        }
        System.out.println(count);

        long output = salaryList.stream().filter((Integer sal) -> sal>3000).count();
        System.out.println(output);

        // different ways to create a stream
        //1. from collection
        Stream<Integer> streamFromIntegerList = salaryList.stream();

        //2.from array
        Integer[] salaryArray = {3000, };

        /**
         *
         * intermediate operation:-
         * 1.filter:-
         * filter(Predicate<? super P_OUT> predicate)
         *
         */

    }
}
