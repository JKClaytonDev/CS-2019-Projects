//Jackson Clayton
//Pd 6
// 3/26/19

import java.util.*;
import java.util.Scanner;
public class StandardDeviation{
   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int done = 0;
      int mean = 0;
      int squarecount = 0;
      int squarenums = 0;
      double alldeviation = 0.0;
      
      System.out.print("\nHow many numbers?   ");
      int count = input.nextInt();
         int[] allnumbers = new int[count];
         
      for(int r = 0; r < count; r++){
         System.out.print("\nEnter a number:   ");
         int number = input.nextInt();
         allnumbers[r] = number;
         mean = mean+number;
      }
      mean = mean/count;
      System.out.print("\nMean:    " + (double)(mean));
      double[] squares = Squares(mean, allnumbers);
      System.out.print("\nSquares:    "+Arrays.toString(squares));
      System.out.print("\nVariance:    "+deviation(allnumbers, mean, 3));
      alldeviation = (deviation(allnumbers, mean, 1));
      System.out.print("\nStandard Deviation:    "+alldeviation);
   }
   
   public static double[] Squares(double mean, int[] allnumbers){
      int squarenums = 0;
      int squarecount = 0;
      double[] squares = new double[allnumbers.length];
      for (int i = 0; i < allnumbers.length; i++){
         squares[i] = (allnumbers[i]-mean)*(allnumbers[i]-mean);
      }
      return squares;
   }
   public static double deviation(int[] allnumbers, int mean, int setting){
      double alldeviation = 0;
      for (int i = 0; i < allnumbers.length; i++)
         alldeviation = alldeviation+(allnumbers[i]-mean)*(allnumbers[i]-mean);
      alldeviation = alldeviation/(allnumbers.length);
      if (setting == 1){
         alldeviation = Math.sqrt(alldeviation);
      }
      return alldeviation;
   }
}