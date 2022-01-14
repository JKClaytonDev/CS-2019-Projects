//probability of shooter winning his bet at caps
//ask the user for the number of games to simulate
//simulates all of those games
import java.util.*;
import java.util.Scanner;
public class GameofCrops{
   public static void main(String[] args){
       
      Scanner input = new Scanner(System.in);
      Random ran = new Random();  // instantiates a random class variable
      int die1,die2,dice,response;
      int point = 0;
      int count = 0;
      int gamespot = 0;
      int shooterwins = 0;
      System.out.println("How many games of craps would you like me to simulate?");
      response = input.nextInt();
      System.out.println(""+response);
     
      while (count < response){
         count++;
         while(gamespot != 2){
            die1 =  ran.nextInt(6)+1;
            die2 =  ran.nextInt(6)+1;
            dice = die1+die2;
            System.out.println("The dice came up "+die1+ " and "+die2+" for a total of " + dice);
          
            if ((gamespot == 1 && dice == 7 )||((dice == 2 || dice == 3 || dice == 12) && gamespot == 0))
            {
               gamespot = 2;
               System.out.println("\tHOUSE WINS.\n");
            }
            
            else if ((gamespot == 1 && dice == point) || ((dice == 7 || dice == 11) && gamespot == 0))
            {
               gamespot = 2;
               System.out.println("\tSHOOTER WINS.\n");
               shooterwins++;
            }
            
            else if (gamespot == 0)
            {
               gamespot = 1;
               point = dice;
               System.out.println("\tTHE POINT IS " + dice);
            }
            
         }
         die1 = 0;
         die2 = 0;
         dice = 0;
         gamespot = 0;
      }
      System.out.println("The shooter won " + (shooterwins) + " games");
      System.out.println("The house won " + (count-shooterwins) + " games");
      System.out.println("The shooter won " + ((int)(100*((double)shooterwins/(double)response))) + "% of the games");
   }
}