package classesAndObjectsTutorial;

/**
 * Created by igorsandler on 1/4/18.
 */
public class Bank {



        public static void main(String[] args) {

            Customer howard = new Customer("Howard", "Guzman");
            howard.addAccount(2000);
            howard.deposit(450.45);
            howard.withdraw(28.45);
            howard.transferSameBank(45.55);
            howard.transferDifferentBank(35.65);


            Customer vitali = new Customer();
            vitali.addAccount(2000);
            vitali.deposit(350.45);
            vitali.withdraw(120.45);
            vitali.transferSameBank(55.65);
            vitali.transferDifferentBank(45.55);

        }

    }

