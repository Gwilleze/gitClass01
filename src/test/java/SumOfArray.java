public class SumOfArray {
    public static void main(String[] args) {
        // This is an array to store integer values

        int[] numbers = {100, 250, 35, 45, 79, 50, 55, 88};


        // Variable to store sum
        int sum = 0;

        // Using Enhanced loop to loop through the array and calculate sum

        for(int num:numbers) {
            sum += num;
        }

        // Print results
        System.out.println(sum);
    }
}
