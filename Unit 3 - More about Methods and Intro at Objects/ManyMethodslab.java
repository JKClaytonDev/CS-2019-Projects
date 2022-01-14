//Jackson Clayton
//pd 6
//November 30th 2018
public class ManyMethodslab {
   public static void main (String [] args){
      System.out.println(printPowersOf2(3));
      System.out.println(printWordNumTimes("WORD", 4));
      
      //LABELS!!!!
      
      System.out.println("Sum of numbers from 3 to 6 is " + sumab(3,6));
      System.out.println("Double of 3 is " + doubleit(3));
      System.out.println(printNumbers(16));
      System.out.println(printNumbers(2));
      System.out.println(vertical("hey now"));
      System.out.println("if you have 750 cents you have " + countQuarters(777) + " Quarters" );
   }
   
   public static void newLine(int count){
      //for creating new lines to split different methods
      for (int a=1 ; a<(count+1) ; a++){
         System.out.println("");}}
   
   
   public static String printPowersOf2(int powerlimit){
      int currentnumber=1;
      String Po2 = (" ");
      Po2 = (currentnumber + " ");
      for (int a=1 ; a<(powerlimit+1) ; a++) {
         Po2 = (Po2 + currentnumber*2 + " ");
         currentnumber=(currentnumber*2);}
      newLine(1);
      return Po2;}
   
   
   public static String printWordNumTimes(String phrase, int word) {
      String finishedphrase=(" ");
      for (int a=1 ; a<(word+1) ; a++){
         finishedphrase=(finishedphrase+"\n"+phrase);}
      return finishedphrase;}
   
   
   public static int sumab (int a, int b) {
      newLine(1);
      int d=0;
      for (int c=a ; c<b+1 ; c++){
         d=d+c;}
      return d;}
   
   
   public static String doubleit (int notdoubled){
      newLine(1);
      int notdoubled2=notdoubled*2;
      return (""+notdoubled2);}
      
      
   public static String printNumbers(int max) {
      newLine(1);
      String printNumbers=("");
      for (int a=1 ; a<max+1 ; a++){
         printNumbers = (printNumbers + "[" + a + "] ");}
      return printNumbers;}
      
      
   public static String vertical(String text){
      newLine(1);
      String vertical = ("");
      for (int a=0 ; a<text.length() ; a++){ 
         vertical=(vertical+"\n"+text.charAt(a));}
      return vertical;}
   
   
   public static String countQuarters(int cents){
      newLine(1);
      String TotalQuarters=("" +((cents/25)%4));
      return TotalQuarters;}}
         
