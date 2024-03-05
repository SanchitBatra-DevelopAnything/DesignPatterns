package ChainOfResponsibility;

public class BankHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount<500)
        {
            System.out.println("Processed by bank amount = Rs."+amount);
        }
        else
        {
            next.handlePayment(amount);
        }
    }
}
