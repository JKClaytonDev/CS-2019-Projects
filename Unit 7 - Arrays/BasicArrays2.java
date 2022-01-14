public class BasicArrays2 {
    public static void main(String[] args) {
        String[] names = {"Frew", "Manley"};
        int[] favoriteNumbers = {0, 2, 8, 208};
        double[] latitudes = {90.27, 90.30, 90.41};
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        
   //
   System.out.println("\n\t\tnames\n");
   System.out.println("Length of the array:   "+names.length);
   System.out.println("Last index:            "+(names.length-1));
   System.out.println("Last element:          "+names[names.length-1]);
   System.out.println("Second to last:        "+names[names.length-2]);
        
   //
   System.out.println("\n\tfavoriteNumbers\n");
   System.out.println("Length of the array:   "+favoriteNumbers.length);
   System.out.println("Last index:            "+(favoriteNumbers.length-1));
   System.out.println("Last element:          "+favoriteNumbers[favoriteNumbers.length-1]);
   System.out.println("Second to last:        "+favoriteNumbers[favoriteNumbers.length-2]);
        
   //
   System.out.println("\n\tlatitudes\n");
   System.out.println("Length of the array:   "+latitudes.length);
   System.out.println("Last index:            "+(latitudes.length-1));
   System.out.println("Last element:          "+latitudes[latitudes.length-1]);
   System.out.println("Second to last:        "+latitudes[latitudes.length-2]);
        
   //
   System.out.println("\n\t\tword\n");
   System.out.println("Length of the array:   "+word.length);
   System.out.println("Last index:            "+(word.length-1));
   System.out.println("Last element:          "+word[word.length-1]);
   System.out.println("Second to last:        "+word[word.length-2]);
    }
}
