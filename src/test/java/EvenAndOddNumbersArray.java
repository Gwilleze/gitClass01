public class EvenAndOddNumbersArray {
    public static void main(String[] args) {
        // Define a 2D array with even and odd numbers

        int[][] numbers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        // Iterate through the array and print only even numbers

        for(int i=0; i < numbers.length; i++) {
            for(int j=0; j < numbers[i].length; j++) {
                if(numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]+" ");
                }
            }
        }
    }
}
