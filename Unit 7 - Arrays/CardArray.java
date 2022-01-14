//Jackson Clayton
//Pd 6
//3/6/19
import java.util.*;
public class CardArray{
   public static void main (String[] args){
      String [] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
      String [] suits = {"Hearts","Clubs","Diamonds","Spades"};
      String [] cardNames = new String[52];
      
      for (int s = 0; s != suits.length; s++){
         System.out.println("\n*********"+suits[s]+"*********");
         for (int r = 0; r != ranks.length; r++){
            cardNames[((13*s)+r)] = (ranks[r]+" of "+suits[s]);
            System.out.println(cardNames[((13*s)+r)]);
         }
      }
      
      System.out.println("\nPOKER HAND");
      int [] PokerHand = new int[5];
      for (int i = 0; i < 5; i++){
         int done = 0;
         int cardvalue = (int)(Math.random()*cardNames.length);
         while (done == 0){
            cardvalue = (int)(Math.random()*cardNames.length);
            int j = 0;
            for (int v = 0; v < PokerHand.length; v++){
               if (PokerHand[v] == cardvalue)
                  j = 1;
            } 
            if (j == 0){
               done = 1;
               PokerHand[PokerHand.length-1] = cardvalue;
               System.out.println(cardNames[cardvalue]);
            }
         }
      
      }
      
      System.out.println("\nWAR");
      int [] Storage = {(int)(Math.random()*4),(int)(Math.random()*13),(int)(Math.random()*4),(int)(Math.random()*13)};
      String [] StorageNames = {(cardNames[(13*Storage[0])+Storage[1]]),(cardNames[(13*Storage[2])+Storage[3]])};
      System.out.println(StorageNames[0]+"\n"+StorageNames[1]);
      if (Storage[3] == Storage[1]){
         if (Storage[0] == Storage[2]) System.out.println("Its a tie????");
         else if (Storage[0] < Storage[2])   System.out.println(StorageNames[0] + " Wins!");
         else  System.out.println(StorageNames[1] + " Wins!");
      }
      else if (Storage[3] < Storage[1])   System.out.println(StorageNames[0] + " Wins!");
      else  System.out.println(StorageNames[1] + " Wins!");
   }
}