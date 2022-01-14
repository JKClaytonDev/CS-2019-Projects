//Jackson Clayton
//Pd 6

//Jokes: James Rolfe Takes Extra Sauce - 12311
//Pills: Apple Juice leaks along desks.  - 23123
//Pasta: Pauls Aunty Seems Tacky Again - 11513

import java.util.Scanner;
public class ALittleCryptography{
   public static void main (String [] args){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("enter your five word sentence");
      String word = keyboard.nextLine();
      System.out.println("enter your 1st integer");
      int int1 = keyboard.nextInt();
      System.out.println("enter your 2nd integer");
      int int2 = keyboard.nextInt();
      System.out.println("enter your 3rd integer");
      int int3 = keyboard.nextInt();
      System.out.println("enter your 4th integer");
      int int4 = keyboard.nextInt();
      System.out.println("enter your 5th integer");
      int int5 = keyboard.nextInt();
      int b=1;
      
      System.out.println(findit(word, int1-1, int2-1, int3-1, int4-1, int5-1));      
   }
public static String findit(String word, int int1, int int2, int int3, int int4, int int5){
   int d=1;
   String word1=word;
   d = word.indexOf(' ');
   String word2=word.substring(d+1);
   d = word2.indexOf(' ');
   String word3=word2.substring(d+1);
   d = word3.indexOf(' ');
   String word4=word3.substring(d+1);
   d = word4.indexOf(' ');
   String word5=word4.substring(d+1);
   d = word5.indexOf(' ');
   String word6=word5.substring(d+1);
   String Encoded = (""+word1.charAt(int1)+word2.charAt(int2)+word3.charAt(int3)+word4.charAt(int4)+word5.charAt(int5));
return Encoded;
}
}

