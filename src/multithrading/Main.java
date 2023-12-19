package multithrading;

public class Main {
    public static void main(String[] args) {
//        System.out.println("going inside main method: "+ Thread.currentThread().getName());
//        MultiThreadingLearning1 runnableObj = new MultiThreadingLearning1();
//        Thread thread = new Thread(runnableObj);
//        thread.start();
//        System.out.println("finish main method: "+Thread.currentThread().getName());

        System.out.println("going inside main method: "+ Thread.currentThread().getName());
        MultiThreadingLearning myThread = new MultiThreadingLearning();
        myThread.start();
        System.out.println("finish main method: "+Thread.currentThread().getName());

    }
}
