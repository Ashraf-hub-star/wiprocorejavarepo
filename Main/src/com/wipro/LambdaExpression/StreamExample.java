package com.wipro.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Process the list using Streams
        System.out.println("Processing numbers:");
        numbers.stream()
               .filter(n -> n % 2 == 0) // Predicate: Filter even numbers
               .map(n -> n * 2)         // Function: Multiply by 2
               .forEach(System.out::println); // Consumer: Print each number
    }
}
