package Threading.produceConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Shirt> store;
    private String name;
    private Semaphore semaphoreForProducer;
    private Semaphore semaphoreForConsumer;

//    public Consumer(Queue<Shirt> store, String name) {
//        this.store = store;
//        this.name = name;
//    }

    public Consumer(Queue<Shirt> store, String name, Semaphore semaphoreForProducer, Semaphore semaphoreForConsumer) {

        this.store = store;
        this.name = name;
        this.semaphoreForProducer=semaphoreForProducer;
        this.semaphoreForConsumer=semaphoreForConsumer;
    }

    @Override
    public void run() {
        while (true){

            try {
                semaphoreForConsumer.acquire();
                store.remove();
                System.out.println(name +" consumed. left shirts count = "+ store.size());
                semaphoreForProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
    }
}
