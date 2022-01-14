public class ManyMethodslab {
   public static void main (String [] args){
      printPowersOf2(3);
      printPowersOf2(10);
   }
   public static void printPowersOf2(int powerlimit){
      System.out.println("");
      int currentnumber=1;
      for (int a=1 ; a<powerlimit ; a++) {
         System.out.print(currentnumber*2);
         currentnumber=(currentnumber*2);
   }
   }
   }
         
