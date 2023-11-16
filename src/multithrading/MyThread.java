package multithrading;

class MyThread extends Thread{
    private Integer count=1;
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (count<=5){
            synchronized (count){
                System.out.println(Thread.currentThread().getName() + ": " + count++);
            }
            }

        }
    }
}

