import java.util.*;
import java.util.Scanner;
public class bloodPressuretester{
   public static void main (String[] args){
      for(int i = 1; i<9S; i++){
         Scanner keyboard = new Scanner (System.in);
         bloodPressure Patient = new bloodPressure();
         System.out.print("What is the patient's name?   ");
         Patient.setName(keyboard.nextLine());
         
         System.out.print("Systolic:   ");
         Patient.setSys(keyboard.nextInt());
         
         System.out.print("Diastolic:  ");
         Patient.setDias(keyboard.nextInt());
         
         System.out.println("\n" +  Patient.getName() + " has " + Patient.getCat() + "\n");
         
      
      }
   }
}