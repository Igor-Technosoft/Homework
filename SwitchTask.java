import java.util.Calendar;
public class SwitchTask {
    public static void main(String[] args) {
//      This is to setup an array of months
        String[] monthName = { "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December" };
//      This gets current month
        Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];
        System.out.println("Current month is" + " " +  month);
//      Switch statements

        switch (month) {
            case "December":
                System.out.println("Current month is a Winter Month");
                break;
                case "January":
            System.out.println("Current month is a Winter Month");
            break;
            case "February":
                System.out.println("Current month is a Winter Month");
                break;
            case "March":
                System.out.println("Current month is a Spring Month");
                break;
            case "April":
                System.out.println("Current month is a Spring Month");
                break;
            case "May":
                System.out.println("Current month is a Spring Month");
                break;
            case "June":
                System.out.println("Current month is a Summer Month");
                break;
            case "July":
                System.out.println("Current month is a Summer Month");
                break;
            case "August":
                System.out.println("Current month is a Summer Month");
                break;
            case "September":
                System.out.println("Current month is a Fall Month");
                break;
            case "October":
                System.out.println("Current month is a Fall Month");
                break;
            case "November":
                System.out.println("Current month is a Fall Month");
                break;
                default:
                    System.out.println("Invalid month");

        }


    }
}
