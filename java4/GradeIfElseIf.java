
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeIfElseIf
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter grade");
        int grade = scan.nextInt();
        if (1 <= grade && grade <= 4) {
            System.out.println("fail");
        } else if (grade == 5) {
            System.out.println("poor");
        } else if (grade == 6) {
            System.out.println("pass");
        } else { 
            System.out.println("error input");
        }
    }
    
}