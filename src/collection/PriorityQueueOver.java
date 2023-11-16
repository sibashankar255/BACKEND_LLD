package collection;
import java.util.*;
public class PriorityQueueOver {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer a,Integer b) -> (b-a) );

    }
}
