package Threading;

public class Overview {

    public static void main(String[] args) {
        System.out.println("Hello world: " + Thread.currentThread().getName());

        HelloWorldPrinter task = new HelloWorldPrinter();

        //create a thread
        Thread t = new Thread(task);
        t.start();


    }

    //program :- set of instructions that we want to run(disk)

    //process :- program is execution(RAM)

    //cpu <-> RAM <-> disk

    //program -> install -> (run) ----> process

    //Thread -> lightweight process

    //Thread is the smallest unit of CPU execution

    //core -> dual/octa/quad
    //each core takes a thread at one time
    //1 core executes -> 1 thread(task) at a time

    //Program -> process -> multiple threads

    //"hello World" -> at least 1 thread



    //concurrency vs parallelism
    //concurrency: multiple things executing in system, might not at once
    //parallelism: concurrency + running at same time

    //context switching:
    //switching between multiple threads
    //PCB - process control block:- it stores the
    //code
    //variable
    //process_id
    //memory usage
    //resource
    //last line executed -> program counter

    //context switching -> time taken by cpu to save & get data from PCB


    //core
    //thread1 -> 50%
    //thread2 -> 30%
    //thread3 -> 5%
    //thread4 -> 90%


    //how to create threads in real life

    //1.In multithreading code:-
    //never think in terms of creating thread.
    //instead think in terms of task

    //2. "print hello" - from a diff thread
    //class HelloWorldPrinter

    //3.implement runnable interface in your class

    //4.provide defination
    //run(){
    // sop{"hello world"};

    //5.create thread and execute



    //executor service:- framework for thread pool
    //thread pool:- a lot of threads will stay at a place
    //Creating a new thread for every task can be inefficient due to the overhead
    // of thread creation and management. Java's Executor framework provides thread pools for
    // efficient reuse of threads.

    //callable
    //merge sort

    //FUTURE:-
    //object in multithreading env

    //whenever using callables use FUTURE<V> as well

    //declaring method of a class as SYNC:-
    //only 1 thread can access any sync method on that object


    //SEMAPHORES:-
    //allows multiple threads in critical section

    //Concurrent DataStructure
    //1.Atomic data type:- thread safe data type
    //

    //2.concurrent Hashmaps:-
    //
    //how hashmap work in java:-
    //internally uses -> linkedList + Array
    //if 1 thread works on hashmap, then it locks whole map and other thread can't access the hashmap
    // no 2 thread works in multithreaded env

    //concurrent hashmap provides faster performance in concurrent env. takes lock on
    //individual bucket



    //DEADLOCK:-

    //prevention

    //recovery/ignore
    //1.wait for turnout
    //   call method, wait
    //   if no response -> assume deadlock
    //   kill thread and restart
    //2.graph cyclic detection
    //identify deadlock by building graph
    //













}
