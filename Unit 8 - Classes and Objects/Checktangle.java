//Jackson Clayton
//Pd 6
//5/3/19
class Checktangle
{
public static void main ( String[] args )
   {
Rectangle rec = new Rectangle(15,3.5);

System.out.println (rec.toString());
System.out.println ("Perimeter: "+rec.calcPerimeter());
System.out.println ("Area: "+rec.calcArea()+"\n");


rec.setLength(3.2);
System.out.println ("Perimeter: "+rec.calcPerimeter());
System.out.println ("Area: "+rec.calcArea());



  }
}