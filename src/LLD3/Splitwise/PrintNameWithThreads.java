package LLD3.Splitwise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNameWithThreads {
    public static void main(String[] args) {
        // Creating instances of the Runnable implementation
        Runnable printSiba = new PrintName("Siba");
        Runnable printShankar = new PrintName("Shankar");
        Runnable printSahu = new PrintName("Sahu");

        // Creating threads
        Thread threadSiba = new Thread(printSiba);
        Thread threadShankar = new Thread(printShankar);
        Thread threadSahu = new Thread(printSahu);

        // Starting threads
        threadSiba.start();
        threadShankar.start();
        threadSahu.start();
    }

    // Runnable implementation to print a name
    static class PrintName implements Runnable {
        private final String name;

        public PrintName(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name);
        }
    }
}
