
/**
 * Write a description of class Point here.
 *
 * @author shahar
 * @version 13.11.2021
 */
public class Point
{
    private int _X;
    private int _Y;   
    public Point (int X, int Y){
        _X=X;
        _Y=Y;
    }  
    // copy constructor
    public Point (Point other){
        _X=other._X;
        _Y=other._Y;
    }
    public int getX(){
        return _X;
    }
    public int getY(){
        return _Y;
    }
    public void setX (int num) {
        _X=num;
    }
    public void setY (int num) {
        _Y=num;
    }
    public String toString () {
        return "(" + _X +"," + _Y  + ")";
    }
    public boolean equals (Point other){
        return _X==other._X && _Y==other._Y;
    }
    public boolean isAbove (Point other){
        return _Y>other._Y;
    }
    public boolean isUnder (Point other){
        return !isAbove(other);
    }
    public boolean isLeft (Point other){
        return _X<other._X;
    }
    public boolean isRight (Point other){
        return !isLeft(other);
    }
    public void move (int deltaX, int deltaY){
        _X = _X + deltaX;
        _Y = _Y + deltaY;
    }
    public double distance (Point other){
     return Math.sqrt(Math.pow(_X-other._X,2)  + Math.pow(_Y-other._Y,2));
    }
}