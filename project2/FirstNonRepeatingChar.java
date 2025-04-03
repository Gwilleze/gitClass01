package project2;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "abracadabra";
        Character result = findFirstNonRepeatingChar(input);

        if(result != null){
            System.out.println("The first non-repeating character in '" + input + "' is: " + result);
        }else {
            System.out.println("No non-repeating character found in '" + input + "'");
        }
    }

    private static Character findFirstNonRepeatingChar(String str) {
        if(str == null || str.isEmpty()){
            return null;
        }

        int[] chaCounts = new int[256]; // assuming ASCII characters

        //First pass: count characters occurrences
        for (int i = 0; i < str.length(); i++) {
            chaCounts[str.charAt(i)]++;
        }

        //second pass: find first character with count 1
        for(int i = 0; i < str.length(); i++){
            if(chaCounts[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }
        return null;

    }
}
