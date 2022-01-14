public class Telescope   {

//A class that models a field telescope.

//private instance variables

  private double diameter;
  private double mainLength;
  private double eyeLength;

//Constructors

public Telescope ( double indiameter,double inmainLength,double ineyeLength){
	diameter   = indiameter;
	mainLength = inmainLength;
	eyeLength  = ineyeLength;
     }
// Accessors (These methods retrieve information without changing it)
        public double getDiameter ()
      {
         return diameter;
      }
        public double getMainlength ()
      {
         return mainLength;
      }
        public double getEyelength ()
      {
         return eyeLength;
      }
// Add two more accessors to get information about mainLength and eyeLength
// Mutators (These methods change information related to an object)
        public void setDiameter (double diam)
      {
         diameter = diam;
      }
        public void setMainlength (double main)
      {
         mainLength = main;
      }
        public void setEyelength (double eyel)
      {
         eyeLength = eyel;
      }
// Add two more mutators to change the values mainLength and eyeLength
// Methods: Note these methods are not static because they are associated with a class

// calculate the magnification or power of the telescope
//The formula to use is: magnification = mainLength/eyeLength 

public double  calcMagnification()
{
return getMainlength()/getEyelength();
}





//The formula to use is: fNumber = mainLength/diameter 

public double  calcFNumber(){

// calculate the f-number of the telescope

   return getMainlength()/getDiameter();
}

public String toString()  // return a String with diameter, mainLength, and eyeLength
 {

return ("The telescope has a diameter of "+getDiameter()+", a focal length of "+getMainlength()+", a focal eye length of "+getEyelength());
  }
}
