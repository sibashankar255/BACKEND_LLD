package java8.functionalInterface;

import Threading.producerConsumer.Consumer;

public class Demo {
    public static void main(String[] args) {

        //1.way 1 create a class implementing the interface
        Foo foo = new FooImpl();
        foo.bar();
        foo.bar2();



        //2.way use anonymous classes
        Foo foo1 = new Foo() {
            @Override
            public void bar() {
                System.out.println("anonymous class");
            }
        };
        foo1.bar();

        //3.way 3 lambda
        Foo foo2 = () -> { System.out.println("using lambda function"); };
        foo2.bar();



        //runnable without lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running in thread" +Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        //runnable with lambda
        Thread thread2 = new Thread(() -> {
            System.out.println("running in thread" +Thread.currentThread().getName());
        });
        thread2.start();



    }
}
