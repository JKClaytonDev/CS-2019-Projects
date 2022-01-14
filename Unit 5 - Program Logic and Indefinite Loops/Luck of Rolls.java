//Jackson Clayton
//2/5/2019

import java.util.*;
public class DiceRoll{
   public static void main(String[] args){
       
      Scanner input = new Scanner(System.in);
      Random ran = new Random();
      int die1;
      int die2;
      int dice = 0;
      int count = 0;
     
      while(dice != 7){
         die1 =  (int)(Math.random()*(6)+1);
         die2 =  (int)(Math.random()*(6)+1);
         dice = die1+die2;
         count++;
         System.out.println("The dice came up "+die1+ " and "+die2+" for a total of " + dice);
      }
      System.out.println("\nIt took " + count + " rolls to get a 7");
   }
}