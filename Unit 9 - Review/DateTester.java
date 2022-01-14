//Jackson Clayton
import java.util.*;

public class DateTester {
   public static void main(String[] arms){
   Scanner keyboard = new Scanner(System.in);
   System.out.println("enter date: mm dd yy");
   System.out.println(findValue(1,keyboard.nextLine()));
   System.out.println(findValue(2,keyboard.nextLine()));
   System.out.println(findValue(3,keyboard.nextLine()));
   
   
   }
   public static String findValue(int spot, String input){
   int i;
   int z;
   int f=0;
   for(z = 1; z<spot; z++){
   for(i = 0; input.charAt(i) != ' '; i++){
   }
   f+=i;
   }
   for(i = f+1; input.charAt(i) != ' '; i++){
   
   }
   return (input.substring(f,i));
   }
   
}