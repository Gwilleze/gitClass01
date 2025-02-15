import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        boolean flag = false;

        // 0 and 1 are not prime numbers
        if(num == 0 || num == 1) {
            flag = true;
        }

        for(int i = 2; i <= num/2; ++i) {
            // condition for non-prime number
            if(num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num+" is a prime number.");
        else
            System.out.println(num+" is not a prime number.");
    }
}
