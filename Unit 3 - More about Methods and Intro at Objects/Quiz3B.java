 //Jackson Clayton
 //Pd 6
 //Quiz 3B
 //11/28/18
public class Quiz3B{
   public static double coneVolume(double radius, double height) {
      double volume = (Math.PI*(radius*radius)*height)/3;
      return volume;
   }
   public static double average(int a, int b, int c, int d) {
      double numaverage = (a + b + c + d)/4.0;
      return numaverage;
   }
   public static String record (String last, String first, int grade) {
      String schoolrecord = first + " " + last + " is in " + grade + "th grade";
      return schoolrecord;
   }
   public static void main(String[]args) {
      System.out.println( "TEST CASES");
      System.out.println( coneVolume(3.2, 1.7));//returns 18.229614971230372
      System.out.println( average(23, 47, 15, 16) );//returns 25.25
      System.out.println( record("Frew", "Lesley", 11) );  //returns  Lesley Frew is in 11th grade.
   
      System.out.println( "\nADDITIONAL TEST CASES" );
      System.out.println( coneVolume(5.7, 1.9));//returns 64.64455203291718
      System.out.println( average(92, 65, 21, 19) );//returns 49.25
      System.out.println( record("Clayton", "Charlotte", 9) ); //returns Charlotte Clayton is in 9th grade
   
   //add three more method calls (one for each method) with different parameters
   
   }

}