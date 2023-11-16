package multithrading;

public class NumberPrinterThread extends Thread{
////    public NumberPrinterThread(String name) {
////        super(name);
////    }
//
//    @Override
//    public void run() {
//        // Printing numbers from 1 to 100
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//        }
//    }
    private static int count = 1;
    private static final int MAX_COUNT = 10;
    private Object lock;

    public NumberPrinterThread(String name, Object lock) {
        super(name);
        this.lock = lock;
    }

    @Override
    public void run() {
        while (count <= MAX_COUNT) {
            synchronized (lock) {
                // Check if it's this thread's turn to print
                if (Thread.currentThread().getName().equals("Thread-1") && count % 2 == 1
                        || Thread.currentThread().getName().equals("Thread-2") && count % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + count);
                    count++;

                    // Notify the other thread to take its turn
                    lock.notify();
                } else {
                    try {
                        // Wait if it's not this thread's turn
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
