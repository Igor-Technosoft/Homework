public class StringHomework {
    public static void main(String[] args) {
 //     This code prints out a string.
        String myStatement = "I am a good programmer";
        System.out.println(myStatement);
  //    This section prints out string's length
        int stringLength = myStatement.length();
        System.out.println("My statement length is " + stringLength);
  //    This code converts everything into lower case
        String lowerCase = myStatement.toLowerCase();
        System.out.println("This is everything converted to lower case:" + " " + lowerCase);
   //   This code tests to see if this string contains "mohammad"
        boolean isContain = myStatement.contains("mohammad");
        System.out.println("Does my statement contain mohammad?" + " " + isContain);
   //   This code prints out the 5th character of this string
        char findIndex = myStatement.charAt(4);
        System.out.println("The 5th index of the statement, which could also be a space too is:" + " "  + findIndex);
  //    This code prints out whether this string is empty
        boolean isMyStatementEmpty = myStatement.isEmpty();
        System.out.println("Is my statement empty?" + " " +  isMyStatementEmpty);
   //   This code compares this string with "technosoft" string
        String technosoftString = "technosoft";
        boolean areTheseStringsEqual = myStatement.equals(technosoftString);
        System.out.println("Is my statement equal to technosoft?" + " " + areTheseStringsEqual);
 //     This code prints out the Unicode code point
        int findUnicode = myStatement.codePointAt(5);
        System.out.println("This is the Unicode value of the 4th character:" + " " + findUnicode);
 //     This code compares this string to a string bufer
        StringBuffer sb = new StringBuffer("i am a good programmer");
        myStatement.contentEquals(sb.toString());
        System.out.println("This String equal to a string buffer 'i am a good programmer?" + " " + sb);
//      This code compares 2 strings regardless of case
        String upperCaseString = "I AM A GOOD PROGRAMMER";
        boolean areTheseTwoStringsSame = myStatement.equalsIgnoreCase(upperCaseString);
        System.out.println("Is i am a good programmer equal to I AM A GOOD PROGRAMMER if we ignore letter case?"  + " "  + areTheseTwoStringsSame);
    }
}
