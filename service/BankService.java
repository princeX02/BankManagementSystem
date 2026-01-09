package service;

import model.Account;

public class BankService {

    public void showAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Holder Name: " + account.getHolderName());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Interest: " + account.calculateInterest());
    }
}
