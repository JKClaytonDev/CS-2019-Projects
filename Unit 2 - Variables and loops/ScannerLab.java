//Jackson Clayton
//pd 6
//10/5/18

import java.util.Scanner;
public class ScannerLab {
   public static void main(String args []){
           Scanner keyboard = new Scanner(System.in);
           System.out.println("insert a number");
           int number = keyboard.nextInt();
           System.out.println("the number divided by 2 is " + (number/2)+" The remainder is " + ((double) number%2));
           }
   }
