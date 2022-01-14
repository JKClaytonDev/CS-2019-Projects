   //Jackson Clayton
   //Pd 6
   //3/6/19
import java.util.*;
import java.util.Scanner;

public class Pizza{
public static final int MAX = 4;
   public static void main (String[] args){
      String [] toppings = new String[MAX];
      String response = "";
      int addlength = 0;
      for(int i = 0; i < toppings.length; i++){
         toppings[i] = "zzzzzz";
      }
      for(int i = 0; response.equals("aquit") == false && toppings[MAX-1] == "zzzzzz"; i++){
         System.out.print("Enter a topping (or type quit)    ");
         Scanner keyboard = new Scanner(System.in);  
         response = ("a"+keyboard.nextLine());
         if (!response.equals("aquit")){
            toppings[i] = response;
            addlength++;
            }
      }
      if (toppings[MAX-1].equals("zzzzzz") == false)
         System.out.println("No more toppings alowed.");
    
      Arrays.sort(toppings);
      int listlength = 1;
      for (int i = 0; i < addlength; i++){
         System.out.println(listlength+". "+(toppings[i].substring(1,toppings[i].length())));
         listlength++;
      }
   }
}