//Jackson Clayton
//Pd 6
//CS Unit 4 QUIZ H Classify Weather

public class IfQuizWeather{

   public static void main(String[] args){
      System.out.println(weather(97, false, 0));
      System.out.println(weather(50, true, 5));
      System.out.println(weather(20, true, 3));
      System.out.println(weather(32, true, 0));
      System.out.println(weather(55, false, 10));
      System.out.println(weather(55, true, 10));
   }
   public static String weather(double temperature, boolean precipitation, int windSpeed){
      if (windSpeed < 10 && precipitation == false)
         return ("Sunny");
      else if (temperature < 32 && precipitation == true)
         return ("Snowing");
      else if (temperature == 32 && precipitation == true)
         return ("Sleeting");
      else if (temperature > 32 && precipitation == true)
         return ("Raining");
      else if (windSpeed >= 10 && precipitation == false)
         return ("Windy");
      else
         return ("None");
   }
}