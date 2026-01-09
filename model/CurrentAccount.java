package model;

public class CurrentAccount extends Account {

    public CurrentAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
