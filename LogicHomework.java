import java.util.Scanner;
public class LogicHomework {
    public static void main(String[] args) {
//          This program needs a good loop to control it, I have some ideas, but didn't want to go too far ahead
//          This is to allow for user input
        Scanner user_input = new Scanner(System.in);
        String userInput2;
        String userInput1;
        System.out.println("Please enter one of the following to describe the driving mode, Park, Drive, Neutral, Reverse: " + "\n");
        userInput1 = user_input.nextLine();

//        String userInput2 = user_input.next();
//          If-Else statements controlling logic
        if (userInput1.equalsIgnoreCase("Park")) {
            System.out.println("You can use this mode after you park your car");
        } else if (userInput1.equalsIgnoreCase("Drive")) {
            System.out.println("In what kind of weather would you like to drive your car? Rain, Snow, Off-Road?");
        }

            userInput2 = user_input.nextLine();

            if (userInput2.equalsIgnoreCase("Rain")) {
                System.out.println("Yes, you can use D mode to drive in rain");
            } else if (userInput2.equalsIgnoreCase("Snow")) {
                System.out.println("Yes, you can use D mode to drive in snow");
            } else if (userInput2.equalsIgnoreCase("Off-Road")) {
                System.out.println("Yes, you can can D mode to drive Off-Road");
            }


//            System.out.println("You can use this mode to drive in any weather condition, such as rain, snow, and off-road");
//            System.out.println("Please enter your preferred mode of driving, enter Rain, Snow, Off-road");

//            userInput2 = user_input.next();

//            if (userInput2.equalsIgnoreCase("Rain")) {
//                System.out.println("Yes, you can use D mode to drive in rain");
//                if (userInput2.equalsIgnoreCase("Snow")) {
//                    System.out.println("Yes, you can use D mode to drive in snow");
//                    if (userInput2.equalsIgnoreCase("Off-Road")) {
//                        System.out.println("Yes, you can use D mode to drive off-road");
//
//                    }
//                }
//            }
//        }
//                if (!userInput2.equalsIgnoreCase("Rain" || !userInput2.equalsIgnoreCase("Snow" || !userInput2.equalsIgnoreCase("Off-Road"))) {
//                System.out.println("You entered invalid D mode");
//            }


            else if (userInput1.equalsIgnoreCase("Neutral")) {
                System.out.println("You can use this mode whenever you need your car washed");
            } else if (userInput1.equalsIgnoreCase("Reverse")) {
                System.out.println("You can use this mode to drive your car in reverse");
            }
            else {

//           Default: in case none of the statements matched

                System.out.println("You've entred invalid choice");
            }
        }
    }

















