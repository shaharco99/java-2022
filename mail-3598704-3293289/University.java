
/**
 * Write a description of class University here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class University
{
    public static void main(String [ ]args) {
        Ba b1 = new Ba("aaa" , 1);
        Ba b2 = new Ba("aaa" , 2);
        Ba b3 = new Ba("aaa" , 3);
        Ma m1 = new Ma("MMM" , 1);
        Ma m2 = new Ma("MMM" , 2);
        
        int total = b1.calcPrice() + b2.calcPrice() + 
        b3.calcPrice() + m1.calcPrice() + m2.calcPrice();
        System.out.println("total = " + total);
        
        Course [] courses = {b1, b2, b3, m1, m2};
        int total2 = 0;
        for (int i=0; i<5; i++) {
            total2 += courses[i].calcPrice();
        }
        System.out.println("total2 = " + total2);
    }
}







