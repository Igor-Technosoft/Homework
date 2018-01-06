package classesAndObjectsTutorial;

/**
 * Created by igorsandler on 1/4/18.
 */
public class Customer {

        private String firstName;
        private String lastName;
        private Account acc;
        int defaultBalance = 100;

        public  double depositAmount;
        public double withdrawAmount;
        public double transferAmount;

        TransactionActivities trc;

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
            trc = new TransactionActivities();
            acc.accountId = "ACCT ID = " + Account.getNextId();
            acc.balance = defaultBalance + initialBalance;
            acc.displayAccountDetails();

        }

        public void deposit(double depositAmount) {

            acc.balance = acc.balance + depositAmount;
            System.out.println("You deposited " + depositAmount +  " dollars" + "\n");

            trc.displayAccountTransactionDeposit();
            acc.displayAccountDeposit();
        }

        public void withdraw(double withdrawAmount) {
            acc.balance = acc.balance - withdrawAmount;
            System.out.println("You withdrew " + withdrawAmount + " dollars" + "\n");
            trc.dislayAccoutTransactionWithdraw();
            acc.dislayAccountWithdraw();
        }

        public void transferSameBank(double transferAmount) {
            acc.balance = acc.balance - transferAmount;
            System.out.println("You transferred " + transferAmount + " dollars " + " to an internal Citibank account" + "\n");
            trc.displaySameBankTrnsactionTransferAccountDetails();
            acc.displaySameBankTransferAccountDetails();

        }
        public void transferDifferentBank(double transferAmount) {
            acc.balance = acc.balance - transferAmount;
            System.out.println("You transferred " + transferAmount + " dollars " + " to an external North Fork account" + "\n");
            trc.displayDifferentBankTransationTransferAccountDetails();
            acc.displayDifferentBankTransferAccountDetails();

        }

    }

