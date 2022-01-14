//Jackson Clayton
//Pd 6
// 3/14/19

import java.util.*;
import java.util.Scanner;
public class ArrayLibraryPractice{
   public static void main (String[] args){
      int[] elements = {23, 56, 107 ,315, 78, 52, 160 };
      int response;
      printelements(elements);
      
      System.out.print("Enter an integer from 0 "+(elements.length-1));
      Scanner keyboard = new Scanner(System.in); 
      elements[(keyboard.nextInt())] = -1;
      System.out.print(" Replacing with -1:  ");
      
      printelements(elements);
      System.out.print("Enter replacement for first:  ");
      elements[0] = (keyboard.nextInt());
      System.out.print(" Replacing first:  ");
      printelements(elements);
      
      System.out.print("Enter replacement for last:  ");
      elements[elements.length-1] = (keyboard.nextInt());
      System.out.print(" Replacing last:  ");
      printelements(elements);
      
   }
   public static void printelements (int[] elements){
      System.out.print("[ " + elements[0]);
      for (int i = 1; i<(elements.length); i++){
         System.out.print(",   " + elements[i]);
      } 
      System.out.println(" ]");
   }
}