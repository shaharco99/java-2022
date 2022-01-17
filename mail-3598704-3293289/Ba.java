
/**
 * Write a description of class Ba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ba extends Course
{
    public static final int SUM_ADD = 300;
    
    public Ba(String name, int sem) {
        super (name, sem);
    }

    public int calcPrice() {
        int price = BASE_PRICE;
        if (getSem() == 3) {
            price += SUM_ADD;
        }
        return price;
    }
}
