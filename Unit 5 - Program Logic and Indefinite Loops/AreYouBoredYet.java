//Jackson Clayton
//Pd 6
// 1/29/19 
import java.util.Scanner;
public class AreYouBoredYet   {
   public static final int ATTEMPTS = 3;
   public static final int SENTINEL = 1;
      public static void main (String [] args) {
         int compturns = 1;
         int bored = -1; //bored is set to -1 to make sure that it doesn't say hmmm... before the first question
         //this loop finishes when the user confirms that they are bored, or when the computer has asked 10 times
         while (bored != SENTINEL && compturns < ATTEMPTS){
            if (bored == -1)
               bored = 0;
            else{
               compturns++;
               System.out.println("Hmm..");
            }
            bored = 2000; 
            while (bored != SENTINEL && bored !=0){ //this loop forces the user to enter 1 or 0
               if (!(bored != SENTINEL && bored !=0 && bored != 2000)){ //this 2000 makes sure that bored has been changed from user input
                  System.out.print("Are you bored yet? [Press "+SENTINEL+" for Yes, 0 for No]: ");
               }
               Scanner keyboard = new Scanner(System.in);
               bored = keyboard.nextInt();
               if (bored != SENTINEL && bored !=0 && bored != 2000){
                  System.out.print("[Press "+SENTINEL+" for Yes, 0 for No]: ");
               }
            }
         }
         if (compturns >= ATTEMPTS)
            System.out.println("I give up.");
         else
            System.out.println("Finally!");
      }
   }