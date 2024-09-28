public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Contructor.
     * @param operation ten loai giao dich
     * @param amount so tien giao dich
     * @param balance so du con lai
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * set operation.
     * @param operation 19
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * get operation.
     * @return
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * set amount.
     * @param amount 19
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     *  get amount.
     * @return
     */
    public double getAmount() {
        return this.amount;
    }
    
    /**
     * set balance.
     * @param balance 19
     */
    public void setBalance(double balance) {
        this.balance = balance;
    } 

    /**
     * get balance.
     * @return
     */
    public double getBalance() {
        return this.balance;
    }
}