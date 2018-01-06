package improvedBank;

/**
 * Created by Mujab on 12/16/17.
 */
public class Bank {

    public static void main(String[] args) {

        Customer howard = new Customer("Howard", "Guzman");
        howard.addAccount();
        Transaction transaction = howard.addTransaction("12/30/17", 20, "Shake Shack", "Shake Shack", "Food");
        howard.printTransactionDetails(transaction);

//        Customer vitali = new Customer();
//        vitali.addAccount(1000);
//        vitali.transferFund(900, 324324, "4324324", "Car Rental");
    }
}
