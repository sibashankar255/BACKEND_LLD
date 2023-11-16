package Threading.produceConsumerSemaphore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Queue<Shirt> store = new ConcurrentLinkedDeque<>();
        int maxSizeOfStore =20;

        Semaphore semaphoreForProducer = new Semaphore(maxSizeOfStore);
        Semaphore semaphoreForConsumer = new Semaphore(0);


        //tailors
        Producer producer1 = new Producer(store,maxSizeOfStore,"p1",semaphoreForProducer,semaphoreForConsumer);
        Producer producer2 = new Producer(store,maxSizeOfStore,"p2",semaphoreForProducer,semaphoreForConsumer);
        Producer producer3 = new Producer(store,maxSizeOfStore,"p2",semaphoreForProducer,semaphoreForConsumer);

        //customers
        Consumer consumer1 = new Consumer(store,"c1",semaphoreForProducer,semaphoreForConsumer);
        Consumer consumer2 = new Consumer(store,"c2",semaphoreForProducer,semaphoreForConsumer);
        Consumer consumer3 = new Consumer(store,"c3",semaphoreForProducer,semaphoreForConsumer);
        Consumer consumer4 = new Consumer(store,"c4",semaphoreForProducer,semaphoreForConsumer);

        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();

        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(consumer3).start();
        new Thread(consumer4).start();




    }
}
