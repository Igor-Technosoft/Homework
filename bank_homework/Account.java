package classesAndObjectsTutorial;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.Callable;


/**
 * Created by Mujab on 12/16/17.
 */
public class Account {

    double balance;
    String accountId;
    static int nextId = 0;
    static final int ROUTING_NUMBER = 12345;
    static final int ANOTHER_BANK_ROUTING_NUMBER = 45678;



    public void displayAccountDetails() {
        System.out.println("*** Account Information ***");
        System.out.println("ID: " + accountId);
        System.out.println("Your current Balance: " + balance + "dollars" + " " + "\n");
    }

    public void displayAccountDeposit() {

        System.out.println("Your new balance is " +  new DecimalFormat("#.##").format(balance) + "\n");
    }

    public void dislayAccountWithdraw() {
        System.out.println("Your new balance is " + new DecimalFormat("#.##").format(balance) + "\n");
    }
    public void displaySameBankTransferAccountDetails() {

        System.out.println("The new balance after transfer " +  new DecimalFormat("#.##").format(balance) + " " + "dollars" + "\n");
    }

    public void displayDifferentBankTransferAccountDetails() {

        System.out.println("Routing Number " + " " + ANOTHER_BANK_ROUTING_NUMBER + "." + " " + "The new balance after transfer " + new DecimalFormat("#.##").format(balance) + " " + "dollars" + "\n");
    }


    public static String getNextId() {
        return "ACCT#" + nextId++;
    }
}
