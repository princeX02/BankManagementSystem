package model;

public class SavingsAccount extends Account {

    public SavingsAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}
