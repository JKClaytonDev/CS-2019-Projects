public class stars {
   public static void main (String [] args) {
      star1();
      star2();
      star3();
      star4();
      star5();
      star6();
      star7();
      star8();
   }
public static void star1() {
   //task 1
   System.out.println ("\n \n Task 1 \n");
   for (int a=1 ; a<= 5 ; a++) {
   System.out.print ("*");
         }
      }
      
public static void star2() {
      //creating a new line
      System.out.println ("\n \n Task 2 ");
      //task 2
      for (int b=1 ; b<=4 ; b++) {
      System.out.println();
         for (int c=1 ; c<=5 ; c++) {
         System.out.print ("*");
         }
      }
}

public static void star3() {
      //creating a new line
      System.out.println ("\n \n Task 3 ");
      //task 3
      for (int d=1 ; d<=4 ; d++) {
         System.out.println();
         for (int b=1 ; b<=4 ; b++) {
         System.out.println();
            for (int c=1 ; c<=5 ; c++) {
            System.out.print ("*");
            }
         }
      }
}

public static void star4() {
      //task 4
      //creating a new line
      System.out.println ("\n \n Task 4 ");
         System.out.println();
         for (int b=1 ; b<=5 ; b++) {
         System.out.println();
            for (int c=1 ; c<=10 ; c++) {
            System.out.print ("*");
            }
         }
}

public static void star5(){
      //task 5
      //creating a new line
      System.out.println ("\n \n Task 5 ");
         System.out.println();
         for (int b=1 ; b<=7 ; b++) {
         System.out.println();
            for (int c=1 ; c<=b ; c++) {
            System.out.print ("*");
            }
         }
}

public static void star6() {
      //task 6
      //creating a new line
      System.out.println ("\n \n Task 6 ");
         System.out.println();
         for (int b=7 ; b>=1 ; b--) {
         System.out.println();
            for (int c=1 ; c<=b ; c++) {
            System.out.print ("*");
            }
         }
}

public static void star7() {
      System.out.println ("\n \n Task 7 ");
         System.out.println();
         for (int b=1 ; b<=7 ; b++) {
         System.out.println();
            for (int e=1 ; e<=(7-b) ; e++) {
            System.out.print (" ");
            }
            for (int c=1 ; c<=b ; c++) {
            System.out.print ("*");
            }
         }
}

public static void star8() {
      //task 8
      //creating a new line
      System.out.println ("\n \n Task 8 ");
         System.out.println();
         for (int b=1 ; b<=7 ; b++) {
         System.out.println();
            for (int e=1 ; e<=(7-b) ; e++) {
            System.out.print (" ");
            }
            for (int c=1 ; c<=((2*b)-1) ; c++) {
            System.out.print ("*");
            }
         }
}
}
