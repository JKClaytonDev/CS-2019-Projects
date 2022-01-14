
import java.util.Scanner;
public class Roommate {
   public static void main(String args []){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("I will tell what kind of roomate you are.");
      System.out.print("\nDo you have a job? (YES or NO)\n");
      String answer = keyboard.next();
      System.out.print(answer);
      if (answer == " "){
         System.out.print("\nAre you in a relationship? (YES or NO)");
         answer = keyboard.nextLine();
         //you are in a relationship
         if (answer == "yes"){
            System.out.print("\nDoes you bf/gf have a roommate? (YES or NO)");
            answer = keyboard.nextLine();
            //your bf/gf has a roommate
            if (answer == "yes"){
               System.out.println("You are The Lover");
            }
            //your bf/gf does not have a roommate
            if (answer == "no"){
               System.out.println("You are The Ghost");
            }
         }
         //aren't in a relationship
         if (answer == "no"){
         
         }
      }
      //you don't have a job
      if (answer == "no"){
      
      }
      
   }
}