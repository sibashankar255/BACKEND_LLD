package Threading.producerConsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {

        Queue<Shirt> store = new ArrayDeque<>();
        int maxSizeOfStore =20;

        //tailors
        Producer producer1 = new Producer(store,maxSizeOfStore,"p1");
        Producer producer2 = new Producer(store,maxSizeOfStore,"p2");
        Producer producer3 = new Producer(store,maxSizeOfStore,"p2");

        //customers
        Consumer consumer1 = new Consumer(store,"c1");
        Consumer consumer2 = new Consumer(store,"c2");
        Consumer consumer3 = new Consumer(store,"c3");
        Consumer consumer4 = new Consumer(store,"c4");

        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();

        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(consumer3).start();
        new Thread(consumer4).start();




    }
}
