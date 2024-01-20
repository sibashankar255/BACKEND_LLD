package DesignPattern.template;

public class PayToFriendFlow extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("validating for friend");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate the fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount");
    }


}
