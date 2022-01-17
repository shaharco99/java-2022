
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    public static final int MAX_SIZE = 40;
    private String [] _courses;
    private double [] _grades;
    private int _size;
    
    public Student(String name, int id) {
        this(name, id, new String[0], new double[0]);
    }

    public Student(String name, int id, String[] courses,  double[] grades) {
        super(name, id);
        _courses = new String [MAX_SIZE];
        _grades = new double [MAX_SIZE];
        _size = 0;
        
        for (int i=0; i<courses.length; i++) {
            addCourse(courses[i], grades[i]);
        }
    }

    public double getAvr( ) {
        return 95;
    }

    public String toString() {
        String str = super.toString();
        if (_size == 0) {
            return str + "\nNo courses";
        }
        for (int i=0; i<_size; i++) {
            str += "\n" + _courses[i] + " - " + _grades[i];
        }
        return str;
    }

    public boolean addCourse(String name, double grade) {
        if (_size == _courses.length) {
            return false;
        }
        _courses[_size] = name;
        _grades[_size] = grade;
        _size++;
        return true;
    }

}
