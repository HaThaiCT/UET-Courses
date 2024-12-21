import javax.naming.InsufficientResourcesException;
import javax.naming.InvalidNameException;

public class CheckingAccount extends Account {

    /**
     * ht.
     * @param accountNumber 1
     * @param balance 1
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * ht.
     * @param amount 1
     */
    public void withdraw(double amount) {

        try {
            doWithdrawing(amount);
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return;
        }

        addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
                amount, balance + amount, balance));
    }

    /**
     * ht.
     * @param amount 1
     */
    public void deposit(double amount) {
        try {
            doDepositing(amount);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
            return;
        }
        addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                amount, balance - amount, balance));
    }

}
