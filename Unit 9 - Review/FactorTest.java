import java.util.*;
public class FactorTest{
   public static void main (String[] args){
   int[] values = findValues(27);
   for (int i = 0; i<values.length; i++){
   
   }
   System.out.println(Arrays.toString(findValues(27)));
   
   }
   public static int[] findValues (int input){
      int progress = 0;
      for(int a =2; a<input-1; a++){
         for(int b =2; b<input-1; b++){
                  progress++;
                  progress++;
         }
      }
      if (progress != 0){ 
      int[] multvalues = new int [progress];
      progress = 0;
      for(int a =2; a<input-1; a++){
         for(int b =2; b<input-1; b++){
                  if (a*b == input){
                  multvalues[progress] = a;
                  progress++;
                  multvalues[progress] = b;
                  progress++;
                  }
         }
      }
      return multvalues;
      }
      else{
      int[] multvalues = new int [0];
      multvalues[0] = input;
      return multvalues;
      }
   }
   public static char checkifPrime(int a, int b){
      char Prime = 'y';
      for (int i = 2; i<a-1; i++){
         if (a%i == 0)
            Prime = 'a';
      }
      for (int i = 2; i<b-1; i++){
         if (b%i == 0){
            if (Prime == 'a')
            Prime = 'x';
            else
            Prime = 'b';
            }
      }
      return Prime;
   }
}