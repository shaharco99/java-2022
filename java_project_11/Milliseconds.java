import java.util.Scanner;

/**
 * Milliseconds.
 *
 * @author shahar
 * @version 1
 */
public class Milliseconds
{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println ("This program reads an integer which " +
        "represents Milliseconds and converts it to days, " +
        "hours, minutes and seconds. ");
        System.out.println ("Please enter the number of Milliseconds");
        long ms = scan.nextLong();
        long s = ms / 1000;
        long m = s / 60;
        long h = m / 60;
        long d = h / 24;
        long ss = s % 60;
        long mm = m % 60;
        long hh = h % 24;
        long dd = d % 24;
        System.out.println(dd + " days " + hh + ":" + mm + ":" + ss + " hours");
    }
}
