public class ParameterExample1 {
  	public static void main(String[] args) {
     	Scanner input = new Scanner (System.in);
     	System.out.println("How many rows in your rectangle?");
    	 int rows = input.nextInt();
     	System.out.println("How many columns in your rectangle?");
     	int columns = input.nextInt(); 
     	rectangle (rows,columns);  
  	}
  
  	public static void rectangle(int row, int col) {
     	for (int j = 1; j<= row; j++)
     	{
        	for (int k = 1; k <= col; k++)
        	
           	System.out.print("*");
        	System.out.println();
     	}
  	}
   }
