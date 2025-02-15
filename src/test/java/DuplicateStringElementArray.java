import java.util.HashSet;

public class DuplicateStringElementArray {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "apple", "date", "banana", "fig", "cherry"};

        HashSet<String> uniqueWords = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        // Iterate through the array and find duplicates
        for(String word : words) {
            if(!uniqueWords.add(word)) {
                duplicates.add(word);
            }
        }
        // print duplicates elements
        if(duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        }else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}
