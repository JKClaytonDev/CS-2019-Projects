class TelescopeTester
{
   public static void main ( String[] args )
   {
System.out.println("Telescope 1"); 
Telescope tele = new Telescope(3.0,6.5,0.8);
Telescope tele2 = new Telescope(9.5,12.5,17.8);
//Use the accessor methods to print out the telescope’s properties.
System.out.println( "Diameter: "+ tele.getDiameter ()); 
System.out.println( " length of the main lens: "+ tele.getMainlength());
System.out.println( "Eyepiece: "+ tele.getEyelength());
System.out.println(tele);
System.out.println("Power: "+tele.calcMagnification()  + "  F-number: "+tele.calcFNumber());
// Use mutator method to change the main length to 7.5 inches
tele.setMainlength(7.5);
// and check the results
System.out.println("New Power: "+tele.calcMagnification()  + " New F-number: "+tele.calcFNumber());

System.out.println("\nTelescope 2"); 
//Use the accessor methods to print out the telescope’s properties.
System.out.println( "Diameter: "+ tele2.getDiameter ()); 
System.out.println( " length of the main lens: "+ tele2.getMainlength());
System.out.println( "Eyepiece: "+ tele2.getEyelength());
System.out.println(tele2);
System.out.println("Power: "+tele2.calcMagnification()  + "  F-number: "+tele2.calcFNumber());
// Use mutator method to change the main length to 7.5 inches
tele2.setMainlength(7.5);
// and check the results
System.out.println("New Power: "+tele2.calcMagnification()  + " New F-number: "+tele2.calcFNumber());
  }
}
