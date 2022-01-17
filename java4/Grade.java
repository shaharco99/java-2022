
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Grade
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter grade and units");
        int grade = scan.nextInt();
        int units = scan.nextInt();
        if (units == 5) {
            grade = grade + 25;
        }
        if (units == 4) {
            grade += 15; // grade = grade + 15
        }
        System.out.println("final grade = " + grade);
    }
    
}