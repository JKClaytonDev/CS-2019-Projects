public class LoopyLab2018   {
   public static void main (String[] args) {
      //#1
      int num1=457, num11=1, num111=34555;
      int ans1= smallestFactor(num1);
      if (ans1==1) System.out.println (num1+" is a prime number");
      else System.out.println ("the smallest factor of "+num1+" is "+ans1);
      ans1= smallestFactor(num11);
      if (ans1==1) System.out.println (num11+" is a prime number");
      else System.out.println ("the smallest factor of "+num11+" is "+ans1);
      ans1= smallestFactor(num111);
      if (ans1==1) System.out.println (num111+" is a prime number");
      else System.out.println ("the smallest factor of "+num111+" is "+ans1);
      System.out.println();
      // #2
      int num2= 0, num22=743, num222=5024036; 
      System.out.println ("The number of zeros in "+num2 +":  "+zeroDigits(num2));
      System.out.println ("The number of zeros in "+num22 +":  "+zeroDigits(num22));
      System.out.println ("The number of zeros in "+num222 +": "+zeroDigits(num222));
      System.out.println();
      //#3
      String phrase3= "We are painting";
      String phrase33= "";
      String phrase333= "We are talking";
      char stop='p';
      partOfPhrase(phrase3, stop);
      System.out.println ("*****");
      partOfPhrase(phrase33, stop);
      System.out.println ("*****");
      partOfPhrase(phrase333, stop);
      System.out.println();
      //#4
      int number4= 128,number44=1235, number444=244 ;
      System.out.println (number4+" can be divided by two "+ divideBy2 (number4)+ " times");
      System.out.println (number44+" can be divided by two "+ divideBy2 (number44)+ " times");
      System.out.println (number444+" can be divided by two "+ divideBy2 (number444)+ " times");
      System.out.println();
    //#5
      int a1=-3, a2=7, a3=9;
      System.out.println ("The average between "+a1+" and "+a2+" is "+  averageLowHigh (a1, a2));
      System.out.println ("The average between "+a2+" and "+a3+" is "+  averageLowHigh (a2, a3));
      System.out.println ("The average between "+a3+" and "+a1+" is "+  averageLowHigh (a3, a1));
   }
      
   //#1
   public static int smallestFactor (int num){
      int smallest = 2;
      while (num%smallest != 0 && smallest <= num){
         smallest++;
      }
      if (smallest >= num)
         return 1; 
      return smallest;
   }
   
   //#2 
   public static int zeroDigits (int param){
      String paramstring;
      int scan = 0;
      int count = 0;
      paramstring = (""+param);
      while (scan < paramstring.length()){
         if (paramstring.charAt(scan)=='0')
            count++;
         scan++;
      }
      return count;
   }
   
   //#3
   public static void partOfPhrase (String phrase, char stop){
      int scan = 0;
      String fullstring = ("");
      if  (phrase.equals(""))
         System.out.println("\n");
      else{
         phrase = (phrase+"  ");
         while ((phrase.charAt(scan) != stop) && (scan < phrase.length()-1)){
            System.out.print(phrase.charAt(scan));
            scan++;
         }
         System.out.print("\n");
      }
   }
      
   //#4
   public static int divideBy2 (int number){
      int Divided = number;
      int counter = 0;
      while (Divided%2 == 0){
         Divided = Divided/2;
         counter = counter+1;
      }
      return (counter);
    
   }
         
   //#5
   public static double averageLowHigh (int low, int high){
      double counter = 0;
      if (high < low){
         return 0;
         }
         else{
            while (low != 0 && low <0){
               low++;
               high++;
               counter++;
            }
            return ((high/2)-counter);
         }
      }
}
    
   
/*OUTPUT:
    457 is a prime number
 1 is a prime number
 the smallest factor of 34555 is 5
 
 The number of zeros in 0:  1
 The number of zeros in 743:  0
 The number of zeros in 5024036:  2
 
 We are 
 *****
 
 *****
 We are talking
 
 128 can be divided by two 7 times
 1235 can be divided by two 0 times
 244 can be divided by two 2 times
 
 The average between -3 and 7 is 2.0
 The average between 7 and 9 is 8.0
 The average between 9 and -3 is 0.0
*/

