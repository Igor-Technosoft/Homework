import java.awt.geom.Arc2D;
import java.text.DecimalFormat;
import java.util.DoubleSummaryStatistics;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by igor on 12/10/2017.
 */

public class BudgetHomeworkTwo {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //       Variable declarations. Using Double because real-life prices include dollars and cents
    Double maxBudget = 0.00;
    Double itemCost = 0.00;
    Double spendLimit;
    Double updatedMaxBudget = 0.00;
    String itemDescription;
    String spendLimitDescription = " ";


//        Setting-up a while loop
        while (updatedMaxBudget < maxBudget) {
        spendLimit = maxBudget - itemCost;
        updatedMaxBudget = updatedMaxBudget + itemCost;
        spendLimit = maxBudget - updatedMaxBudget;
//          Formatting responses
        spendLimit = Double.parseDouble("spendLimitDescription");
//            Setting-up the end of loop scenario
        if (spendLimit <= 0) {
            System.out.println("You've reached your max budget! Please proceed to checkout.");
            System.out.println("Thank you for shopping! Please come back again!");
            break;
        }
//           Usinf try-catch structure to catch possible data mismatches
        try {


            System.out.println("You still haven't spent all of your $100 budget. You can spend " + spendLimitDescription + " dollars" + " " + "more");
            System.out.println("Please enter item description ");
            itemDescription = scan.nextLine();
            System.out.println(itemDescription);
            System.out.println("Please enter item cost ");
            itemCost = scan.nextDouble();
        }
//           Would like to improve on this Catch statment. Currently, it'll catch non-Double types of data and will exi the loop, want to find a way to correctly go through the loop without updating spendlimit

        catch (InputMismatchException exception)
        {
            System.out.println("Please enter numeric digits only!");
            break;

        }
        System.out.println(scan.nextLine());


        }
    }
}


