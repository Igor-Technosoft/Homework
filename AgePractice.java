public class AgePractice {
    public static void main(String[] args) {
        int dob = 1974;
        int currentYear = 2017;
        String myMonthBirth = "October";
        String curentMonth = "December";
        int myAge = currentYear - dob;
        boolean hadBirthday = true;
        if (hadBirthday) {
            System.out.println("You've already had your birthday so your age is " + myAge);
        } else {
            myAge--;
            System.out.println("You didn't reach your Birthday" + myAge);
        }
    }
}






