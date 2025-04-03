package project2;
import java.util.regex.*;
public class WordCounter {
    public static void main(String[] args) {
        String input = "Hello, world!";
        System.out.println("Word count: "+countWords(input));
    }

    private static int countWords(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }

        // Split the string into words using regular expression
        //The pattern matches one or more non-word characters(spaces/punctuation)
        String[] words = str.split("[\\s\\p{Punct}]+");

        //Handle cases where split might result in empty strings
        int count = 0;
        for(String word : words){
            if(!word.isEmpty()){
                count++;
            }
        }

        return count;

    }
}
