package com.wipro.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetString {
    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();

        // Adding  elements
        sortedSet.add("Apple");
        sortedSet.add("Mango");
        sortedSet.add("Banana");
        sortedSet.add("Grapes");

        // Printing the SortedSet
        System.out.println("SortedSet: " + sortedSet); 

        // Accessing specific elements
        System.out.println("First Element: " + sortedSet.first()); 
        System.out.println("Last Element: " + sortedSet.last());   

        // Subsets
        System.out.println("HeadSet (less than 'Grapes'): " + sortedSet.headSet("Grapes")); 
        System.out.println("TailSet ('Banana' and more): " + sortedSet.tailSet("Banana")); 
    }
}