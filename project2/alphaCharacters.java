package project2;
// Find out how many alpha characters are present in a string.
public class alphaCharacters {
    public static void main(String[] args) {
        String input = "I am born to rule";
        int count = 0;

        for(int i = 0; i < input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                count++;
            }
        }

        System.out.println("Number of alphabetic characters: " + count);
    }
}
