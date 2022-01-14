//Jackson Clayton
//Pd 6
//5/3/19
public class Box   {
   private double width;
   private double height;
   private double length;

   public double  calcArea()
   {
      return ((width*height*2)+(length*height*2)+(width*length*2));
   }
   public boolean nests (Box outsideBox ){
      return (this.getLength() < outsideBox.getLength() && this.getHeight() < outsideBox.getHeight() && this.getWidth() < outsideBox.getWidth());
   }
   public Box biggerBox (){
      return new Box (1.25*width, 1.25*height, 1.25*length);
   }
   public Box smallerBox (){
      return new Box (0.75*width, 0.75*height, 0.75*length);
   }
   public double  calcVolume()
   {
      return (width*height*length);
   }
   public Box ( double inwidth,double inheight, double inlength){
      width = inwidth;
      height = inheight;
      length = inlength;
   }
   public Box (){
      width = 1.0;
      height = 1.0;
      length = 1.0;
   }
   
   public double getLength(){
      return length;
   }
   public double getWidth(){
      return width;
   }
   public double getHeight(){
      return height;
   }


   public String toString()
   {
      return ("Box dimensions:  "+width+" x "+height+" x "+length);
   
   }
}