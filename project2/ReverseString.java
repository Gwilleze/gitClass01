package project2;

public class ReverseString {
    public static String reverseWithStringBuilder(String input){
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseWithStringBuilder(original);
        System.out.println("Original: "+original);
        System.out.println("Reversed: "+reversed);
    }

}
