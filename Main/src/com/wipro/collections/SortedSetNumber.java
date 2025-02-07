package com.wipro.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetNumber {
    public static void main(String[] args) {
        // Create a SortedSet (TreeSet implementation)
        SortedSet<Integer> sortedSet = new TreeSet<>();

        // Add elements
        sortedSet.add(50);
        sortedSet.add(20);
        sortedSet.add(10);
        sortedSet.add(40);
        sortedSet.add(30);

        // Print the SortedSet
        System.out.println("SortedSet: " + sortedSet); // Output: [10, 20, 30, 40, 50]

        // Accessing specific elements
        System.out.println("First Element: " + sortedSet.first()); // Output: 10
        System.out.println("Last Element: " + sortedSet.last());   // Output: 50

        // Get subsets
        System.out.println("HeadSet (less than 30): " + sortedSet.headSet(30)); // Output: [10, 20]
        System.out.println("TailSet (30 or more): " + sortedSet.tailSet(30));  // Output: [30, 40, 50]
        System.out.println("SubSet (20 to 40): " + sortedSet.subSet(20, 40));  // Output: [20, 30]
    }
}