package multithrading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        //if buffer is full wait for the consumer to consume item
        while (sharedBuffer.size() ==bufferSize){
            System.out.println("buffer is full, producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("produced: "+item);
        //notify the consumer that there are items to consume now
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        //buffer is empty, wait for the producer to produce items
        while (sharedBuffer.isEmpty()){
            System.out.println("buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("consumed item: "+ item);
        //notify the producer that there is a space in the buffer now
        notify();
        return item;
    }



}
