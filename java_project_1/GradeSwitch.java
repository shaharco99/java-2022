
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class GradeSwitch
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter grade");
        int grade = scan.nextInt();
        switch (grade) {
            case 1:
            case 2: 
            case 3: 
            case 4:
            System.out.println("fail");
            break;
            
            case 5:
            System.out.println("poor");
            break;
            
            case 6:
            System.out.println("pass");
            break;
            
            case 7:
            case 8:
            System.out.println("good");
            break;
            
            default :
            System.out.println("error value");
        }
    }
}
