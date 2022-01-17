import java.util.Scanner;

/**
 * Write a description of class Rectangel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangel
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter length and width");
        int length = scan.nextInt();
        //System.out.println("please enter width ");
        int width = scan.nextInt();
        int peri = 2* (length + width);
        int area = length * width;
        System.out.println("peri is =" + peri + "\tarea is =" + area);
    }
}
