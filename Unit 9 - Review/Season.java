//Jackson Clayton
//Pd 6
//5/23/19
import java.util.*;
import java.util.Scanner;
public class Season{

   public static void main (String[] args){
      Scanner keyboard = new Scanner(System.in);
      int M = askforInt("Month: ",1,12, keyboard);
      int D = askforInt("Day: ",1,31, keyboard);
      System.out.print("The season is "+getSeason(M,D));
   }
   
   public static String getSeason(int M, int D){
      //This gets the season by combining the day and month into one number, since both can only be 2 digits.
      int totalMD = M*100+D;
      if (totalMD >= 321 && totalMD <= 620)
         return "Spring";
      else if (totalMD >= 621 && totalMD <=922)
         return "Summer";
      else if (totalMD >= 923 && totalMD <= 1221)
         return "Fall";
      else if ((totalMD >= 1222 && totalMD <= 1231) || (totalMD >= 11 && totalMD <=320))
         return "Winter";
      else
         return "NonReal Season";
   }
   
   public static int askforInt (String question, int bottom, int top, Scanner keyboard){
   //This makes sure that the user types in a real date, and will continue to ask the same question until it gets one
   //The reason I need this is because if the user typed in the date 0/11 or 11/0, the program would read it as 1/1.
      int response = bottom-1;
      while (response>top || response<bottom){
         System.out.print(question);
         response = keyboard.nextInt();
         if (response>top || response<bottom)
            System.out.println("\nNot a valid answer, try again.\nValid responses are from "+bottom+" to "+top+"\n");
      }
      return response;
   }
   
}