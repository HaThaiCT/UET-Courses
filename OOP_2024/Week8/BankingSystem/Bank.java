import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * ht.
     * @param inputStream 1
     * @throws IOException 1
     */
    public void readCustomerList(InputStream inputStream) {
        String line;
        Customer currentCustomer = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }

                if (line.matches(".*\\d{9}")) {
                    String[] parts = line.split(" ");
                    StringBuilder fullName = new StringBuilder();
                    for (int i = 0; i < parts.length - 1; i++) {
                        fullName.append(parts[i]).append(" ");
                    }
                    String name = fullName.toString().trim();
                    long idNumber = Long.parseLong(parts[parts.length - 1]);
                    currentCustomer = new Customer(idNumber, name);
                    customerList.add(currentCustomer);
                } else if (currentCustomer != null) {
                    String[] accountParts = line.split(" ");
                    long accountNumber = Long.parseLong(accountParts[0]);
                    String accountType = accountParts[1];
                    double balance = Double.parseDouble(accountParts[2]);

                    Account account = null;
                    if (accountType.equals("CHECKING")) {
                        account = new CheckingAccount(accountNumber, balance);
                    } else if (accountType.equals("SAVINGS")) {
                        account = new SavingsAccount(accountNumber, balance);
                    }
                    currentCustomer.addAccount(account);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * ht.
     * @return
     */
    public String getCustomersInfoByIdOrder() {
        customerList.sort((c1, c2) ->  Long.compare(c1.getIdNumber(), c2.getIdNumber()));
        StringBuilder info = new StringBuilder();
        for (Customer customer : customerList) {
            info.append(customer.getCustomerInfo()).append("\n");
        }
        return info.toString();
    }

    /**
     * ht.
     * @return
     */
    public String getCustomersInfoByNameOrder() {
        customerList.sort((c1, c2) -> c1.getFullName().compareTo(c2.getFullName()));
        StringBuilder info = new StringBuilder();
        for (Customer customer : customerList) {
            info.append(customer.getCustomerInfo()).append("\n");
        }
        return info.toString();
    }

    /**
     * ht.
     * @return
     */
    public List<Customer> getCustomerList() {
        return this.customerList;
    }
}
