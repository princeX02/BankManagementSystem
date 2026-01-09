package transaction;

public class WithdrawTransaction implements Transaction {

    @Override
    public void process() {
        System.out.println("Withdrawal successful");
    }
}
