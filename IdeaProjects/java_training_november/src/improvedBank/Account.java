package improvedBank;

/**
 * Created by Mujab on 12/16/17.
 */
public class Account {

    double balance;
    String accountId;
    static int nextId = 0;
    static final int ROUTING_NUMBER = 12345;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void transfer(double amount, int routingNumber, String accountNumber, String notes) {
        if (amount > balance) {
            System.out.println("Transfer amount cannot exceed actual balance");
        } else {
            balance = balance - amount;
            transferDetails(amount, routingNumber, accountNumber, notes);
        }
    }

    public void displayAccountDetails() {
        System.out.println("*** Account Information ***");
        System.out.println("ID: " + accountId);
        System.out.println("Balance: " + balance);
    }

    public static String getNextId() {
        return "ACCT#" + nextId++;
    }

    public void transferDetails(double amount, int routingNumber, String accountNumber, String notes) {
        System.out.println("Transferred amount: " + amount);
        System.out.println("Transfer to bank account Routing number: " + routingNumber);
        System.out.println("Transfer to bank account Account number: " + accountNumber);
        System.out.println("Transfer Notes: " + notes);
    }
}
