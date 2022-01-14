// Second version that captures figure structure.
    public class ModularShape {
       public static void main(String[] args) {
         drawTopfirst();
         drawTopthird();
         drawTopsecond();
         drawTopfirst();
         drawTopthird();
         drawTopsecond();
         drawTopthird();
         drawTopfirst();
         drawTopsecond();
         drawTopthird();
      }
       public static void drawTopfirst() {
         System.out.println("  _______");
         System.out.println(" /       \\");
         System.out.println("/         \\");
      
      }
       public static void drawTopsecond() {
         System.out.println("-\"-'-\"-'-\"-");
      }
       public static void drawTopthird() {
         System.out.println("\\         /");
         System.out.println(" \\_______/");
      }
   }
