package java8.functionalInterface;

@FunctionalInterface
public interface Foo {

    //this ia an abstract method
    void bar();

    //not abstract
    default void bar2() {
        System.out.println("not abstract");
    }
}
