import java.util.*;
public class ArraysMethods_2_Lab{ 
   public static void main(String[] args){
      int [] arr= {-1, -3,-56, -21, -5, 7, -1, 57, -2, -89, 45, -6, -21, -10, -50,-5};
      Scanner input= new Scanner (System.in);
      // checking the range of the array
      int result1= arrayRange(arr);
      System.out.println ("The distance between min and max = "+result1);
       // checking second largest
      int result2= secondLargest(arr);
      System.out.println ("The second largest value in the array is "+result2);
    // checking sum of 30
      int [] arr1= {-1, 10,-56, -21, -5, 7, 10, 57, -2, -89, -45, -6, 3, 10, -50,-5};
      boolean result3= sum30(arr1);
      System.out.println ("The sum of all 10's = 30? "+result3);
      int [] arr2= {56, -21, -5, 7, 10,  21, 2, -1, 10};
      result3= sum30(arr2);
      System.out.println ("The sum of all 10's = 30? "+result3);
   // checking common elements
      System.out.println ("\nLooking for common elements in the arrays "); 
      int [] arr3= {56, -21, -5, 7, 10,  21, 2, -1};
      int [] arr4= {-1, -56, 5, 21, 3 , 7, 4, -6, 2, 90};
      int [] result4 = commonElements(arr3, arr4);
      System.out.println (Arrays.toString(arr3));
      System.out.println (Arrays.toString(arr4));  
      System.out.print ("\nCommon elements array:  ");
      System.out.println (Arrays.toString(result4));
      // moving zeros
      System.out.println ("\nMoving Zeros  ");
      int [] arr5= {-1, -56,0, 0,  5, 21,0, 3 , 7, 4,0, -6, 2, 90, 0};
      System.out.println (Arrays.toString(arr5));
      System.out.println (Arrays.toString( moveZeros(arr5)));      
   }
   //
   public static int arrayRange (int [] a){
     int max = a[1];
     for (int i = 0; i<a.length; i++){
     if (a[i] > max)
     max = a[i];
     }
     int min = a[1];
     for (int i = 0; i<a.length; i++){
     if (a[i] < min)
     min = a[i];
     }
     return max-min;
   }
   //
   public static int secondLargest (int [] a){
     int max = a[1];
     for (int i = 0; i<a.length; i++){
     if (a[i] > max)
     max = a[i];
     }
     int lastmax = a[1];
     for (int i = 0; i<a.length; i++){
     if (a[i] > lastmax && a[i]!= max)
     lastmax = a[i];
     }
     return lastmax;
   }
   public static boolean sum30(int[] a){
    int tens = 0;
     for (int i = 0; i<a.length; i++){
     if (a[i] == 10)
     tens++;
     }
     return(tens == 3);
   }
   
   //
   public static int [] commonElements(int []a, int [] b){
     int progress = 0;
     for (int i =0; i<a.length; i++){
     for (int x =0; x<b.length; x++){
     if (a[i] == b[x])
     progress++;
     }
     }
     int[] common = new int[progress];
     progress = 0;
     for (int i =0; i<a.length; i++){
     for (int x =0; x<b.length; x++){
     if (a[i] == b[x]){
     common[progress] = a[i];
     progress++;
     }
     }
     }
     return common;
   }
   //
   public static int [] moveZeros (int []a ) {
     int progress = 0;
     int[] b = new int[a.length];
     for (int i = 0; i<a.length; i++){
     if (a[i] == 0){
     b[progress] = 0;
     progress++;
     }
     }
     for (int i = 0; i<a.length; i++){
     if (a[i] != 0){
     b[progress] = a[i];
     progress++;
     }
     }
     return b;
   }
}
/*
The distance between min and max = 146
 The second largest value in the array is 45
 The sum of all 10's = 30? true
 The sum of all 10's = 30? false
 
 Looking for common elements in the arrays 
 [56, -21, -5, 7, 10, 21, 2, -1]
 [-1, -56, 5, 21, 3, 7, 4, -6, 2, 90]
 
 Common elements array:  [7, 21, 2, -1]
 
 Moving Zeros  
 [-1, -56, 0, 0, 5, 21, 0, 3, 7, 4, 0, -6, 2, 90, 0]
 [0, 0, 0, 0, 0, -1, -56, 5, 21, 3, 7, 4, -6, 2, 90]
*/