
/**
 * creat 3x3x3 square.
 *
 * @author Shahar
 * @version 11.12.2021
 */
public class Square3x3
{
    /**
     * Constructor for objects of class Square3x3
     */
    public static void main(String [] args) {
        //define array Square 3X3
        int [][] s3x3 = new int [3][3];
        // go over the lines (rows)
        //go over line the lines of sudoku(rows)
        for (int i=0; i<s3x3.length; i++) {
            //go over line t - columns
            for (int j=0; j<s3x3[i].length; j++) {
            s3x3[i][j] = -1;
            System.out.print(s3x3[i][j]);
            }
            System.out.println();
        }
    }
}