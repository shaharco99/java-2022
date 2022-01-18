/**
 * 
 * @author Shahar
 * @version 15.01.2022
 */
public class Ex14
{  
   /** question 1 :return the value of the minimum distence between 2 index of prameters or Integer.MAX_VALUE if not in array given  o(n^2) */
   //find the index of parmeter in array
   public static int [] findIndex(int []a,int num){ 
    int indexInArray = 0;
    //new array of posible indexs of parmetre
    int [] indexArray = new int[a.length];
    //add to the array the posible indexs unless parmetre not in array then -1
    for (int i = 0 ; i <a.length;i++){
        if(a[i]==num){
            indexArray[indexInArray] = i;         
        }
        else
        { 
            indexArray[indexInArray] = -1;
        }        
        //System.out.println("index of "+num+" is "+ indexArray[indexInArray]);
        indexInArray ++;
    } return indexArray;
   }
   //check if x or y are not in array 
   public static int findMinDiff (int[] a, int x, int y){
    int []indexOfy = findIndex(a,y);
    int []indexOfx = findIndex(a,x);
    int []diff = new int[a.length];
    boolean xEmpty=true;
    boolean yEmpty=true;  
    for(int j = 0 ; j < a.length;j++){       
          if (indexOfy[j] != -1) {
              yEmpty=false;
            }
          if (indexOfx[j] != -1) {
              xEmpty=false;
          }         
    }
    //return Integer.MAX_VALUE if x or y indexs are empty
    if(xEmpty==true||yEmpty==true){
        return Integer.MAX_VALUE;
    }
    //no need to check if y or x is empty
    for (int i = 0; i<a.length;i++){     
       for(int j = 0;j<indexOfx.length;j++){
        if (indexOfy[i] != -1 && indexOfx[j] != -1){
        //calc the min diffrence between index of y and index of x and dependig on how is bigger indexOfx or indexOfy
            diff[i]=Math.abs (indexOfy[i]-indexOfx[j]) ;
        }
       }
    }
    // initialize diffMin O(n)
    int diffMin = Integer.MAX_VALUE; 
    for (int i = 0; i<diff.length;i++){
        if (diff[i] < diffMin && diff[i] > 0)
        diffMin=diff[i];        
    }
    return diffMin;
   }
   /** question 2 :search if and where num is in mat O(n^2) */
   public static boolean Search (int [][] mat, int num){
       int j = 0;
       //run on row 
       for (int i = 0 ; mat[i][j]>=num;i++){
         //run on colum in row
         for (j = 0 ; mat[i][j]>=num;j++){
            if (mat[i][j]==num){
                System.out.println("row = " + i + "col = " + j + "num is " + num);
                return true;}
                else if (mat[i][j]>num){
                return false ;
            }
         }
       }
       return false;
   }
   /** question 3 :check if array is equalSplit */
   public static boolean equalSplit (int[] arr) {
        int mid = arr.length/2;
        if (arr.length%2==0){
        int sumLo = sum(arr,0,mid);
        int sumHi = sum(arr,mid+1,arr.length);
        if (sumHi==sumLo){
            return true;
            }
        }        
        return false;             
   }   
    public static int sum (int[] arr ,int lo , int hi) {
        int mid = (lo + hi)/2;
        if (hi==mid || mid ==lo){
            return arr[mid];  
        }
        if (hi > mid){
            return arr[mid]+sum(arr,lo,hi-1);
        }
        if (lo < mid){
            return arr[mid]+sum(arr,lo+1,hi);
        }
        return 0;
   }
   /** question 4 :check if n is Special number */
   public static Boolean isSpecial(int n){
       
       return true; 
   }
} 