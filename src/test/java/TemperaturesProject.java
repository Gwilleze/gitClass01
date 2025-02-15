public class TemperaturesProject {
    public static void main(String[] args) {
        // create an array that will store temperatures for the week

        int[] temperatures = {72, 75, 79, 68, 74, 77, 73};

        // Initialize high and low with the first element

        int high = temperatures[0];
        int low = temperatures[0];

        //Loop through the array to find the highest and lowest temperature

        for(int temp : temperatures) {
            if(temp>high) {
                high = temp;
            }
            if(temp<low) {
                low = temp;
            }
        }
        // print results
        System.out.println("Highest temperature of the week: "+high+"°C");
        System.out.println("Lowest temperature of the week: "+low+"°C");
    }
}
