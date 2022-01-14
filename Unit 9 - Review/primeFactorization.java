import java.util.*;
import java.util.Scanner;
public class primeFactorization{
private static int arrayCheck;
   public static void main (String[] args){
      arrayCheck = 0;
      System.out.println(getPrimefactor(23));
   }
      public static String getPrimefactor(int input){
         String[] multvalues = new String [input];
         int progress = 0;
         for(int a =2; a<input-1; a++){
         for(int b =2; b<input-1; b++){
         if (a*b == input){
         if (checkifPrime(a,b)){
         multvalues[progress] = (a+" * "+b+" = "+input);
         }
         }
         }
         }
      return (Arrays.toString(multvalues));
   }
   public static boolean checkifPrime (int a, int b){
   boolean Prime = true;
   for (int i = 2; i<a-1; i++){
   if (a%i == 0)
   Prime = false;
   }
   for (int i = 2; i<b-1; i++){
   if (b%i == 0)
   Prime = false;
   }
   return Prime;
   }
   public static int[] splitIntovalues (int a, int b){
   boolean Prime = true;
   for (int i = 2; i<a-1; i++){
   if (a%i == 0)
   
   }
   for (int i = 2; i<b-1; i++){
   if (b%i == 0)
   Prime = false;
   }
   return Prime;
   }
   public static int[] addtoArray (int input, int[] array, int spot){
   int[] newarray = new int[array.length+1];
   int i = 0;
   for (i = 0; array[i] != 0; i++){
   newarray[i] = array[i];
   }
   if (spot == arrayCheck){
   newarray[i] = input;
   arrayCheck++;
   }
   else{
   newarray[spot] = input;
   }
   return newarray;
   }

}