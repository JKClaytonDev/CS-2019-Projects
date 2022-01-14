//Jackson Clayton
//pd 6

public class PracticeTest {
  
      public static double displacement(double velocity, double time, double acceleration){
         double displacement=((velocity*time)+(acceleration*(time*time)/2));
         
         
         
         return displacement;
      }
            
      public static int remainder (int number){
         int remainder = (number%10);
         return remainder;
      }
       
    public static String student (String last, String first, String sport, int studentID,  double GPA) {
      String message = ("\"" + first + " + " + last + " id# " + studentID + " plays " + sport + " and has a gpa of " + GPA + "\"");
      return message;
      }
      
     public static double average (int a1, int a2, int a3, int a4, int a5) {
      double average = (((a1 + a2 + a3 + a4 + a5)*1.0)/5);
      return average;
      }
      
      public static String doIt (String action){
        String Itdo = ("\"" + action.toUpperCase() + "!\"");
        return Itdo;
    }
      
      public static String userName(String firstName, String lastName, int year){
      String userName = ("\"" + firstName.charAt(0) + "\\" +  lastName + "\\" +  year + "\"");
      return userName;
      }
      
      
      
      public static void main(String[] args) {

      System.out.println( "displacement of an object is " + displacement(3.5, 12.3, 2.34)); // returns 220.0593
        
      System.out.println( "average of five integers is " + average(23, 55, 14, 6, 88) );  // returns 37.2

System.out.println("the last digit of  12345 is " + remainder (12345));      // returns 5


System.out.println( student("Rosen", "Jake", "basketball", 12345,  2.78)); 
    // returns "Jake Rosen id# 12345 plays basketball and has a GPA of 2.78"

System.out.println( doIt("sing")); 
    // returns "SING!"

System.out.println (userName("Jake", "Rosen", 2001));
// returns "J\Rosen\2001"
    }


      }


  /*


    }

public static String userName(String firstName, String lastName, int year){
//your code here
    }

      System.out.println( "displacement of an object is " + displacement(3.5, 12.3, 2.34)); // returns 220.0593
        
      System.out.println( "average of five integers is " + average(23, 55, 14, 6, 88) );  // returns 37.2

System.out.println("the last digit of  12345 is " + remainder (12345));      // returns 5


System.out.println( student("Rosen", "Jake", "basketball", 12345,  2.78)); 
    // returns "Jake Rosen id# 12345 plays basketball and has a GPA of 2.78"

System.out.println( doIt("sing")); 
    // returns "SING!"

System.out.println (userName("Jake", "Rosen", 2001));
// returns "J\Rosen\2001"
    }


      }
*/

