package project2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// This program removes all duplicates from ArrayList using LinkedHashSet (Preserves Order)
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");

        Set<String> set = new LinkedHashSet<>(list);
        List<String> uniqueList = new ArrayList<>(set);

        System.out.println("Original list: "+list);
        System.out.println("List without duplicates: "+ uniqueList);
    }
}
