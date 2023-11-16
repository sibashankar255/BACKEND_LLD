package Threading.synchronyzed;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
//    private Lock lock;

    public Subtractor(Count count) {
        this.count = count;
//        this.lock=lock;
    }

    @Override
    public void run() {
        for (int i=1; i<=10000; ++i){
//            System.out.println("Subtractor is taking lock..."+Thread.currentThread().getName());
//            lock.lock();
            synchronized (count){
                count.value-=1; //critical section
            }

//            System.out.println("Subtractor is releasing lock...");
//            lock.unlock();
        }
    }
}
