package com.technosoft.selenium;

/**
 * Created by igorsandler on 2/3/18.
 */
public class ExamTest {
   // public static void main(String[] args) {
        // String string="This is a good example";
        // String reverse = new StringBuffer(string).reverse().toString();
        //  System.out.println(reverse);
        // }

         //   String string2 = "This is a good example";
         //   for (int i = string2.length() - 1; i >= 0; i--) {
          //      string2 = string2 + string2.charAt(i);
         //   }
          //  System.out.println("\n" + string2);

       // }
    public  void reverseEverything(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = string.split(" ");

        for (int j = words.length-1; j >= 0; j--) {
            stringBuilder.append(words[j]).append(' ');
        }
        System.out.println("Good example: " + stringBuilder);
    }
    }
