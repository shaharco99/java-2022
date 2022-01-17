import java.util.Scanner;
/**
 * Einstein magic game
 *
 * @author shahar
 * @version 1
 */
public class Einstein
{
public static void main(String [] args){
    System.out.println("Welcome to the Einstein magic game.");
    System.out.println("Please enter a 3 digit positive number first and last are different:");
    Scanner scan = new Scanner(System.in);
    int Num = scan.nextInt();
    int first = Num / 100; //hundreds 
    int second = (Num /10) % 10; //tens
    int last  = Num % 10; //Units
    int Difference = Math.abs(Num - (last*100 + second*10 + first)); //allwys positive
    int Dfirst = Difference / 100;//hundreds D
    int Dsecond = (Difference /10) % 10; //tens D
    int Dlast  = Difference % 10; //Units D
    //convert Difference left to right
    int DifferenceOp = Math.abs(Dlast*100 + Dsecond*10 +Dfirst); 
    if (Num < 0 || (Num / 1000 > 0)) System.out.println("The number you entered is not a 3 digit positive number");
        else if (first == last)   
            System.out.println ("The first and the last digits of the number should be different");
    else {
        System.out.println("User number is: " +  Num);
        System.out.println("Difference: " + Difference);
        System.out.println("Reversed difference: " + DifferenceOp);
        if (DifferenceOp + Difference == 1089) System.out.println("SUCCEEDED");
        else System.out.println("FAILED");}
    }
}   
//end of class
