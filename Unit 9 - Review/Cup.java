//Jackson Clayton
//Pd 6

public class Cup{
   private double capacity;
   private double currentVolume;
   public static void main (String[] args){
   
      Cup coop = new Cup(24);
      Drink coke = new Drink("Coke", 16.907);
      Drink dcoke = new Drink("Diet Coke", 12.0);
   
      coop.fillWith(coke);
   
      System.out.println(coop.toString());
      System.out.println(coke.toString());
   
   
      coop.fillWith(dcoke);
      System.out.println(coop.toString());
      System.out.println(dcoke.toString());
   }

   public Cup (double capIn){
      capacity = capIn;
      currentVolume = 0;
   }
   public void setVolume(double pour){
      currentVolume=pour;
   }
   public double getVolume(){
      return currentVolume;
   }
   public String toString(){
      return ("A " + capacity + " cup currently filled with " + currentVolume + " oz");
   }
   public void fillWith(Drink drink){
      if (drink.getOunces() <= capacity-currentVolume){
         currentVolume+=drink.getOunces();
         drink.setOunces(0);
      }
      else{
         drink.setOunces(drink.getOunces()-(capacity-currentVolume));
         currentVolume=capacity;
      }
   }
}