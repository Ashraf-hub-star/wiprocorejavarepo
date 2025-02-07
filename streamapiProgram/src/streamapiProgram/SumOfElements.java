package streamapiProgram;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class SumOfElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        
//        reduce((a, b) -> a + b): reduce() takes a binary operator to combine elements. 
//        In this case, it adds all elements together to produce the sum.
//        OptionalInt: The result is wrapped in an OptionalInt because the list might be empty, 
//        so the result could be absent.
        // Using Stream to calculate the sum using reduce()
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);  // Reduces the stream by summing the elements

        System.out.println(sum.orElse(0));  // Prints the sum, or 0 if the list is empty
    }
}

