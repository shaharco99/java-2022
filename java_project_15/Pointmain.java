
/**
 * Write a description of class Pointmain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pointmain
{
    public static void main(String [] args){ 
        Point first = new Point(2,4);
        Point second = new Point(6,1);
        //System.out.println(first.equals (second));
        //System.out.println(second.isUnder(first));
        System.out.println(first.distance(second));
        }
}