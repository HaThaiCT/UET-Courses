import javax.naming.InsufficientResourcesException;

public class SavingsAccount extends Account {

    public static final double WITHDRAW_LIMIT = 1000.0;

    /**
     * ht.
     * @param accountNumber 1
     * @param balance 1
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * ht.
     * @param amount 1
     */
    public void withdraw(double amount) {
        try {
            if (amount > WITHDRAW_LIMIT) {
                throw new IllegalArgumentException("Rút quá 1000");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            if (this.balance < 5000.0) {
                throw new InsufficientFundsException(5000);
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            doWithdrawing(amount);
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return;
        }
        addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
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
        addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                amount, balance - amount, balance));
    }

}
