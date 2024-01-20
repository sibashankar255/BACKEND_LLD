package DesignPattern.template;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriendFlow();
        paymentFlow.sendMoney();
    }
}
