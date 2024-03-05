package ChainOfResponsibility;

public class PaypalHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount<1500)
        {
            System.out.println("Processed by Paypal amount = Rs."+amount);
        }
        else
        {
            next.handlePayment(amount);
        }
    }
}
