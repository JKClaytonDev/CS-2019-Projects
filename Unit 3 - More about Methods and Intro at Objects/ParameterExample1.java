// rectangle is an overloaded method because it has the samae method name
//with different parameter lists
  
   import java.util.Scanner;
   public class ParameterExample1 {
  	public static void main(String[] args) {
     	Scanner input = new Scanner (System.in);
     	System.out.println("How many rows in your rectangle?");
     	int rows = input.nextInt();
     	System.out.println("How many columns in your rectangle?");
     	int columns = input.nextInt(); 
     	rectangle (rows,columns);
     	System.out.println("Default Rectangle - always the same size 10 by 10");
     	rectangle(); 
  	}
  
  	public static void rectangle(int row, int col) {
     	for (int j = 1; j<= row; j++)
     	{
        	for (int k = 1; k <= col; k++)
           	System.out.print("*");
        	System.out.println();
     	}
  	}
  	public static void rectangle() {
	     for (int j = 1; j<= 10; j++)
     	{
        	for (int k = 1; k <= 10; k++)
           	System.out.print("*");
        	System.out.println();
     	}
  	}
   }
