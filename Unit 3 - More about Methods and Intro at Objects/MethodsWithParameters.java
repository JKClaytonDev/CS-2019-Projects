// rectangle is an overloaded method because it has the samae method name
//with different parameter lists
  
import java.util.Scanner;

public class MethodsWithParameters {
   public static void main(String[] args) {
      lattice (1);
      System.out.println("\n");
      lattice (5);
      int inches = 114;
      int feet1 = 12;
      int feet2 = 32;
      int yards = 9;
      int feet3 = 12000;
      double miles = 7.5;
      System.out.println(inches + " inches in feet is " + inchesToFeet(inches));
      System.out.println(feet1 + " feet in inches is " + feetToInches(feet1));
      System.out.println(feet2 + " feet in yards is " + feetToYards(feet2));
      System.out.println(yards + " yards in feet is " + yardsToFeet(yards));
      System.out.println(feet3 + " feet in miles is " + feetToMiles(feet3));
      System.out.println(miles + " miles in feet is " + milesToFeet(miles));
      System.out.println("\n");
      String eq1=getLineEquation(5.2, 3.7);
      System.out.println(eq1);
      String eq2=getLineEquation(4.5, 3.1, 2.5);
      System.out.println(eq2);
      String eq3=getLineEquation(0, -2, 3, 4);
      System.out.println(eq3);
   
   }

   public static String getLineEquation(double a, double b){
      String three = "y = " + a + "x + " + b ;
      return three;
   }
   
   public static String getLineEquation(double a, double b, double c){
      String three = "y - " + c + " = " + a +"(x - " + b + ")";
      return three;
   }
   
   public static String getLineEquation(double a, double b, double c, double d){
      double m = ((d-b)/(c-a));
      String three = "y - " + d + " = " + m +"(x - " + c + ")";
      return three;
   }

   public static double milesToFeet(double miles){
      double feet=miles*5280;
      return feet;
   }
   public static double feetToMiles(double feet3){
      double miles=feet3/5280;
      return miles;
   }
   public static double yardsToFeet(double yards){
      double feet=yards*3;
      return feet;
   }
     
   public static double feetToYards(double feet2){
      double yards=feet2/3;
      return yards;
   }
      
   public static double inchesToFeet(double inches){
      double feet=inches/12;
      return feet;
   }
      
   public static double feetToInches(double feet1){
      double inches=feet1*12;
      return inches;
   }
      
   public static void lattice(int count) {
      for (int j = 1; j<= count; j++)
      {
         outer();
         middle();
         inner();
         middle();
         outer();
      }
   }
  	

   public static void outer() {
      System.out.println("  *    *    *    *");
   }
   public static void middle() {
      System.out.println(" * *  * *  * *  * *");
   }
   public static void inner() {
      System.out.println("*   **   **   **   *");
   }
}


