import java.util.Scanner;

/**
 * Write a description of class Ifs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ifs
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter grade and units");
        int grade = scan.nextInt();
        int units = scan.nextInt();
        if (units == 5) {grade = grade + 25;}
        if (units == 4) {grade = grade + 10;}
        System.out.println(grade);
    }
}

