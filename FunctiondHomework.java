import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by igor on 12/15/2017.
 */
public class FunctiondHomework {
//    This calls getCurrentDate
    public static void main(String[] args) {
//        printToConsole("Today's date " + getCurrentDate());
        getCurrentDate();
//        This calls getSquareRoot
        getSquareRoot(168);
        getSeasonName("March");
        calculator();

    }
//    This method gets Current Date

    public static String getCurrentDate(){
        Date myDate = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = sm.format(myDate);
        printToConsole("Today's date " + strDate + "\n");
        return strDate;
    }
    public static void printToConsole(String value) {
        System.out.println(value);
    }
//    This method gets the Square Root
    public static Double getSquareRoot(int number) {
//        printToConsole("The square root of " + number );
        double squareRootResult = Math.sqrt(number);
        printToConsole("The square root of (" + number  + ")=" + " " + Math.sqrt(number) + "\n");
        return squareRootResult;

    }
//    This method gets the current season.
    public static String getSeasonName(String monthName) {

        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
//        String[] springMonths = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
          boolean isWinterSeason1 = monthName.contains("December");
          boolean isWinterSeason2 = monthName.contains("January");
          boolean isWinterSeason3 = monthName.contains("February");
          boolean isSpringSeason1 = monthName.contains("March");
          boolean isSpringSeason2 = monthName.contains("April");
          boolean isSpringSeason3 = monthName.contains("May");
          boolean isSummerSeason1 = monthName.contains("June");
          boolean isSummerSeason2 = monthName.contains("July");
          boolean isSummerSeason3 = monthName.contains("August");
          boolean isAutumnSeason1 = monthName.contains("September");
          boolean isAutumnSeason2 = monthName.contains("October");
          boolean isAutumnSeason3 = monthName.contains("November");
          if (isWinterSeason1 || isWinterSeason2 || isWinterSeason3) {
              printToConsole(("This season is ") + seasons[0] + "\n");
          }
          else if (isSpringSeason1 || isSpringSeason2 || isSpringSeason3) {
              printToConsole(("This season is ") + seasons[1] + "\n");
          }
          else if (isSummerSeason1 || isSummerSeason2 || isSummerSeason3) {
              printToConsole(("This season is ") +  seasons[2] + "\n");
          }
          else if (isAutumnSeason1 || isSummerSeason2 || isSummerSeason3) {
              printToConsole(("This season is ") + seasons[3] + "\n");
          }
          else {
              printToConsole("Invalid month");
          }
            return monthName;

    }
//    This method calls various calculator functions.
    public static void calculator() {
        addNumbers(5,5);
        subtractNumbers(20,10);
        multiplyNumbers(5,8);
        divideNumbers(40,8);

    }
    public static void addNumbers (double addNumber1, double addNumberTwo) {

        double addSummary = addNumber1 + addNumberTwo;
        printToConsole("The sum of these numbes is " + addSummary);

    }
    public static void subtractNumbers(double subtractNumberOne, double subtractNumberTwo) {
        double subtractResut = subtractNumberOne - subtractNumberTwo;
        printToConsole("Number 1 minus Number 2 is " + subtractResut);


    }
    public static void multiplyNumbers (double multiplyNumberOne, double muliplyNumberTwo) {
        double multiplicationResult = multiplyNumberOne * muliplyNumberTwo;
        printToConsole("Number 1 Multiplied by Number 2 is " + multiplicationResult);


            }
    public static void divideNumbers (double divideNumberOne, double divideNumberTwo) {
        double divisionResult = divideNumberOne / divideNumberTwo;
        printToConsole("Number 1 Divided by Number 2 is " + divisionResult);

    }
    }

