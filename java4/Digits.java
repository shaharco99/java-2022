
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Digits
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a 2 digits number");
        int num = scan.nextInt();
        if (9 < num && num < 100) { //2 digits
            // if (num % 11 == 0)     
            // int ones = num % 10;
            // int tens = num / 10;
            //if (ones == tens) {
            if (num % 11 == 0)  {
                System.out.println("Equal");
            } else {
                System.out.println("NOE Equal");
            }
        } else { // not 2 digits
            System.out.println("error - " + num + " is not a 2 digitd number");
        }
    }
}