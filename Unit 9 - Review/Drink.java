//Jackson Clayton
public class Drink{
   private String type;
   private double ounces;
   public Drink (String t, double o){
      type = t;
      ounces = o;
   }
   public void setType(String t){
      type = t;
   }
   public void setOunces(double o){
      ounces = o;
   }
   public String getType(){
      return type;
   }
   public double getOunces(){
      return ounces;
   }
   public String toString(){
      return ("There are " + ounces + " ounces of " + type + " left");
   }
}