
import java.util.*;
import java.util.Scanner;
public class findPizza{
   public static void main (String[] args){
      String[] words = {"burger", "dog", "ham", "george", "peer", "review", "pizza", "candy", "cat"};
      Scanner keyboard = new Scanner(System.in); 
      System.out.println(Arrays.toString(words)+"\nWhich word do you want to replace?");
      String wanted = keyboard.nextLine();
      findword(words, wanted);
   }
   public static int findword (String[] words, String wordwanted){
   Arrays.sort(words);
   if ((words[(int)words.length/2]) == wordwanted)
   return 0;
   else
   return 1;
   }
}