//Jackson Clayton
//pd 6
//10/5/18

import java.util.Scanner;
public class StringsLab {
   public static void main(String args []){
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a phrase: ");
      String phrase = keyboard.nextLine();
      System.out.println(" ****" + phrase + "****");
      System.out.println("You Typed: " + phrase);
      System.out.println("Your string is " + (phrase.length()-1) + " characters long.");
      int l = (phrase.length() -1);
      System.out.println("The first character: " + phrase.charAt(0));
      System.out.println("The last character: " + phrase.charAt(l-1));
      System.out.println("All uppercase is: " + phrase.toUpperCase());
      System.out.println("All lowercase is: " + phrase.toLowerCase());
      System.out.print("First word cut off:" + phrase.substring(phrase.indexOf(' '), phrase.length() ));    
      System.out.println(" ");i
      System.out.print("What character would you like to replace? ");
      String char1 = keyboard.nextLine();
      System.out.print("What character would you like to replace it with? ");
      String char2 = keyboard.nextLine();
      System.out.println("Replacing all the " + char1 + "'s with " + char2 + "'s :");
      System.out.println(phrase.replace(char1, char2));
           
   
   }
}
