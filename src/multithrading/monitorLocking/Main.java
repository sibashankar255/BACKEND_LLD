package multithrading.monitorLocking;

public class Main {
    public static void main(String[] args) {

        SharedItem sharedItem = new SharedItem();
        Thread producerThread = new Thread(() -> {
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                //
            }
            sharedItem.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            sharedItem.consumeItem();
        });

        producerThread.start();
        consumerThread.start();


    }
}
