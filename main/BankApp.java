package main;

import model.*;
import service.BankService;

public class BankApp {

    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(101, "Prince", 10000);
        Account acc2 = new CurrentAccount(102, "Rahul", 20000);

        acc1.deposit(3000);
        acc1.withdraw(2000);

        BankService service = new BankService();
        service.showAccountDetails(acc1);
        service.showAccountDetails(acc2);
    }
}
