
/**
 * creat 3x3x3 square.
 *
 * @author Shahar
 * @version 11.12.2021
 */
public class test
{
    /**
     * Constructor for objects of class test
     */
    public static void main(String [] args) {
        int [][] square3x3 = {{3,3},{5,5},{5,5}};
        Square3x3(square3x3);
    }
    public static int [][] Square3x3(int[][]array){
        int [][] arraynew = new int [3][3];
        int arrayRow = array.length;
        int [] arrayColum  = new int [arrayRow];
        System.out.println(arrayRow);
        for (int i=0; i<arrayRow; i++){
            arrayColum[i]=array[i].length;
            if (array[i].length<3)
            array[arrayRow][i+1]=-1; 
            if (arrayRow<3) 
            array[arrayRow+1][i]=-1;}
        for (int i=0; i<arraynew.length; i++)
             while (array.length<arraynew.length) {            
                //go over line t - columns
            for (int j=0; j<arraynew[i].length; j++) {
                // if (array [i][j] <=9 && array [i][j] >=1) 
                    arraynew [i][j] = array [i][j];
                    System.out.print(arraynew[i][j]);
                }
            System.out.println();
        }
            
    return arraynew;
    } 
    }