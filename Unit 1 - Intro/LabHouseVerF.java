//Jackson Clayton
//Period 6, 9/13/18
public class LabHouseVerF {
   public static void main(String[] args) {
      drawroof(); //this method draws the roof and it's shingles.
      drawwindows(); //this method draws both the windows and the 1 line of empty space above and below them
      drawlilminiroofs();
   //this method was originally meant to draw the 1 line of empty space above it, but i decided to repurpouse it to also work with the ground to save data and space
      drawwindows();
      drawlilminiroofs();
      drawenterance();
   //this method creates everything below the windows
      drawlilminiroofs();
   }
   public static void drawroof(){
      System.out.println("   ___________");
      System.out.println("  / ____      \\");
      System.out.println(" /  \\__/       \\");
      System.out.println("/   \\__/ HOP    \\");
      System.out.println("UUUUUUUUUUUUUUUUU");
   }
   public static void drawwindows(){
      System.out.println("|               |");
      System.out.println("|  ____   ____  |");
      System.out.println("| | / /| | / /| |");
      System.out.println("| |/_/_| |/_/_| |");
      System.out.println("|               |");
   }
   public static void drawlilminiroofs(){
   
      System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
   }
   public static void drawenterance(){
      System.out.println("|    ________   |");
      System.out.println("|    |CLOSED|   |");
      System.out.println("|    |      O   |");
      System.out.println("|    |______|   |");
      System.out.println("");
   }
}