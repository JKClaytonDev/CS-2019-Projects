//Jackson Clayton
//pd 6
//10/5/18

import java.util.Scanner;
public class GenderGame {
   public static void main(String args []){
         //getting base info about the person
              Scanner keyboard = new Scanner(System.in);
              System.out.print("What is your gender (1=Male, 2=Female)?  ");
              int gender = keyboard.nextInt();
              System.out.print("\nFirst name:  ");
              String firstname = keyboard.next();
              System.out.print("\nLast name:  ");
              String lastname = keyboard.next();
              System.out.print("\nAge: ");
              int age = keyboard.nextInt();
          //beginning the name and asking questions
               if (gender == 2){
                  if (age >=20){
                  System.out.print("\nAre you married, "+ firstname +  "  (1=Yes, 2=No)? ");
                  if (keyboard.nextInt() == 1)
                  firstname = ("Mrs. ");
                  else
                  firstname = ("Ms. ");
               }
               }
               else{
               if (age >=20)
                  firstname = ("Mr. ");
               }
               System.out.println("then I shall call you " + firstname + " " + lastname + ".");
               
           }
   }
