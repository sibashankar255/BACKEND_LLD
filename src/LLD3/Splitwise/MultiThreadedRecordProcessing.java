package LLD3.Splitwise;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MultiThreadedRecordProcessing {
    public static void main(String[] args) {
        // Example: Creating a list of 100 records
        List<Record> recordList = createRecordList(100);
        // Number of threads to create
        int numThreads = 10;
        // Create a fixed-size thread pool with the desired number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        // Calculate the size of each batch
        int batchSize = recordList.size() / numThreads;
        // Process records using multiple threads
        for (int i = 0; i < numThreads; i++) {
            int startIndex = i * batchSize;
            int endIndex = (i + 1) * batchSize;
            // Create a subList for each thread
            List<Record> subList = recordList.subList(startIndex, endIndex);
            // Submit a task for each thread to process its subList
            executorService.submit(() -> processRecords(subList));
        }
        // Shutdown the executor service when done
        executorService.shutdown();
    }

    // Example method to process a list of records
    private static void processRecords(List<Record> records) {
        for (Record record : records) {
            // Perform processing logic for each record
            System.out.println(Thread.currentThread().getName() + " processing record: " + record);
        }
    }
    // Example Record class
    private static class Record {
        private final int id;
        public Record(int id) {
            this.id = id;
        }
        @Override
        public String toString() {
            return "Record{" + "id=" + id + '}';
        }
    }
    // Example method to create a list of records
    private static List<Record> createRecordList(int size) {
        List<Record> recordList = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            recordList.add(new Record(i));
        }return recordList;
    }
}

