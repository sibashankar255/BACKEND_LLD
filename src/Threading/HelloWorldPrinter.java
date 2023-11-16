package Threading;

public class HelloWorldPrinter implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("hello world: "+Thread.currentThread().getName());
    }


}
