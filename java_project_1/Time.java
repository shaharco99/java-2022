
/**
 * Write a description of class Time here.
 * asfsf safasf asfd ;jl;f as
 * ;safjs;a
 * asdfkja
 * as jf';
 *
 * @author (G09)
 * @version (04-11-2021)
 */
public class Time
{
    /**
     * default value for hour minute or seconnd
     */
    public static final int DEF_VAL = 0;
    private int _hour;
    private int _minute;
    private int _second;

    /**
     * constructor .....
     * 
     * @param hour the hour value, from 0 to 23, else will set to 0
     * @param minute the minute value, from 0 to 59
     * @param second the second value ...
     */
    public Time(int hour, int minute, int second) {
        if (hourOK(hour)) {
            _hour = hour;
        } else {
            _hour = DEF_VAL;
        }
        _minute = minute;
        _second = second;
    }
    
    // copy constructor
    public Time (Time t) {
        _hour = t._hour;
        _minute = t._minute;
        _second = t._second;
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
    
    public boolean equals(Time t) {
        return _hour == t._hour &&
        _minute == t._minute &&
        _second == t._second;
    }
    
    public boolean before(Time t) {
        return _hour < t._hour ||
        _hour == t._hour && _minute < t._minute ||
        _hour == t._hour && _minute == t._minute && _second < t._second;
    }
    
    public boolean after (Time t) {
        return t.before(this);
    }
    
    public int secFromMidnight() {
        return _hour * 3600 + _minute * 60 + _second;
    }
    
    public int difference(Time t) {
        return Math.abs(secFromMidnight() - t.secFromMidnight());
    }

    public String toString() {
        return _hour + ":" + _minute + ":" + _second;
    }
    
    private boolean hourOK(int hour) {
        return 0<=hour && hour<=23;
    }
}









