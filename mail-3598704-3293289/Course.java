
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract public class Course
{

    public static final int BASE_PRICE = 1500;
    private String _name;
    private int _sem;

    public Course(String name, int s) {
        _name = name;
        _sem = s;
    }

    public int getSem() {
        return _sem;
    }

    abstract public int calcPrice(); 
}
