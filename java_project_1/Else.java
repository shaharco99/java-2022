import java.util.Scanner;

/**
 * Write a description of class Else here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Else
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a 2 digits number");
        int num = scan.nextInt();
        if (9 > num && num < 100 ) {// 2 digits
        // int ones = num % 10;
        // int tens = num / 10;
        // if (ones == tens) {
             if (num % 11 == 0) {
             System.out.println("This number is divided by 11 witout leftovers");            
            } else {
            System.out.println("This number is NOT divided by 11 witout leftovers"); 
        }
    } else {        
        System.out.println("error - " + num + " is not a 2 digits number");
        }
    }
}

