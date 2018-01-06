package improvedBank;

/**
 * Created by Mujab on 12/16/17.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account acc;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
        firstName = "John";
        lastName = "Doe";
    }

    public void addAccount(double initialBalance) {
        acc = new Account();
        acc.accountId = "ACCT ID = " + Account.getNextId();
        acc.balance = initialBalance;
        acc.displayAccountDetails();
    }

    public void addAccount() {
        addAccount(100);
    }

    public Transaction addTransaction(String date, int amount, String merchant, String name, String type) {

        Transaction transaction = new Transaction();
        transaction.setDate(date);
        transaction.setAmount(amount);
        transaction.setMerchant(merchant);
        transaction.setName(name);
        transaction.setType(type);

        return transaction;
    }

    public void printTransactionDetails(Transaction transaction) {

        System.out.println("Transaction dates: " + transaction.getDate());
        System.out.println("Transaction amount: " + transaction.getAmount());
        System.out.println("Transaction merchant: " + transaction.getMerchant());
        System.out.println("Transaction name: " + transaction.getName());
        System.out.println("Transaction type: " + transaction.getType());
    }

    public void transferFund(int amount, int routingNumber, String accountNumber, String notes) {
        acc.transfer(amount, routingNumber, accountNumber, notes);
    }
}
