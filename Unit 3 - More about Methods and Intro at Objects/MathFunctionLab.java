//Jackson Clayton
//pd 6
//10/5/18

import java.util.Scanner;
public class MathFunctionLab {
   public static void main (String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print ("How high do you want the chart to go? ");
      int n = keyboard.nextInt();
      System.out.println("\nNumber	Square\tSquare Root\tCube\tCube Root");
      for (int j = 1; j<= n; j++)
      {
         System.out.println(j + "\t" + ((j)*(j))+"\t" + round2(Math.sqrt(j)) + "\t\t" + ((j*j*j))+"\t" + round2(Math.pow(j, 1.0/3.0)));//returns 25.25
      }
   
   }
   public static double round2(double x){
      return Math.round(x*100)/100.0;
   }
}