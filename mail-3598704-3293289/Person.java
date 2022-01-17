
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    public static final String NO_NAME = "NoName";
    private int _id;
    private String _name;
    
    public Person(String name, int id) {
        _id = id;
        _name = name;
    }

    public Person(int id) {
        this(NO_NAME, id);
    }

    public void setName(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public int getId() {
        return _id;
    }

    public String toString() {
        return _name + " - " + _id;
    }
}
