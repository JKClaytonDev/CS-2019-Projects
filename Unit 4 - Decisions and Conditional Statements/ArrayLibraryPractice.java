import java.util.Scanner;
    public class ArrayLibraryPractice {
   
       public static void main(String[] args) {
      
      // declare the variables
         int mathGrade;
         int historyGrade;
         int scienceGrade;
         double average;
         Scanner input = new Scanner(System.in);
      
      // get the data
         System.out.print("Enter math grade between 0 and 100! ");
         mathGrade = input.nextInt();
         System.out.print("Enter history grade between 0 and 100! ");
         historyGrade = input.nextInt();
         System.out.print("Enter science grade between 0 and 100! ");
         scienceGrade = input.nextInt();
      // Compute average
         average = (mathGrade+historyGrade+scienceGrade)/3;
      
      // Perform if & else control
         if (average > 70){
            System.out.println( "Good job! Your average is " + average);
         } 
         else{
            System.out.println( "You need to do some work! Your average is " + average);
         }
      }
   }
