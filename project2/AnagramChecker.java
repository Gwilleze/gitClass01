package project2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter second string: ");
        String str2 = scanner.nextLine();

        if(areAnagrams(str1, str2)){
            System.out.println("\""+str1+"\" and \""+str2+"\" are anagrams.");
        }else{
            System.out.println("\""+str1+"\" and \""+str2+"\" are NOT anagrams.");
        }
        scanner.close();
    }

    private static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        //If lengths are different, they cant be anagrams
        if(s1.length() != s2.length()){
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
