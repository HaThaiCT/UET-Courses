public class InsufficientFundsException extends BankException {

    /**
     * ht.
     * @param amount 1
     */
    public InsufficientFundsException(double amount) {
        super(String.format("Số dư tài khoản không đủ $%.2f để thực hiện giao dịch.", amount));
    }
}
