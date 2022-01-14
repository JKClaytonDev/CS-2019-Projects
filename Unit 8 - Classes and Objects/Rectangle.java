public class Rectangle   {
  private double Length;
  private double Width;
  private double Perimeter;
  private double Area;

public double  calcArea()
{
Area = (Length*Width);
return Area;
}
public Rectangle ( double inLength,double inWidth){
   Length = inLength;
   Width = inWidth;
     }
// calculate the Perimeter

public double  calcPerimeter(){
Perimeter = 2*(Length+Width);
return Perimeter;
}

public void setLength(double Lengthin){
Length = Lengthin;
}

public void setWidth(double inWidth){
Width = inWidth;
}

public double getLength(){
return Length;
}

public double getWidth(){
return Width;
}

public String toString()  // return a String labeled with length and Length
{
calcArea();
calcPerimeter();
return ("\nThis is the width: "+Width+"\nThis is the length: "+Length);
}
}