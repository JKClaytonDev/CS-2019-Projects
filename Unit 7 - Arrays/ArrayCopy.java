//Jackson Clayton
//Pd 6
// 4/1/19

import java.util.*;
import java.util.Scanner;
public class ArrayCopy {
   public static void main(String[] args) {
      int[] array = {5,34,190,5, 25, 60, 90, -50};
      int[] arraycopy = new int[array.length];
      for (int i = 0; i<array.length; i++)
         arraycopy[i] = array[i];
      print(array, arraycopy);
      int kb = (keyboard(1));
      if (kb == 1)
         Arrays.sort(array);
      else
         Arrays.sort(arraycopy);     
      print(array, arraycopy);
      
      kb = (keyboard(1));
      int choice = kb;
      if (kb == 1){
         arraycopy = array;
         print(array, arraycopy);  
         array[0] = (keyboard(0));
      }
      else{
         array = arraycopy;
         print(array, arraycopy);  
         arraycopy[0] = (keyboard(0));
      }      
      print(array, arraycopy);
   }
    
   public static int keyboard(int binary){
      int kb = 0;
      int checked = 0;
      while (kb != 1 && kb != 2 && checked == 0){
         if (binary == 0)
            System.out.print("\ntype any number: ");
         else
            System.out.print("\ntype 1 or 2: ");
         Scanner keyboard = new Scanner(System.in); 
         kb = keyboard.nextInt();
         if (binary == 0)
            checked = 1;
      }
      return kb;
   }
   public static void print(int[] array, int[] arraycopy){
      System.out.println(Arrays.toString(array));
      System.out.println(Arrays.toString(arraycopy));
   }
}
