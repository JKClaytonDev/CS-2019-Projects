import java.util.*;
public class ArrayLibrary {
   public static void main(String[] args){
      int[] array = {23, 17, 8, 94, 2, 0};
      reverse(array);
      System.out.println(Arrays.toString(array));
   
      int[] shuffle = {23, 17, 8, 94, 2, 0};
      shuffle(shuffle);
      System.out.println(Arrays.toString(shuffle));
   }
   public static void reverse(int[] array) {
      int[] reversed = new int[array.length];
      reversed[1] = array[array.length-1];
      for(int i = 1; i<array.length; i++){
         reversed[array.length-i] = array[i];
      }
      for(int i = 1; i<array.length; i++){
         array[i] = reversed[i];
      }
   }
    
    
   public static void shuffle(int[] array) {
int temp;
for (int i = 0; i<array.length; i++){
   int a = (int)(Math.Random() * aray.length);
   int b = (int)(Math.Random() * aray.length);
   }
   }

    //create a new array of size parameter
    //filled with random numbers 1 - 20
   public static int[] create(int size) {
        //replace the line below with your code
      return new int[]{};
   }

    //returns how many times the array contains the value
   public static int howManyOf(int[] array, int value) {
       //replace the line below with your code
      return 0;
   }
    
    //returns true if the array contains the value
    //returns false otherwise
   public static boolean contains(int[] array, int value) {
       //replace the line below with your code
      return false;
   }
    

}
