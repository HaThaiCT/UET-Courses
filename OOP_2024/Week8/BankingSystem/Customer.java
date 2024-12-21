import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * ht.
     */
    public Customer(){}

    /**
     * ht.
     * @param idNumber 1
     * @param fullName 1
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * ht.
     * @return
     */
    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    /**
     * ht.
     * @param account 1
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * ht.
     * @param account 1
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * ht.
     * @return
     */
    public long getIdNumber() {
        return this.idNumber;
    }

    /**
     * ht.
     * @param idNumber 1
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * ht.
     * @return
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * ht.
     * @param fullName 1
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * ht.
     * @return
     */
    public List<Account> getAccountList() {
        return this.accountList;
    }
}
