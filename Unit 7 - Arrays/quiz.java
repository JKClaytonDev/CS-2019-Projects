//Jackson Clayton
//Pd 6
// 3/28/19

import java.util.*;
import java.util.Scanner;
public class quiz{
   public static void main(String[] args){
      String[] DaysofWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
      double[] Sales = new double[5];
      
      for(int i = 0; i<=4; i++){
         System.out.print("\n["+i+"] Enter "+DaysofWeek[i]+"'s sales: ");
         Scanner keyboard = new Scanner(System.in);
         Sales[i] = keyboard.nextDouble();
      }
      System.out.print("\n Which day to compare to (0-4)? ");
      Scanner keyboard = new Scanner(System.in);
      
      int compareto = keyboard.nextInt()-1;
      int abovesales = 0; //the int abovesales increases when a day is above the sales on the selected day
      
      for (int i = 0; i<=4; i++){
         if (i != compareto && i > compareto)
            abovesales++;
      }
      System.out.println(abovesales+" day's sales were above sales on "+DaysofWeek[compareto+1]);
   
   }
}
