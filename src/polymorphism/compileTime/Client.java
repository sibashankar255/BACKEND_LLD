package polymorphism.compileTime;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,11);//compile time polymorphism

    }
}
