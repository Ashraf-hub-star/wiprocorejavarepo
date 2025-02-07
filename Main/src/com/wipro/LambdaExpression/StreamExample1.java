package com.wipro.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        // 1. Sorting numbers in natural order (ascending)
        System.out.println("Sorted in natural order:");
        numbers.stream()
               .sorted()
               .forEach(x -> System.out.println(x));

        System.out.println("======================");

        // 2. Sorting numbers in reverse order (descending)
        System.out.println("Sorted in reverse order:");
        numbers.stream()
               .sorted((x, y) -> y.compareTo(x)) // Reverse sorting
               .forEach(x -> System.out.println(x));

        System.out.println("======================");

        // 3. Removing duplicates from a list
        List<Integer> nmbrs = Arrays.asList(10, 20, 10, 30, 20, 40);
        System.out.println("After removing duplicates:");
        nmbrs.stream()
             .distinct() // Remove duplicates
             .forEach(x -> System.out.println(x));
    }
}
