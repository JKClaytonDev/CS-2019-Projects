//Jackson Clayton
//Pd 6
//4/23/18
class BoxTester
{
   public static void main ( String[] args )
   {
      System.out.println("Box:\n");
      Box box0 = new Box(4.2, 5.4, 6.7);
      System.out.println (box0.toString());
      System.out.println ("Area: "+box0.calcArea());
      System.out.println ("Volume: "+box0.calcVolume());
   
      System.out.println("\nCube:\n");   
      Box cube = new Box(7.3, 7.3, 7.3);
      System.out.println (cube.toString());
      System.out.println ("Area: "+cube.calcArea());
      System.out.println ("Volume: "+cube.calcVolume()+"\n");
      
      System.out.println("Box1:\n");
      Box box1 = new Box(5.3, 16.2, 6.4);
      System.out.println (box1.toString());
      System.out.println ("Area: "+box1.calcArea());
      System.out.println ("Volume: "+box1.calcVolume()+"\n");
      
      System.out.println("Box2:\n");
      Box box2 = box1.biggerBox();
      System.out.println (box2.toString());
      System.out.println ("Area: "+box2.calcArea());
      System.out.println ("Volume: "+box2.calcVolume());
      
      if (box1.nests(box2))
         System.out.println("\nBox 2 nests Box 1\nBox 1 does not nest Box 2\n");
      else
         System.out.println("\nBox 1 nests Box 2\nBox 2 does not nest Box 1\n");
      
      System.out.println("Box3:\n");
      Box box3 = box1.smallerBox();
      System.out.println (box3.toString());
      System.out.println ("Area: "+box3.calcArea());
      System.out.println ("Volume: "+box3.calcVolume()+"\n");
   
      if (box2.nests(box3))
         System.out.println("Box 3 nests Box 2\nBox 2 does not nest Box 3\n");
      else
         System.out.println("Box 2 nests Box 3\nBox 3 does not nest Box 2\n");
   
   
   
   }
}