
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
public class DateHomeworkPractice {
    public static void main(String[] args) throws ParseException {
//      This section uses Calendar object to get tomorrow's date
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        String tomorrowDate = sdf.format(tomorrow);
        System.out.println("Tommorow's date is" + " " + tomorrowDate + "\n");
//      This section uses Date object to get today's date
        Date myDate = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sm.format(myDate);
        System.out.println("Today's date is" + " " + strDate + "\n");
//      This section parses today's and tomorrow's dates and compares themw
        Date dateFuture = sdf.parse(tomorrowDate);
        Date dateCurrent = sm.parse(strDate);
        dateCurrent.compareTo(dateFuture);
        System.out.println("Is current date before future date?" + "\n");
        System.out.println(dateCurrent.before(dateFuture) + "\n");
//      This section parses a strings and prints it in a date format
        DateFormat sdf3 = new SimpleDateFormat( "yyyy-MM-dd");
        String dateInString = "1999-11-19";
        Date date4 = sdf3.parse(dateInString);
        String newDateString = sdf3.format(date4);
        System.out.println("String '1999-11-19' in Date format is" + " " + newDateString);

    }
}
