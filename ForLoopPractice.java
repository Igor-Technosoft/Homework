/**
 * Created by igor on 12/9/2017.
 */

import java.util.Calendar;

public class ForLoopPractice {
    public static void main(String[] args) {
// Setting-up monthNames array
 String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//This gets current month
 Calendar cal = Calendar.getInstance();
        String month = monthNames[cal.get(Calendar.MONTH)];
//       Setting-up enhanced for loop
        for (String monthName : monthNames) {
            boolean isDecemberCurrent = month.equals(monthName);
            if (isDecemberCurrent == true) {
                System.out.println("Current Month is " + month);
                break;
                    }
                }
            }
        }
