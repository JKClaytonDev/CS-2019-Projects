//Jackson Clayton
//2/5/2019

import java.util.*;
public class LuckofRolls{
   public static void main(String[] args){
      Random ran = new Random();
      int rolls, P1dice, P2dice, P1, P2;
      int count = 1;
      P1 = 0;
      P2 = 0;
      Scanner input = new Scanner(System.in);
      P1dice = 0;
      P2dice = 0;
      rolls = 0;
      
      System.out.print("How many games do you want to play? ");
      int response = input.nextInt();
      
      while(count <= response+1){
         if (count <= response){
            System.out.println("\n    *** GAME "+count+" ***");
            P1dice = 0;
            P2dice = 0;
            rolls = 0;
            System.out.println("Roll  Player 1  Player 2");
            while (P1dice < 21 && P2dice < 21){
               rolls++;
               P1dice = P1dice+(int)(Math.random()*(6)+1);
               P2dice = P2dice+(int)(Math.random()*(6)+1);
               System.out.println("  "+rolls+"\t"+P1dice+"\t  "+P2dice);
            }
            count++;
            if ((P1dice == P2dice)||(P1dice > 21 && P2dice > 21)){
            System.out.println("\nIt's a tie!");
            }
            else if (P1dice == 21 || P2dice > 21){
               System.out.println("\nPlayer 1 wins");
               P1++;
            }
            else if (P2dice == 21 || P1dice > 21){
               System.out.println("\nPlayer 2 wins!");
               P2++;
            }
         }
         else{
            System.out.println("\n  *** GAME SUMMARY ***");
            System.out.println("Player 1   Player 2   Ties    ");
            System.out.println("   "+P1+"\t\t"+P2+"\t"+(response-P1-P2));
            count++;
         }
      }
   }
}