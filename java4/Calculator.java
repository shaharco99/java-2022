
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Calculator
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num1 op num2 (op = +, -, *, / , :, ^)");
        int n1 = scan.nextInt();
        String op = scan.next();
        int n2 = scan.nextInt();
        int res=0;
        boolean isOK = true;
        switch (op) {
            case "+" :
            res = n1 + n2;
            break;

            case "-" :
            res = n1 - n2;
            break;

            case "*" :
            res = n1 * n2;
            break;

            case "/" :
            case ":" :
            if (n2 == 0) {
                System.out.println("error - can not / by 0");
                isOK = false;
            } else {
                res = n1 / n2;
            }
            break;

            default :
            System.out.println("error - wrong operator - " + op);
            isOK = false;
        }
        if (isOK) {
            System.out.println(n1 + op + n2 + "= " + res);
        }
    }

}