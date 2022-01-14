//Jackson Clayton
//pd 6
//10/5/18
import java.util.Scanner;

public class WeightinSpace {
   public static void main (String [] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your mass:\n");
      double mass = input.nextDouble();
      System.out.println("\n\nLocation Mass\tGravity\tWeight\n");
      System.out.println("Earth\t" + mass + "\t" + 1 + "\t" + (mass*1));
      System.out.println("Moon\t" + mass + "\t" + 0.167 + "\t" + (mass*0.167));
      System.out.println("Venus\t" + mass + "\t" + 0.877 + "\t" + (mass*0.877));
      System.out.println("Mars\t" + mass + "\t" + 0.378 + "\t" + (mass*0.378));
      System.out.println("Mercury\t" + mass + "\t" + 0.370 + "\t" + (mass*0.370));
      System.out.println("Jupiter\t" + mass + "\t" + 2.312 + "\t" + (mass*2.312));
      System.out.println("Saturn\t" + mass + "\t" + 0.896 + "\t" + (mass*0.896));
      System.out.println("Uranus\t" + mass + "\t" + 0.869 + "\t" + (mass*0.869));
      System.out.println("Neptune\t" + mass + "\t" + 1.100 + "\t" + (mass*1.100));
      System.out.println("Pluto\t" + mass + "\t" + 0.060 + "\t" + (mass*0.060));
   }
}
