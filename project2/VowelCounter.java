package project2;

public class VowelCounter {
    public static void main(String[] args) {
        String word = "documentation";
        int vowelCount = countVowels(word);
        System.out.println("The word \"" + word + "\" contains " + vowelCount + " vowels.");
    }

    private static int countVowels(String str) {
        // Convert the string to lowercase to handle both upper and lower case vowels
        str = str.toLowerCase();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // check if the character is a vowel
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;

    }
}
