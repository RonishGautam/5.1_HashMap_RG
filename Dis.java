import java.util.HashMap;
import java.util.Map;

/**
 * The 'Dis' class demonstrates the usage of a HashMap to store and retrieve archaic words
 * along with their definitions. It includes methods for loading the dictionary, printing
 * the unsorted dictionary, and searching for words using the HashMap get() method.
 */
public class Dis {

    /**
     * Main method to execute the program.
     *     */
    public static void main(String[] args) {
        /* This is all the steps that was listed in assignment requirement. 
         * 
         * Step 1: Load unsorted key/definition pairs into HashMap
         * 
         */
        Map<String, String> archaicDictionary = createaDictionary();

        // Step 2: Print unsorted dictionary keys and definitions
        System.out.println("Unsorted Dictionary:");
        printDictionary(archaicDictionary);
        
        

        // Step 3: Search for 5 words using HashMap get()
        searchAndPrintWords(archaicDictionary, "Merry", "Hark", "Ere", "Yonder", "Thy");
        
            }

    /**
     *
     * @return A HashMap with archaic words as keys and their definitions as values.
     */
    private static Map<String, String> createaDictionary() {
    	
        Map<String, String> dic = new HashMap<>();

        // Adding archaic words and definitions directly to the map
        dic.put("Merry", "Definition 1");
        dic.put("Ere", "Definition 2");
        dic.put("Hark", "Definition 3");
        dic.put("Yonder", "Definition 4");
        dic.put("Thy", "Definition 5");

        return dic;
    }

    /**
     * Prints the keys and definitions of a given dictionary.
     *
     * @param dictionary The dictionary to be printed.
     */
    private static void printDictionary(Map<String, String> dictionary) {
    	
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println("Words: " + entry.getKey() + ", Definition: " + entry.getValue());
        }
        System.out.println();
    }

    /**
     * Searches for words in the dictionary and prints their definitions along with hash keys.
     *
     * @param dictionary The dictionary to search in.
     * @param  The words to search for.
     */
    private static void searchAndPrintWords(Map<String, String> dictionary, String... words) {
    	
    	
        for (String word : words) {
            String definition = dictionary.get(word);
            int hashKey = word.hashCode(); // Hash key used for the word by the HashMap
            System.out.println("Word: " + word + ", Definition: " + definition + ", HashKey: " + hashKey);
        }
    }
}
