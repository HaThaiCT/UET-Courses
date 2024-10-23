public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

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

    public void doWithdrawing(double amount) {

    }
}
