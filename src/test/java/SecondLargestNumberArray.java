public class SecondLargestNumberArray {
    public static void main(String[] args) {
        int[] numbers = {10,5,20,8,25,18};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : numbers) {
            if(num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            }else if(num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        }else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
