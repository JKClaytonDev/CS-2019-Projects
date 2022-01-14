import java.util.Scanner;
    public class Grades {
   
       public static void main(String[] args) {
      
      // declare the variables
         int mathGrade;
         int historyGrade;
         int scienceGrade;
         double average;
         int[] array = {1,2,3};
         Scanner input = new Scanner(System.in);
      
      // get the data
         System.out.println("Original array: ");
         printarray(array);
         mathGrade = input.nextInt();
          System.out.println(Arrays.toString(array));
      }
      
   public static void printarray(int[] array) {
   }
   }
