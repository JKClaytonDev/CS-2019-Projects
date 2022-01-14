//Jackson Clayton
//pd 6
//6/5/19
import java.util.Scanner;
import java.util.*;
public class PrimeFactors{
   private static int[] NumEXPs;    private static int[] FinalNumbers;  private static int[] Numbers;  private static int[] NewNumbers;  private static int Factored;
   private static int ListScroll;   private static String Formula;   private static int inputNum;  private static boolean negative;
   
   public static void main (String[] args){
      Numbers = new int[1];
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a Number: ");
      inputNum = input.nextInt();
      negative = (inputNum<0);
      NewNumbers = new int[Math.abs(inputNum)];
      inputNum = Math.abs(inputNum);
      Factor(inputNum, true);
      Numbers = NewNumbers;
      while(Factored != 2){
         ListScroll = 1;
         Factored = 0;
         for (ListScroll = 0; ListScroll<Numbers.length; ListScroll++){
            Factor(Numbers[ListScroll], false);
         }
         Numbers = NewNumbers;
         if (Factored == 0){
            Factored = 2;
         }
      }
      Simplify();
      MakeFormula();
      System.out.println(Formula);
      
   }
   public static void Factor(int number, boolean include){
      boolean negative = false;
      if (number<0){
         negative = true;
         number*=-1;
      }
      int i = 2;
      int z = 2;
      int HighestNumber = 0;
      if (number == 4){
         Factored = 1;
         NewNumbers = DeleteFromList(ListScroll, NewNumbers);
         NewNumbers = AddtoList(NewNumbers, 2);
         NewNumbers = AddtoList(NewNumbers, 2);
      }
      else{
         while((number-1)>i){
            z=2;
            while((number-1)>z){
               if (((HighestNumber<i) || (HighestNumber<z)) && (i*z == number)){
                  if (i<z)
                     HighestNumber = z;
                  else
                     HighestNumber = i;
               }
               z++;
            }
            i++;
         }
         if (HighestNumber != 0){
            Factored = 1;
            NewNumbers = DeleteFromList(ListScroll, NewNumbers);
            NewNumbers = AddtoList(NewNumbers, HighestNumber);
            NewNumbers = AddtoList(NewNumbers, number/HighestNumber);
         }
         else if (include){
            NewNumbers = AddtoList(NewNumbers, number);
         }
      }
   }
   public static void Simplify(){
      NumEXPs = new int[0];
      FinalNumbers = new int[0];
      
      if (Numbers.length == 1){
         FinalNumbers = AddtoList(FinalNumbers, Numbers[0]);
         NumEXPs = AddtoList(NumEXPs, 1);
      }
      else if (Numbers.length == 2){
         if (Numbers[1] == Numbers[0]){
            FinalNumbers = AddtoList(FinalNumbers, Numbers[0]);
            NumEXPs = AddtoList(NumEXPs, 2);
         }
         else{
            FinalNumbers = AddtoList(FinalNumbers, Numbers[0]);
            NumEXPs = AddtoList(NumEXPs, 1);
            FinalNumbers = AddtoList(FinalNumbers, Numbers[1]);
            NumEXPs = AddtoList(NumEXPs, 1);
         }
      }
      else{
      
         for (ListScroll = 0; ListScroll<Numbers.length; ListScroll++){
            int alreadythere = 0;
            for (int i = 0; i<ListScroll; i++){
               if (alreadythere == 0 && Numbers[i] == Numbers[ListScroll] && i!=ListScroll)
                  alreadythere = i;
            }
            if (alreadythere == 0){
               FinalNumbers = AddtoList(FinalNumbers, Numbers[ListScroll]);
               NumEXPs = AddtoList(NumEXPs, 1);
            }
            
            else{
               if (alreadythere<NumEXPs.length){
                  NumEXPs[alreadythere]++;
               }
            }
         }
         for (int i = 1; i<FinalNumbers.length; i++){
            if (FinalNumbers[0] == FinalNumbers[i]){
               FinalNumbers = DeleteFromList(i, FinalNumbers);
               NumEXPs = DeleteFromList(i, NumEXPs);
               NumEXPs[0]++;
               if (getTotal() != inputNum)
                  NumEXPs[0]++;
            }
         }
      
      }
   }
   public static int getTotal(){
      int total = 1;
      for (int i = 0; i<FinalNumbers.length; i++){
         total*=(Math.pow(FinalNumbers[i],NumEXPs[i]));
      }
      return total;
   }
   public static void MakeFormula(){
      Formula = "";
      if (NumEXPs[0] == 1){
         if (negative == true){
            Formula = ("-"+FinalNumbers[0]);
            negative = false;
         }
         else
            Formula = (""+FinalNumbers[0]);
      }
      else
         if (negative == true){
            if (NumEXPs[0] != 2)
               Formula = ("-"+FinalNumbers[0]+" * "+FinalNumbers[0]+"^"+((NumEXPs[0])));
            else
               Formula = ("-"+FinalNumbers[0]*FinalNumbers[0]);
            negative = false;
         }
         else
            Formula = (FinalNumbers[0]+"^"+NumEXPs[0]);
      for(ListScroll = 1; ListScroll<(FinalNumbers.length); ListScroll++){
         if (NumEXPs[ListScroll] == 1)
            Formula += (" * "+FinalNumbers[ListScroll]);
         else
            Formula += (" * "+FinalNumbers[ListScroll]+"^"+NumEXPs[ListScroll]);
      }
   }
   public static int[] AddtoList(int[] list, int num){
      
      int z;
      for (z = 0; z<list.length && list[z] != 0; z++){
      }
      int[] newList = new int[z+1];
      for (int i = 0; i<list.length; i++){
         if (list[i] != 0)
            newList[i] = list[i];
      }
      newList[newList.length-1] = num;
      return newList;
   }
   public static int[] DeleteFromList(int spot, int[] list){
      int[] newList = new int[list.length-1];
      for(int i = 0; i<list.length; i++){
         if (i!= spot){
            if (i>spot)
               newList[i-1] = list[i];
            else
               newList[i] = list[i];
         }
      }
      return newList;
   }
}