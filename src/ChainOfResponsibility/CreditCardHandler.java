package ChainOfResponsibility;

public class CreditCardHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount<1000)
        {
            System.out.println("Processed by cc amount = Rs."+amount);
        }
        else
        {
            next.handlePayment(amount);
        }
    }
}
