
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    public static void main(String [] args) {
        BusArrival b1 = new BusArrival(25, 50, 16, 46, 0);
        System.out.println("b1 = " + b1);
        BusArrival b2 = new BusArrival(123, 150, -16, 46, 0);
        System.out.println("b2 = " + b2);

        Time t1 = new Time (16, 30, 0);
        BusArrival b3 = new BusArrival(23, 42, t1);
        System.out.println("b3 = " + b3);
        t1.setHour(17);
        BusArrival b4 = new BusArrival(22, 33, t1);
        System.out.println("b4 = " + b4);
        System.out.println("b3 = " + b3);
        
        Time t5 = b3.getArrTime();
        System.out.println("b3 before b1 = " + b3.before(b1) );
    }

}
