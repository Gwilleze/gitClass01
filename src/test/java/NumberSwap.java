import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scan.nextInt();

        System.out.println("Enter second number: ");
        int b = scan.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using arithmetic operations (add and subtract)
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
