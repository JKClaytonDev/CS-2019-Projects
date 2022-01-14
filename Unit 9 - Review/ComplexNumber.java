//Jackson Clayton
//Pd 6
import java.util.*;
public class ComplexNumber{
   private int a;
   private int b;
   public ComplexNumber(int aIn, int bIn){
      a=aIn;
      b=bIn;
   }
   public ComplexNumber(){
      a=0;
      b=1;
   }
   public double modulus(){
      return Math.sqrt((a*a)+(b*b));
   }
   public String toString(){
      if (a==0 && b!=0)
         return(b + "*i");
      else if (b==0)
         return(a+"");
      else if (b==1)
         return(a + "+i");
      else if (b<1)
         return(a + "-"+ (0-b) + "*i");
      else
         return(a + "+"+ b + "*i");
   }
   public int getA(){
      return a;
   }

   public int getB(){
      return b;
   }

   public int quadrant(){
      if (a==0 || b==0)
         return 0;
      if (b>1 && a>1)
         return 1;
      else if (a<1 && b>1)
         return 2;
      else if (a<1 && b<1)
         return 3;
      else
         return 4;
   }
   public ComplexNumber conjugate(){
      ComplexNumber newCojugate = new ComplexNumber(a,b*-1);
      return newCojugate;
   }
   public ComplexNumber add (ComplexNumber adding){
      ComplexNumber both = new ComplexNumber(a+adding.getA(),b+adding.getB());
      return both;
   }
   public ComplexNumber subtract (ComplexNumber adding){
      ComplexNumber both = new ComplexNumber(a-adding.getA(),b-adding.getB());
      return both;
   }
   public ComplexNumber multiply (ComplexNumber adding){
      ComplexNumber both = new ComplexNumber(a*adding.getA() - (b*adding.getB()),adding.getA()*b+a*adding.getB());
      return both;
   }
}