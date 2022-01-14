//Jackson Clayton
//Pd 6
//3/6/19
import java.util.*;
import java.util.Scanner;

public class PercentEven{
   public static void main (String[] args){
      int even = 0;
      System.out.print("\nHow many numbers in the array?    ");
      Scanner keyboard = new Scanner(System.in);
      int [] totalNumbers = new int[keyboard.nextInt()];
      int [] totalEven = new int [totalNumbers.length];
      for (int i = 0; i<totalNumbers.length; i++){
         System.out.print("\nEnter an integer:    ");
         totalNumbers[i] = keyboard.nextInt();
      }  
      for (int i = 0; i<totalNumbers.length; i++)
         if (totalNumbers[i]%2 == 0){
            totalEven[even] = totalNumbers[i];
            even++;
         }
        
      System.out.println(even);
      System.out.print("\nThere were "+(double)(100*even)/(double)totalNumbers.length+"% of even numbers.\n");
      System.out.print("Even values are: ");
      for (int i = 0; i<even; i++){
         System.out.print(totalEven[i]);
         if (i != even-1){
         System.out.print(", ");
         }
      } 
   
   }
}