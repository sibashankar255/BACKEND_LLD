package multithrading;

public class PrintNumbers {
    public static void main(String[] args) {
//        NumberPrinterThread thread1 = new NumberPrinterThread();
//        NumberPrinterThread thread2 = new NumberPrinterThread();
//
//        // Starting the threads
//        thread1.start();
//        thread2.start();

        Object lock = new Object();

        // Creating two threads
        NumberPrinterThread thread1 = new NumberPrinterThread("Thread-1", lock);
        NumberPrinterThread thread2 = new NumberPrinterThread("Thread-2", lock);

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
