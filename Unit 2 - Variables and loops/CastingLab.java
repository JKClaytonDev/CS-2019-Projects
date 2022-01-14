//Jackson Clayton
//10/1/17
//pd 6
public class CastingLab {
   public static void main(String args []){
      //integers
      int i = (15);
      System.out.println("\n The integer I chose is " + i + "\n One more than 15 is " + (i+1) + "\n One less than 15 is " + (i-1));
      //decim
      double d = 1.5;
      System.out.println(" The decimal I chose is " + (double)d);
      System.out.println(" " + d + " rounded down is " + (int)d);
      //characters
      char c = 'x';
      System.out.println(" The character I chose is " + c);
      System.out.println (" The letter before " + c + " is " + (char)((int)c-1));
      System.out.println (" The letter after " + c + " is " + (char)((int)c+1));
      //boolean
      boolean b = true;
      System.out.println (" The boolean I chose is " + b);
      System.out.println (" The opposite of " + b + " is " + !(b));
   }
}