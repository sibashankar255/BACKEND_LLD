package java8;

import java.util.*;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Overview {

    //functional interface:-
    //runnable
    //callable
    //comparator
    //comparable
    //Iterable

    //Consumer<T> :-
    //void accept(T t)
    //this method can do some operation on a parameter and return nothing

    //BiConsumer<T U> :-
    //void accept(T,U)

    //Predicate<T>
    //boolean test(T t)

    //BiPredicate

    //Function<T,U>

    Consumer<String> consumer = (a) -> {
        System.out.println(a);
    };

//    Predicate<String> predicate = (a) -> {
//        return a.length() >10;
//    };



    //what are streams
    //wrapper over the datasource -> list . map, array, file etc



    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5};

        Stream<Integer> streamArray = Stream.of(array);

        Predicate<Integer> predicate = (a) -> {
            return a>3;
        };

//        System.out.println(streamArray.filter(predicate).toList());

        //map method of stream, simply applies a function to all the
        //elements of a stream

        System.out.println(
                streamArray
                        .filter(a -> a%2==1)
                        .map(a -> a*a)
                        .toList()
        );

        //

        Function<Integer, Integer> function = (a) -> {
            return  a*a;
        };


    }
}
