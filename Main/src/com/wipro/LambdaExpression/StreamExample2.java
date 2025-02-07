package com.wipro.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> nmbrs = Arrays.asList(10, 20, 30, 40, 50);

        // 1. Limiting the stream to the first 3 elements
        System.out.println("First 3 elements:");
        nmbrs.stream()
             .limit(3) // Limit to first 3 elements
             .forEach(x -> System.out.println(x));

        System.out.println("==================");

        // 2. Skipping the first 3 elements
        System.out.println("Elements after skipping the first 3:");
        nmbrs.stream()
             .skip(3) // Skip first 3 elements
             .forEach(x -> System.out.println(x));

        System.out.println("==================");

        // 3. Reducing the stream to calculate the sum of all numbers
        System.out.println("Sum of all numbers:");
        int sum = nmbrs.stream()
                       .reduce(0, (a, b) -> a + b); // Reduce to calculate sum
        System.out.println("Sum: " + sum);
    }
}