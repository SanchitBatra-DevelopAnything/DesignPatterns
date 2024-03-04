package Proxy;

public class Client {

    public static void main(String[] args) {
        Account acc = new ATM(); //proxy that internally has the bankAccount.
        acc.withdraw();
        acc.getAccountNumber();
    }
}
