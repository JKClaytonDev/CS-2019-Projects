import java.util.*;
import java.util.Scanner;
public class AgeGameLab{
   public static void main (String[] args){
   
   
      String name;
      int age;
      
      for (int i = 0; i<4; i++){
         Scanner keyboard = new Scanner(System.in); 
         System.out.println("Enter your name: ");
         name = keyboard.nextLine();
         System.out.println("Enter your age: ");
         age = keyboard.nextInt();
      
         if (age<16)
            System.out.println("You can't drive.");
         else if (age>=16 && age<=17)
            System.out.println("You can drive but not vote.");
         else if (age>17 && age<=24)
            System.out.println("You can vote but not rent a car.");
         else if (age>=25)
            System.out.println("You can do pretty much anything.");
      }
   }
}