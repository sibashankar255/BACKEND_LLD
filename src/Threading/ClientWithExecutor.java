package Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientWithExecutor {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);

        for (int i=0; i<10;i++){
            PrintNumberTask task=new PrintNumberTask(i);
            es.submit(task);
        }
    }
}
