//Jackson Clayton
//Pd 6
//Splitting a Word Lab
public class SplitLeters{

   public static void main(String[] args)
   {
   printletters("According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyways. Because bees don't care what humans think is impossible.");
   }
   public static void printletters (String phrase){
   String newphrase=("");
         for(int j=0; j<=phrase.length()-1; j++){
            if (phrase.charAt(j) != ' ')
            newphrase=(newphrase+phrase.charAt(j));
         }
      phrase=newphrase;
      newphrase=("");
         for(int i=0; i<=phrase.length()-1; i++){
            if (i == (phrase.length()-1)){
            newphrase=(newphrase+phrase.charAt(i));
            }
            else{
            newphrase=(newphrase+phrase.charAt(i)+", ");
            }
         }
      System.out.println (newphrase);
   
   }
}