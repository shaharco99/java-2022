
/**
 * Write a description of class Time1 here.
 * asfsf safasf asfd ;jl;f as
 * ;safjs;a
 * asdfkja
 * as jf';
 *
 * @author (G09)
 * @version (04-11-2021)
 */
public class Time1
{
    /**
     * default value for hour minute or seconnd
     */
    public static final int DEF_VAL = 0;
    private int _secFromMid;

    /**
     * constructor .....
     * 
     * @param hour the hour value, from 0 to 23, else will set to 0
     * @param minute the minute value, from 0 to 59
     * @param second the second value ...
     */
    public Time1(int hour, int minute, int second) {
        if (!hourOK(hour)) {
            hour = DEF_VAL;
        } 
        
        _secFromMid hour*3600 + minute*60 + second;
    }
    
    // copy constructor
    public Time1 (Time1 t) {
        _secFromMid = t._secFromMid;
    }
    
    public void setHour(int hour) {
        if (hourOK(hour)) {
            _hour = hour;
        }
    }
    
    /**
     * fjlds
     * @return the value of hour
     */
    public int getHour() {
        return _hour;
    }
    
    public boolean equals(Time1 t) {
        return _secFromMid == t._secFromMid;
    }
    
    public boolean before(Time1 t) {
        return _secFromMid < t._secFromMid;
    }
    
    public boolean after (Time1 t) {
        return t.before(this);
    }
    
    public int secFromMidnight() {
        return _secFromMid;
    }
    
    public int difference(Time1 t) {
        return Math.abs(_secFromMid - t._secFromMid);
    }

    public String toString() {
        return _hour + ":" + _minute + ":" + _second;
    }
    
    private boolean hourOK(int hour) {
        return 0<=hour && hour<=23;
    }
}









