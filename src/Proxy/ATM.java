package Proxy;

public class ATM implements Account{
    //proxy to bankAccount

    @Override
    public void withdraw() {

        //all kinds of validations can be done here on proxy , and then we hit the bank.
        //saves load on bank.
        System.out.println("Validatingggggggg.......... before i send you");
        BankAcccount acc = new BankAcccount();
        acc.withdraw();
    }

    @Override
    public void getAccountNumber() {
        BankAcccount acc = new BankAcccount();
        acc.getAccountNumber();
    }
}
