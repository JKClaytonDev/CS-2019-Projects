//Jackson Clayton
//Pd 6
//5/23/19
import java.util.Scanner;
import java.util.*;
public class IQAverage{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("How many numbers?  ");
      int totalNumbers = input.nextInt();
      System.out.print("\n");
      int[] numbers = new int[totalNumbers];
      for (int i = 0; i<totalNumbers; i++){
         System.out.print("Enter a number:  ");
         numbers[i] = input.nextInt();
      }
      Arrays.sort(numbers);
      int iqrtSum = 0;
      for (int i = totalNumbers/4; i<totalNumbers*0.75; i++)
         iqrtSum+=(numbers[i]);
      double iqrtAvg = (double)(iqrtSum)/(totalNumbers/2);
      System.out.println("The interquartile average is " + iqrtAvg);
   }
}