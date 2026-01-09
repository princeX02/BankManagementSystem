package transaction;

public class DepositTransaction implements Transaction {

    @Override
    public void process() {
        System.out.println("Deposit successful");
    }
}
