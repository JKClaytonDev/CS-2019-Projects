import java.util.*;
    class HurricaneLab{
       public static void main(String [] args){
         Scanner input = new Scanner(System.in);
         int wind;
         for (int a=1; a<=7.5; a++){
         System.out.print("\nEnter your wind speed:  ");
         wind = input.nextInt();
         classifyHurricane(wind);
         }
        
      }
       public static void classifyHurricane (int wind)
      {
       if (wind < 74)
       System.out.println("\n This isn't a hurricane \n\t Generally, a minimum hurricane has sustained winds of at least 74 miles per hour (mph)");
       if (wind >= 74&& wind <94)
       System.out.println(" \nThis is a catagory 1 hurricane  \n\t Expect damage primarily to unanchored mobile homes, shrubbery, and trees.");
       if (wind >= 94&& wind <111)
       System.out.println(" \nThis is a catagory 2 hurricane  \n\t Expect sustained winds of 94-110 mph Damage to roofing materials, windows, and doors .");
       if (wind >= 111&& wind <130)
       System.out.println(" \nThis is a catagory 3 hurricane  \n\t Expect structural damage, mobile homes destroyed, flooding near coastline");
       if (wind >= 130&& wind <155)
       System.out.println("\n This is a catagory 4 hurricane  \n\t Expect major erosion of beach areas, major damage to lower floors of structures near the shore.");
       if (wind >= 155 && wind <=253)
       System.out.println(" This is a catagory 5 hurricane  \n Expect complete roof failure on many residences and industrial buildings.  Massive evacuation required.");
       if (wind > 253)
       System.out.println(" Uh oh... this is greater than the highest wind speed ever recorded!  \n\t The previously recorded fastest wind speed not related to tornadoes ever recorded \n\t was during the passage of Tropical Cyclone Olivia on 10 April 1996: an automatic\n\t weather station on Barrow Island, Australia, registered a maximum   wind gust of 253 mph.");
      }
   } 
      
      
