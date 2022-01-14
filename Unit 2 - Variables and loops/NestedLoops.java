// Jackson Clayton
//pd 1

public class NestedLoops {
      public static void main(String[] args) {
         
         for (int a=0; a<=5; a++){
         System.out.println ("");
            for (int i=0; i<=5; i++){
            System.out.print ("("+i+","+a+")");
         }
         }

		   System.out.println("\n\n 1 2 3 4 5 6 7 8 9  10  11  12 ");
         System.out.println("===============================");
         for (int a=2; a<=12; a++){
         System.out.println ("");
            for (int i=1; i<=12; i++){
            System.out.print (i*a + " ");
            if (i>=10) {
            System.out.print (" ");
            }
            if (i==1) {
            if (a<=9.9) {
            System.out.print (" | ");
            }
            if (a>=10) {
            System.out.print ("| ");
            }
            }
         }
         }
         System.out.println (" ");
         for (int a=0; a<=99; a++){
         System.out.println (a + ", " + (a/10) + "+" + (a%10) + " = " + ((a/10) + (a%10)));
         
         }
         }
}

