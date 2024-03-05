package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        PaymentHandler one = new BankHandler();
        PaymentHandler two = new CreditCardHandler();
        PaymentHandler three = new PaypalHandler();

        one.setNext(two);
        two.setNext(three);

        one.handlePayment(600);
        one.handlePayment(20);
        one.handlePayment(1400);
    }
}
