import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * ht.
     */
    public Account(){}

    /**
     * ht.
     * @param accountNumber 1
     * @param balance 1
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * ht.
     * @return
     */
    public long getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * ht.
     * @return
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * rut tien.
     * @param amount 1
     */
    public void doWithdrawing(double amount) throws
            InvalidFundingAmountException, InsufficientFundsException {
            if (amount <= 0) {
                throw new InvalidFundingAmountException(amount);
            }
            if (balance < amount) {
                throw new InsufficientFundsException(amount);

            }
            balance -= amount;
    }

    /**
     * nap tien.
     * @param amount 1
     * @throws InvalidFundingAmountException 1
     */
    protected void doDepositing(double amount) throws InvalidFundingAmountException  {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        balance += amount;

    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * ht.
     * @return
     */
    public String getTransactionHistory() {
        StringBuilder history = new StringBuilder();
        history.append("Lịch sử giao dịch của tài khoản ").append(accountNumber).append(":\n");
        for (Transaction transaction : transactionList) {
            history.append(transaction.getTransactionSummary()).append(".\n");
        }
        return history.toString();
    }

    /**
     * ht.
     * @param transaction 1
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * thai.
     * @param obj 1
     * @return
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return this.accountNumber == account.accountNumber;
    }

    /**
     * ht.
     * @return
     */
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
