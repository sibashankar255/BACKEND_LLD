package Threading.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> arraySort = List.of(3,4,1,2,5,6,22,55);

        ExecutorService es = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arraySort,es);
        Future<List<Integer>> sortedListFuture = es.submit(sorter);

        List<Integer> sortedList = sortedListFuture.get();//Blocking call

        for (Integer in :sortedList){
            System.out.println(in);
        }
    }
}
