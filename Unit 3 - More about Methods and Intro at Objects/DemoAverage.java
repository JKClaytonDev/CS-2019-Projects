// name              period                date
// Unit 3 Methods and Parameters Lab
// On my Honor I neither given nor received illegal help on this work.
    public class DemoAverage{
         
 public static void main(String[] args){ 
 int t1 = 90, t2=85, t3=70, t4=89, t5 = 88, t6 = 100, t7 = 65, t8=76;
      
  System.out.println("*****Welcome to my average machine*****");
  System.out.println("         Demonstrating averages\n");
  System.out.println("The average of " + t1+ " and " + t2 + " is "+average(t1,t2));
  System.out.println("The average of " + t5+ ", "+t3 +" and " + t7 + " is "+average(t5,t3, t7));
  double ave1 = average(t8,t3,t4,t1,t5);
  System.out.println("The average of " + t8+ ", "+t3 +", "+t3 + ", "+t4 + " and " + t1 + 
                    " is " +ave1);
  double ave2 = average(t1,t3,t5,t7);
  System.out.println("The average of " + t1+ ", "+t3 + ", "+t5 + " and " + t7 + " is " +ave2);
  double ave3 = average(t2,t4,t6,t8);
  System.out.println("The average of " + t2+ ", "+t4 + ", "+t6 + " and " + t8 + " is " +ave3);
  averageAverages(ave1, ave2, ave3);
  averageAverages(ave2, ave3);
   System.out.println("The End");
  
  }
         

  public static double average(int a,int b) {
    return (a + b) / 2.0;
  }
       
  public static double average(int a,int b, int c) {
   return (a + b + c) / 3.0;
  }
  public static double average(int a,int b, int c, int d) {
   return (a + b + c + d) / 4.0;
  }
  public static double average(int a,int b, int c, int d, int e) {
   return (a + b +c + d + e) / 5.0;
  }
  public static double average(double a,double b, double c) {
   return (a + b + c) / 3.0;
  }
   
  public static void averageAverages(double a1, double a2, double a3){   
    double aa = average(a1, a2, a3);
    System.out.println("The averages of the averages " + a1 + ", "+a2 +" and "+a3+" are " +aa);         
  }
  
  public static void averageAverages(double a, double b) {
  double Average2Averages = (a+b)/2.0;
  System.out.println("The average of two averages " + a + " and " + b + " is " + Average2Averages);

  }
  
  
}
