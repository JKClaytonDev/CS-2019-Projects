public class ComplexNumber_Tester   {
   public static void main (String[] args) {
   //checking toString()
      ComplexNumber a1= new ComplexNumber();
      System.out.println(a1);
      ComplexNumber a2= new ComplexNumber(0,0);
      System.out.println(a2);
      ComplexNumber a3= new ComplexNumber(4,0);
      System.out.println(a3);
      ComplexNumber a4= new ComplexNumber(-4,-7);
      System.out.println(a4);
      ComplexNumber a5= new ComplexNumber(8,-27);
      System.out.println(a5);
      ComplexNumber a6= new ComplexNumber(5,4);
      System.out.println(a6);
   
      // checking modulus()
      System.out.println();
      System.out.println("abs value of ("+a5+") = "+ a5.modulus());
      System.out.println("abs value of ("+a1+") = "+ a1.modulus());
      System.out.println("abs value of ("+a3+") = "+ a3.modulus());
       // checking conjugate()
      System.out.println();
      System.out.println("conjugate of ("+a5+") = "+ a5.conjugate());
      System.out.println("conjugate of ("+a1+") = "+ a1.conjugate()); 
      System.out.println("conjugate of ("+a3+") = "+ a3.conjugate());
      // checking add()
      System.out.println();
      System.out.println("add ("+a5+")and ("+a4+"):     "+ a5.add(a4)); 
      System.out.println("add ("+a4+")and ("+a5+"):     "+ a4.add(a5)); 
      System.out.println("add ("+a1+")and ("+a5+"):     "+ a5.add(a1)); 
    // checking subtract()
      System.out.println();
      System.out.println("subtract ("+a5+")and ("+a4+"):     "+ a5.subtract(a4)); 
      System.out.println("subtract ("+a4+")and ("+a5+"):     "+ a4.subtract(a5)); 
      System.out.println("subtract ("+a1+")and ("+a5+"):     "+ a1.subtract(a5)); 
      // checking multiply()
      System.out.println();
      System.out.println("multiply ("+a5+")and ("+a4+"):     "+ a5.multiply(a4)); 
      System.out.println("multiply ("+a4+")and ("+a5+"):     "+ a4.multiply(a5)); 
      System.out.println("multiply ("+a1+")and ("+a5+"):     "+ a1.multiply(a5));
      System.out.println("multiply ("+a3+")and ("+a6+"):     "+ a3.multiply(a6));
      System.out.println("multiply ("+a5+")and ("+a2+"):     "+ a5.multiply(a2)); 
   // checking quadrant()
      System.out.println();
      System.out.println(a5+"  is in quadrant "+a5.quadrant()); 
      System.out.println(a3+"  is in quadrant "+a3.quadrant()); 
      System.out.println(a4+"  is in quadrant "+a4.quadrant()); 
      System.out.println(a6+"  is in quadrant "+a6.quadrant()); 
      System.out.println(new ComplexNumber(-6, 7)+"  is in quadrant "+ new ComplexNumber(-6, 7).quadrant());    
   }
}
/*
    1*i
 0
 4
 -4-7*i
 8-27*i
 5+4*i
 
 abs value of (8-27*i) = 28.160255680657446
 abs value of (1*i) = 1.0
 abs value of (4) = 4.0
 
 conjugate of (8-27*i) = 8+27*i
 conjugate of (1*i) = -1*i
 conjugate of (4) = 4
 
 add (8-27*i)and (-4-7*i):     4-34*i
 add (-4-7*i)and (8-27*i):     4-34*i
 add (1*i)and (8-27*i):     8-26*i
 
 subtract (8-27*i)and (-4-7*i):     12-20*i
 subtract (-4-7*i)and (8-27*i):     -12+20*i
 subtract (1*i)and (8-27*i):     -8+28*i
 
 multiply (8-27*i)and (-4-7*i):     -221+52*i
 multiply (-4-7*i)and (8-27*i):     -221+52*i
 multiply (1*i)and (8-27*i):     27+8*i
 multiply (4)and (5+4*i):     20+16*i
 multiply (8-27*i)and (0):     0
 
 8-27*i  is in quadrant 4
 4  is in quadrant 0
 -4-7*i  is in quadrant 3
 5+4*i  is in quadrant 1
 -6+7*i  is in quadrant 2
 
*/