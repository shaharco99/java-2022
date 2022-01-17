
/**
 * Write a description of class arrays_2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrays_2D
{
    public static void main(String [] args) {
        int [][] a = new int [10][12];
        //go over the lines (rows)
        for (int i=0; i<10; i++) {
            //go over line i - columns
            for (int j=0; j<12; j++) {
                a[i][j] = (i+1) * (j+1);
            }
        }
        print(a);
        System.out.println();
        int [][] b = new int [4][];
        b[0] = new int [5];
        b[1] = new int [4];
        b[2] = new int [6];
        b[3] = new int [3];
        print(b);
        System.out.println();
        flipHorizontal(a);
        print(a);
    }

    public static void print(int [][]a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void flipHorizontal(int [][] a) {
        for (int i=0; i<a.length/2; i++) {
            int [] tmp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = tmp;
        }
    }
}






