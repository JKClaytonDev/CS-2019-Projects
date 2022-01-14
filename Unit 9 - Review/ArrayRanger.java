//Jackson Clayton
//Pd 6
//5/15/19
import java.util.*;
import java.util.Scanner;
public class ArrayRanger{
   public static void main (String[] args){
      int[] mainArray = {12,53,31,76,91,14,43,85,26,87,78,59,10,71,2,23,54,15,46,7,18,29,13,54,25,6};
      Scanner keyboard = new Scanner(System.in); 
      System.out.println("Please enter your min: ");
      int min = keyboard.nextInt();
      System.out.println("Please enter your max: ");
      int max = keyboard.nextInt();
      if (Arrays.toString(arrayInRange(mainArray,min,max)) != "[]")
         System.out.println("The numbers in the array between "+min+" and "+max+" are " + printArray(arrayInRange(mainArray,min,max)));
      else
         System.out.println("There are no numbers in the array between "+min+" and "+max);
      
   }
   
   public static int countInRange(int[] array, int min, int max){
      int inRange = 0;
      for (int i = 0; i<array.length; i++){
         if (array[i] >= min && array[i] <= max)
            inRange++;
      }
      return inRange;
   }
   
   public static int[] arrayInRange(int[] array, int min, int max){
      int inRange = 0;
      int[] inRangeArray = new int[array.length];
      for (int i = 0; i<array.length; i++){
         if (array[i] >= min && array[i] <= max){
            inRangeArray[inRange] = array[i];
            inRange++;
         }
      }
      
      int[] checkArray;
      if (inRange != 0){
         int[] finalArray = new int[inRange];
         for (int i = 0; i<inRange; i++)
            finalArray[i] = inRangeArray[i];
         checkArray = finalArray;
      }
      else{
         int[] finalArray = {};
         checkArray = finalArray;
      }
      return checkArray;
   }
   
   public static String printArray(int[] array){
      String fullArray = ("{");
      if (array.length != 0){
         for (int i = 0; i<array.length-1;i++)
            fullArray+=(array[i]+" ,");
         fullArray+=(array[array.length-1]+"}");
      }
      return fullArray;
   }

}