package multithrading.interview;

public class Overview {
    /**
     * 1.suppose we have 3 threads T1, T2, T3 .
     * how well you ensure that thread T2 will run after T1 and T3 after T2
     *
     * 2.why do we call start() method first , which in turn calls the run() method,
     * why not directly call run() method in our program?
     * alling start() is necessary to create a new thread and initiate its execution.
     * Directly calling run() does not provide the benefits of multithreading,
     * as it runs the code in the current thread without creating a new one.
     * Always use start() when working with threads in Java.
     *
     * 3. how will you awake a blocked thread in java?
     * using notify, notify all, join
     *
     * 4.which one is better to implement thread in java ?
     * extending Thread class or implementing Runnable
     *
     * implementing Runnable interface is a better way because
     * Thread class implements Runnable interface
     *
     * 5.what is the difference between class lock and object lock?
     *
     * 6.difference between t.start and t.run method?
     *
     * 7.what happened if we are not overriding run() method()?
     *
     * 8.what is the difference between wait() and sleep() in java?
     *
     * (life cycle)
     * new -> runnable -> running -> terminated
     * in sleep
     * from running state to sleep state then runnable state
     * in wait
     * from running state to wait state to another component state then runnable state
     *
     * 9.in which area of method will release lock?
     * notify, notify all , wait
     *
     * 10.what is the race condition ? how will find and solve race condition?
     * single resource is there and
     * T1, T2, T3, T4 trying to access the resource
     * Synchronization , lock
     *
     * 11.what are some common problems you have faced in multithreading environment?
     *
     * race condition
     * deadlock
     * livelock :- when all the threads are in a blocked state and execution is stopped
     * due to resource unavailability, then that situation is termed as livelock
     * starvation
     *
     * 12.print sequence using 3 threads in java?
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */

    public static void main(String[] args) {

        Thread T1 = new Thread(() -> {System.out.println("T1");});

        Thread T2 = new Thread( () ->{
            try {
                T1.join();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("T2");
        });

        Thread T3 = new Thread(() ->{
            try{
                T2.join();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("T3");
        });
        T2.start();
        T3.start();
        T1.start();

        Thread t11 = new Thread(() -> printNumbers(1));
        Thread t22 = new Thread(() -> {
            try {
                t11.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            printNumbers(2);
        });

        t11.start();
        t22.start();

    }

    private static void printNumbers(int threadId) {
        for (int i = threadId; i <= 10; i += 2) {
            System.out.println("Thread " + threadId + ": " + i);
        }
    }
}
