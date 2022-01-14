//Jackson Clayton
//Pd 6
// 3/20/19

import java.util.*;
import java.util.Scanner;
public class Madlibs2 { 
       public static void main(String[] args) 
      { 
         String[] nouns = {"banana", "Ferrari", "hammer", "guacamole", "bug-eyed monster", "living hamburger", "peanut butter sandwich", "homework", "dog", "super hero"};
         String[] verbs = {"eat", "drive", "whack", "transmogrify", "slap", "jump on", "burn", "study","fear"}; 
         String[] adjectives = {"sad","crazy","lazy","angry","happy","hungry","scared","ugly","large","insane"}; 
         String[] names = {"George", "Carlos","Jimmy","Jake","Yishmael","Andrew","Carl"}; 
         String[] genders = {"He","She","it"}; 
          
         System.out.println("Here is a story just for you\n"); 
         tellStory(nouns,verbs,adjectives, names, genders); // generate and display the story 
      } // end of main() 
      
       public static String getWord(String[] words) { 
         int size = words.length; // get the size of the array 
         int index = (int)(Math.random() * size); // random # must be < size 
         return words[index]; // send back the word at that index 
      } // end of getWord() method 
      
   
       public static void tellStory(String[] nouns, String[] verbs, String[] adjectives, String[] names, String[] genders){ 
         System.out.println("Once upon a time there was a " + getWord(adjectives) + " " + getWord(nouns) + " named " + getWord(names) + " ."); 
         System.out.println(getWord(genders)+" was very " + getWord(adjectives) + " and didn't like to " + getWord(verbs) + " its " + getWord(nouns) + " when it was " + getWord(adjectives)); 
         System.out.println("It liked to " + getWord(verbs) + " its " + getWord(nouns) + " with his  friend, " + getWord(names) + " the "+ getWord(adjectives) + " " + getWord(nouns)); 

         System.out.println("but they are all " + getWord(adjectives) + " " + "and happily ever after. The end."); 
      } // end of tellStory() method 
   
   } // end of Madlib class 

