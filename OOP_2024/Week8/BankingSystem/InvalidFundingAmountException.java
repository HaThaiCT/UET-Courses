public class InvalidFundingAmountException extends BankException {

    /**
     * ht.
     * @param amount 1
     */
    public InvalidFundingAmountException(double amount) {
        super(String.format("Số tiền không hợp lệ: $%.2f", amount));
    }
}
