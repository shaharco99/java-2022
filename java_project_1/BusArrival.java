
/**
 * Write a description of class BusArrival here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusArrival
{
    public static final int MAX_LINE = 99;
    public static final int MIN_LINE = 1;
    public static final int DEF_LINE = 1;
    public static final int MAX_PASS = 70;
    public static final int MIN_PASS = 0;
    public static final int DEF_PASS = 0;
    
    private int _line;
    private int _pass;
    private Time _arrTime;
    
    public BusArrival(int line, int pass, int h, int m, int s) {
        if (lineOK(line) ) {
           _line = line;
        } else {
            _line = DEF_LINE;
        }
        if (passOK(pass) ) {
            _pass = pass;
        } else {
            _pass = DEF_PASS;
        }
        _arrTime = new Time(h, m, s);
    }
    
    public BusArrival(int line, int pass, Time t) {
        if (lineOK(line) ) {
           _line = line;
        } else {
            _line = DEF_LINE;
        }
        if (passOK(pass) ) {
            _pass = pass;
        } else {
            _pass = DEF_PASS;
        }
        _arrTime = new Time(t);
    }
    
    public int getLine() {
        return _line;
    }
    
    public Time getArrTime() {
        return new Time(_arrTime);
    }
    
    public void setArrtime(Time t) {
        _arrTime = new Time(t);
    }
    
    public boolean before(BusArrival b) {
        return _arrTime.before(b._arrTime);
    }
    
    public String toString() {
        return "Bus no. " +_line+ " arrived at " +_arrTime+ " with " +_pass+ " passengers" ;
    }
    
    private boolean lineOK(int line) {
        return MIN_LINE <= line && line <= MAX_LINE;
    }
    
    private boolean passOK(int pass) {
        return MIN_PASS <= pass && pass <= MAX_PASS;
    }
}















