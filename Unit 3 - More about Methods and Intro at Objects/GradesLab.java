//Jackson Clayton
//pd 6
//11/19/18

import java.util.Scanner;
public class GradesLab {
   public static void main(String args []){
           Scanner keyboard = new Scanner(System.in);
           System.out.println("Enter a student name: ");
           String name = keyboard.nextLine();
           int totalgrade = 0;
           String numbers = "";
           int weeksInt=5;
           for(int week=1; week<=weeksInt; week++){
               System.out.print("Enter grade #" + week + ": ");
               int grade = keyboard.nextInt();
               totalgrade = totalgrade+ grade;
               numbers = numbers + (grade + "+");
           }
           double AverageGrade = (double)totalgrade/weeksInt;
           System.out.println (name + "'s average grade is " + AverageGrade);
           System.out.println ("\n" + name + "'s grade is " + AverageGrade + " because her average of (" + numbers.substring(0,(numbers.lastIndexOf('+'))) + ")/" + weeksInt + " equals " + AverageGrade + ".");
           }
   }

