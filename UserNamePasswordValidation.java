/**
 * Created by igor on 12/9/2017.
 */
import java.util.Scanner;
public class UserNamePasswordValidation {
    public static void main(String[] args) {

//       Instance of scanner
        Scanner scan = new Scanner(System.in);
//       Ask users to enter username
        System.out.println("Please enter your username. User names are case sensitive.");
//       Store users-entered username into a String variable
        String actualUsername = scan.nextLine();
//       Checking for empty userid
        if (actualUsername.isEmpty()) {
            System.out.println("User names can't be blank. Please enter a value.");
        }
        actualUsername = scan.nextLine();
//       Ask users to enter password
        System.out.println("Please enter your password. Passwords are case sensitive");
//        Store users-entered password into a String variable
        String actualPassword = scan.nextLine();
//        Checking for empty password
        if (actualPassword.isEmpty()) {
            System.out.println("Passwords can't be blank. Please enter a value.");
        }
        actualPassword = scan.nextLine();
//       Setting expected password which is associated with user account details in database
        String expectedUsername = "igor1234";
        String expectedPassword = "techno1234";
//        Creating for loop to give user max tries to enter valid userid and password and log the user to system if
//        correct password is entered.
//        i < 4 because we want this loop to run 5 times and we start with 0
        for (int i = 0; i < 4; i++) {
//        Checking if actual userid or password is not equal to expected password
            if (!actualPassword.equals(expectedPassword) || !actualUsername.equals(expectedUsername)) {
//
//         Ssubtracting the count by iteration so user will have less tries (-1 every miss tries)
//          int count must be = 4 - i because we start at 0
//                if (actualPassword.isEmpty() || actualUsername.isEmpty()) {
                    int count = 4 - i;
//          Console message to user to enter valid username and password
                    System.out.println("Your username or password doesn't match our reords. Please check and try again");
                    System.out.println("You have " + count + " more tries");
                    System.out.println("Please enter your username");
                    actualUsername = scan.nextLine();
                    System.out.println("Please enter your password");
                    actualPassword = scan.nextLine();
//                  if count equals to 3 because because of post-increment; when users have 1 more try left, that should be the last time they're allowed to enter login criteria
//                  When they have 0 tries, they shouldn't be allowed to enter data, but should see a warning message that their account was locked.
                    if (i == 3) {
                        System.out.println("You account will be locked for 10 minuets due to maximum tries in username or password");
                    }
//                   If at any point in the loop user enters correct password then system lets users into the home page
                } else {
                    System.out.println("You've succesfully logged into your account!");
                    System.out.println("Welcome to the Home Page!");
//              This keyword will break the loop and continue with program
                    break;
                }
            }
        }
    }





