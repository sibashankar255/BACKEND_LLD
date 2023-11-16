package Threading;

public class PrintNumberTask implements Runnable{

    private Integer noOfPrint;

    public PrintNumberTask(Integer noOfPrint) {

        this.noOfPrint = noOfPrint;
    }

    @Override
    public void run() {
        System.out.println("Number is: "+noOfPrint+" thread name is "+ Thread.currentThread().getName());
    }
}
