package Threading;

public class Client {
    public static void main(String[] args) {
        System.out.println("Main thread is: "+Thread.currentThread().getName());

        for (int i=0; i<100; i++){
            PrintNumberTask task = new PrintNumberTask(i);
            Thread t = new Thread(task);

            t.start();
        }
    }
}
