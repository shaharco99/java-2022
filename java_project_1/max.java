import java.util.Scanner;

/**
 * Write a description of class max here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class max
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 4 Int");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int max = a;
        if (b > max ) {max = b;}
        if (c > max ) {max = c;}
        if (d > max ) {max = d;}
        System.out.println(max);
    }
}

