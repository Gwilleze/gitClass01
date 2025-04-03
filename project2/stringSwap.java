package project2;

import java.util.Scanner;
// Write a program to swap 2 String without a temporary variable
public class stringSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user inputs the first string
        System.out.println("Enter the first word: ");
        String firstString = scanner.next();

        //user enters the second string
        System.out.println("Enter the second word: ");
        String secondString = scanner.next();

        System.out.println("Before swapping: word1 is "+firstString+", word2 is "+secondString);

        // swap using a temporary variable
        String temp = firstString;
        firstString = secondString;
        secondString = temp;

        System.out.println("After swapping: word1 is "+firstString+", word2 is "+secondString);

    }
}
