package Proxy;

public class BankAcccount implements Account{
    @Override
    public void withdraw() {
        System.out.println("Request for withdraw money");
    }

    @Override
    public void getAccountNumber() {
        System.out.println("ACC NUMBER IS : ");
    }
}
