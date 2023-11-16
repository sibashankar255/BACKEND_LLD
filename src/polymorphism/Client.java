package polymorphism;

public class Client {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.canWalk();
        a.color ="blue";
        a.name = "dog";

        Dog d = new Dog();

        //typecasting
        Dog x = (Dog)a;
        x.height=5;



    }
}