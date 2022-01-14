//We use a Scanner to input the money we add each week
import java.util.Scanner;

public class Cumulative
{
   public static void main(String[] args)
   {
   
Scanner keyboard = new Scanner(System.in);

// we initialize the bank account to 0
int bankAccount = 0;
int weeksNum=4;
//we add a for loop so we can add money each week.  In this case it is 4 weeks
for(int week=1; week<=weeksNum; week++){

//we need to ask how much money is added for the week
System.out.print("\nHow much money do you want to add for week #"+ week+ "?  ");
int weeklySaving = keyboard.nextInt();


/* this takes the amount already in the bank account 
and adds what is put in each week to give you the current balance*/
bankAccount= bankAccount+weeklySaving;

System.out.println("\tAfter week #" + week + " you have $" + bankAccount);
 }
 System.out.println("\t\tAfter a month you have saved $" + bankAccount);
}
} 
