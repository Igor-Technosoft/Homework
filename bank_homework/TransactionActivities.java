package classesAndObjectsTutorial;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by igor on 12/22/2017.
 */
public class TransactionActivities {



    Date myDate = new Date();
    SimpleDateFormat sm = new SimpleDateFormat("MM-dd-dd-yyyy");
    String strDate = sm.format(myDate);
    private String merchantCitibank = "Citibank";
    private String merchantNorthFork = "North Fork";
    private String transactionDeposit = "Deposit";
    private String merchantBNY = "BNY";
    private String yesterdayDate = "12-21-2017";
    private String dayBeforeYesteday = "12-20-2017";
    private String twoDaysBeforeYesterday = "12-19-2017";
    private String transactionWithdraw = "Withdraw";
    private String transacionSameBankTransfer = "Internal Citibank Transfer";
    private String transacionDifferentBankTransfer ="External North Fork Transfer";
    Account acc;


    public void displayAccountTransactionDeposit() {
        System.out.println("Transaction History " + "\n");
        System.out.println(strDate + " " + merchantCitibank + " " + transactionDeposit + "\n");
//        System.out.println("Your new balance is " +  new DecimalFormat("#.##").format(acc.balance) + "\n");
    }

    public void dislayAccoutTransactionWithdraw() {
        System.out.println(yesterdayDate + " " + merchantBNY + " " + transactionWithdraw + "\n");
//        System.out.println("Your new balance is " + new DecimalFormat("#.##").format(balance) + "\n");
    }
    public void displaySameBankTrnsactionTransferAccountDetails() {
        System.out.println(dayBeforeYesteday + " " + merchantCitibank + " " + transacionSameBankTransfer + "\n");
//        System.out.println("The new balance after transfer " +  new DecimalFormat("#.##").format(balance) + " " + "dollars" + "\n");
    }

    public void displayDifferentBankTransationTransferAccountDetails() {
        System.out.println(twoDaysBeforeYesterday + " " + merchantNorthFork + " " + transacionDifferentBankTransfer);
//        System.out.println("Routing Number " + " "  + "The new balance after transfer " + new DecimalFormat("#.##").format(balance) + " " + "dollars" + "\n");
    }

}
