package project2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringProcessor {
    public static void main(String[] args) {
        // Use a list
        List<String> strings = List.of("Apple", "banana", "Apricot", "orange", "avocado", "Grape");

        List<String> filteredStrings = filterStringsStartingWithA(strings);
        System.out.println("Original list: "+strings);
        System.out.println("Filtered list: "+filteredStrings);
    }

    private static List<String> filterStringsStartingWithA(List<String> strings) {
        List<String> result = new ArrayList<>();
        for(String s : strings){
            if(!s.isEmpty() && (s.charAt(0) == 'A' || s.charAt(0) == 'a')){
                result.add(s.toLowerCase());
            }
        }

        return result;
    }
}
