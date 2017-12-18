public class ComparisonHomework {
    public static void main(String[] args) {
//   I don't have siblings, comparing my age and my wife's age
        int myAge = 43;
        int myWifeAge = 41;
        boolean amIOlderThanMyWife = myAge > myWifeAge;
        System.out.println("If I'm 43 and my wife is 41, am I older than my wife?" + " " + amIOlderThanMyWife + "\n");
//      To buy iPhone10, the price needs to be equal or below $800 and my salary has to be equal or greater than $3000/month
        int monthlySalary = 3000;
        int iPhonePrice = 780;
        boolean wiilIBuyIPhone10 = iPhonePrice <=800 && monthlySalary >=3000;
        System.out.println("If I can't spend more than $800 a month on a new phone and my monthly salary has to be more than $3000 to buy a phone, am I going to buy iPhone10?" + " " + wiilIBuyIPhone10 + "\n");
//      Employee ID numbers shouldn't be equal
        int employeeIDNumber1 = 22323345;
        int employeeIdNumber2 = 22323345;
        boolean canTheseNumbersBeEqual =! (employeeIDNumber1 == employeeIdNumber2);
        System.out.println("If both Employee ID numbers are 22323345, can Employee ID Numbers be equal?" + " " + canTheseNumbersBeEqual);





    }
}
