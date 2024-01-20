package conceptAndCoding.java8;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOverview {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();

//        salaryList.add(3000);
//        salaryList.add(4100);
//        salaryList.add(9000);
//        salaryList.add(1000);
//        salaryList.add(3500);
//        salaryList.add(5000);

//        int x = salaryList.stream().sorted(Comparator.reverseOrder()).peek((Integer a) -> System.out.println(a)).skip(2).findFirst().get();
//        System.out.println(x);

        salaryList.add(5000);
        salaryList.add(5000);
        salaryList.add(5000);
        salaryList.add(5000);

        Optional<Integer> mini = salaryList.stream().map((Integer a) -> -1*a).max((Integer x, Integer y) -> x-y);
        System.out.println(mini);



//
//        int count=0;
//
//        for (int i=0; i<salaryList.size(); i++){
//            if (salaryList.get(i)>3000)
//                count++;
//        }
//
//        long output = salaryList.stream().filter((Integer sal) -> sal>3000).count();



        /*
        Different ways to create a stream:-
        1.From collection:-
        List<Integer> salaryList = Arrays.asList(3000,4100,9000,1000,3500);
        Stream<Integer> salaryFromIntegerList = salaryList.stream();

        2.from array:-
        Integer[] salaryArray = {3000,4100,9000,1000,3500};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArray);

        3.From static method:-
        Stream<Integer> streamFromStaticMethod = Stream.of(1000,3550,4000,9000);

        4.from Stream Builder:-
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1000).add(9000).add(3500);
        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();

        5.from Stream Iterate:-
        Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n) -> n+5000).limit(5);


        //Different intermediate Operation:-
        we chain multiple intermediate operations together to perform more complex
        processing before applying terminal operation to produce the result.


        filter(Predicate<T> predicate): Filters the elements based on a given
        predicate and returns a new stream containing only the elements that match the predicate.

        map(Function<T, R> mapper): Transforms each element of the stream using
         the provided function and returns a new stream of transformed elements.

        flatMap(Function<T, Stream<R>> mapper): Transforms each element into
         a stream of elements and then flattens these streams into a single stream.

        distinct(): Returns a stream with distinct elements (based on the equals method).

        sorted(): Sorts the elements in natural order. You can also provide a
         custom Comparator as an argument.

        peek(Consumer<T> action): Applies an action to each element as they are
         consumed from the stream, often used for debugging or logging.

        limit(long maxSize): Reduces the size of the stream to the specified number of elements.

        skip(long n): Skips the first n elements in the stream and returns a new stream
         with the remaining elements.

        takeWhile(Predicate<T> predicate): Returns the longest prefix of elements
         that match the given predicate.

        dropWhile(Predicate<T> predicate): Returns a stream that
         discards the longest prefix of elements that match the given predicate.

        mapToInt(ToIntFunction<T> mapper): Maps elements to int values, useful for primitive streams.

        mapToLong(ToLongFunction<T> mapper): Maps elements to long values, useful for primitive streams.

        mapToDouble(ToDoubleFunction<T> mapper): Maps elements to double values,
         useful for primitive streams.

        boxed(): Converts a primitive stream (e.g., IntStream, LongStream, DoubleStream) to a regular object stream.



        Different terminal operations of the stream:

        forEach(Consumer<T> action): Applies the provided action to each
         element in the stream. This is useful for performing an action
          on each element, such as printing or processing.

        toArray(): Collects the elements in the stream into an array and returns the array.

        reduce(BinaryOperator<T> accumulator): Reduces the elements in the
         stream to a single value by applying the provided binary operator.

        collect(Collector<T, A, R> collector): Performs a mutable reduction
         operation on the elements using a Collector.

        min(Comparator<T> comparator): Returns the minimum element in
         the stream based on the provided comparator.

        max(Comparator<T> comparator): Returns the maximum element in
         the stream based on the provided comparator.

        count(): Returns the count of elements in the stream.

        anyMatch(Predicate<T> predicate): Checks if any elements in the
         stream match the provided predicate. Returns a boolean.

        allMatch(Predicate<T> predicate): Checks if all elements in the
         stream match the provided predicate. Returns a boolean.

        noneMatch(Predicate<T> predicate): Checks if none of the elements
         in the stream match the provided predicate. Returns a boolean.

        findAny(): Returns an arbitrary element from the stream. Useful for parallel streams.

        findFirst(): Returns the first element in the stream.

        min(): Returns the minimum element in the stream based on natural order (if applicable).

        max(): Returns the maximum element in the stream based on natural order (if applicable).

        toList(): Collects the elements in the stream into a List.

        toSet(): Collects the elements in the stream into a Set.

        toMap(Function<T, K> keyMapper, Function<T, U> valueMapper):
        Collects the elements in the stream into a Map using the provided key and value mappers.

        toCollection(Supplier<C> collectionFactory): Collects the elements into
         a custom collection provided by the collectionFactory.

        summarizingInt(ToIntFunction<T> mapper): Returns a summary statistics object for
         int-valued elements (useful for statistics like count, sum, min, max, and average).

        joining(): Concatenates the CharSequence representation of elements into a single String.


        Parallel stream:-
        helps to perform operation on stream concurrently, taking advantage of multicore CPU.
        ParallelStream() method is used instead of regular method.
        internally it does:-
        task splitting:- It uses "spliterator" function to split the data to multiple chunks.
        task submission and parallel processing: uses fork-join pool technique.












         */
//
//        Stream<String> nameStream = Stream.of("hello", "everybody","how", "are", "you", "doing");
//        Stream<String> filterStream = nameStream.filter((String name) -> name.length()>2);
//        List<String> filteredNameList  = filterStream.collect(Collectors.toList());
//
//
//        Stream<String> mapStream = nameStream.map((String name) -> name.toUpperCase());
//
//        List<List<String>> sentenceList = Arrays.asList(
//                Arrays.asList("I", "love", "java"),
//                Arrays.asList("concept", "are","clear"),
//                Arrays.asList("its", "very","easy")
//        );
//
//        Stream<String> wordStream1 = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream());
//
//        Stream<String> wordStream2 = sentenceList.stream().
//                flatMap((List<String> sentence) -> sentence.stream().map((String value) -> value.toUpperCase()));
//
//
//
//        Integer[] arr = {1,5,2,7,4,4,2,0,9};
//
//        Stream<Integer> arrDistinct = Arrays.stream(arr).distinct();
//
//        Stream<Integer> arrSorted = Arrays.stream(arr).sorted();



















    }
}
