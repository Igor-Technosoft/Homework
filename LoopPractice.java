/**
 * Created by igor on 12/9/2017.
 */
import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {

        // Create a sample student enrollment system

        //Instance of scanner
        Scanner scan = new Scanner(System.in);
        //Setting up number of students school can enroll
        int studentCapacity = 10;
        //Setting up the count
        int i = 0;
        //Creating while statements to enroll students until max num is reached
        while (i < studentCapacity) {
            int updatedStudentCapacity = studentCapacity - i;
            System.out.println("You can enroll " + updatedStudentCapacity + " more students");
            System.out.println("Please enter student name");
            System.out.println(scan.nextLine());

            if (i == 9) {
                System.out.println("you have reached max num of students");
                System.out.println("No more enrollement until next batch");
            }
            i++;
        }
    }
}
