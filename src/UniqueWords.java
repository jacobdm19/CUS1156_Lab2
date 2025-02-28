import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
   int count = 0; 
   
   
   for (int i = 0; i < list.size(); i++) {
      boolean isUnique = true; // Assume current element is unique
      
      // Check if the current element has appeared before
      for (int j = 0; j < i; j++) {
         if (list.get(i).equals(list.get(j))) { // If duplicate found
            isUnique = false; // Mark as not unique
            break; // Exit inner loop early
         }
      }
      
      // If the element is unique, increase the count
      if (isUnique) {
         count++;
      }
   }
   return count; // Return the total count of unique elements
}


   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
