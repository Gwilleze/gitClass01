package project2;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Removing non-alphanumeric characters and converting to lowercase
        int left = 0, right = str.length() -1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if(isPalindrome(input)){
            System.out.println("The given string is a palindrome.");
        }else{
            System.out.println("The given string is not a palindrome.");
        }
    }
}
