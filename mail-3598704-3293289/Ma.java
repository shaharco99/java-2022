
/**
 * Write a description of class Ma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ma  extends Course
{
    public static final int MA_ADD = 500;
    
    public Ma(String name, int sem) {
        super (name, sem);
    }

    public int calcPrice() {
        return BASE_PRICE + MA_ADD;
    }
}