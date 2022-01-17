
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Time
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter hours and minutes");
        int h = scan.nextInt();
        int m = scan.nextInt();
        // is valid ?
        if (h<0 || 23<h || m<0 || 59<m) {
            System.out.println("error input");
        } else {// input OK
            String hour = (h < 10 ? "0" : "") + h;            
            String minute = (m < 10 ? "0" : "") + m;
            
            System.out.println("time = " + hour + ":" + minute);
        }
    }
    
}