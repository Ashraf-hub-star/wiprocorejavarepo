package streamapiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ashraf", "chandra", "kiran");
        List<String> uppercaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());  // This line requires the import of Collectors
        System.out.println(uppercaseNames);
    }
}

