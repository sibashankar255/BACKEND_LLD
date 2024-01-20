package multithrading.monitorLocking;

public class SharedItem {
    boolean isItemPresent=false;
    public synchronized void addItem(){
        isItemPresent=true;
        System.out.println("produce thread calling the notify method");
        notifyAll();
    }

    public synchronized void consumeItem(){

        System.out.println("consumer thread inside");
        if (!isItemPresent){
            try {
                System.out.println("consumer thread waiting");
                wait(); // it will release the monitor lock
            }catch (Exception e){
                //
            }
        }
        isItemPresent=false;
        System.out.println("consumer consumed the item");
    }

}
