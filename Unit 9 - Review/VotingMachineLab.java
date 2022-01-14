//Jackson Clayton
//Pd 6
import java.util.*;
import java.util.Scanner;
public class VotingMachineLab {
   public static void main (String[] args){
      int tomVotes = 0;int jerryVotes = 0;int invalidVotes = 0;String vote = "";
   
      System.out.println("Please submit your vote for the 2020 presidential election");
      System.out.println("Candidates:\tTom\tJerry");
      Scanner keyboard = new Scanner(System.in); 
      while(!vote.equals("Done")){
         System.out.println("\nEnter your vote:");
         vote = keyboard.nextLine();
         if (vote.equalsIgnoreCase("Tom")){
            System.out.println("Thank you for voting for Tom.");
            tomVotes++;}
         else if (vote.equalsIgnoreCase("Jerry")){
            System.out.println("Thank you for voting for Jerry.");
            jerryVotes++;}
         else if (!vote.equalsIgnoreCase("Done")){
            System.out.println("Please submit a valid vote.");
            invalidVotes++;}
      }
      System.out.println("\n\t\t\tRESULTS:\nTotal Voters: " + (jerryVotes + tomVotes + invalidVotes) + "\n"); 
      System.out.println("There were " + invalidVotes + " invalid votes, which is " + (int)(((double)(invalidVotes)/(double)(jerryVotes + tomVotes + invalidVotes))*100) + " percent of all of the votes");
      System.out.println("Total Tom Votes: " + tomVotes + " which is "+ (int)(((double)(tomVotes)/((double)(jerryVotes) + (double)(tomVotes)))*100) + " %t of the valid votes");
      System.out.println("Total Jerry Votes: " + jerryVotes + " which is " + (int)(((double)(jerryVotes)/((double)(jerryVotes) + (double)(tomVotes)))*100) + " % of the valid votes");
      if (jerryVotes > tomVotes)
         System.out.println("\nThe winner is Jerry, who got " + jerryVotes + " votes");
      else
         System.out.println("\nThe winner is Tom, who got " + tomVotes + " votes");
   
      
      
   }
   
}