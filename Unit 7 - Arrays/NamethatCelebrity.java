//Jackson Clayton
//5/9/19

import java.util.*;
import java.util.Scanner;
public class NamethatCelebrity{
   public static void main (String[] args){
      System.out.println("Enter a Celebrity's name: ");
      Scanner keyboard = new Scanner(System.in); 
      String Celebrity = keyboard.nextLine();
      if (Celebrity.replace(" ","").length() > 5){
         String Disguised = Celebrity.replace(" ","");
         Disguised = Disguised.substring(2,Disguised.length()-3);
         System.out.println(Disguised);
      }
      else{
         System.out.println("That name is not long enough!");
      }
   }
}