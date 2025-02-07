package streamapiProgram;

//The Stream API in Java is a way to process collections of data (like lists) 
//in a more readable and concise way.
//It allows you to perform operations like filtering, mapping, 
//sorting, and reducing without using loops.
//Think of a stream like a conveyor belt:

//Source (List, Set, etc.) → Stream Operations (filter, map, sort, etc.) → 
//Result (List, Set, or a single value).


import java.util.*;
import java.util.stream.*;

public class FindEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		List<Integer> evenNumbers = numbers.stream()
									.filter(n -> n%2 == 0)
									.collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNumbers);

	}

}

