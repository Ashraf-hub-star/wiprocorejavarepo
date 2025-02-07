package streamapiProgram;

import java.util.List;
import java.util.stream.Collectors;

public class Square {
	public static void main(String[] args)
	{
		List<Integer> numbers = List.of(1,2,3,4,5);
		List<Integer> squareNumbers = numbers.stream()
									.map(n -> n*n)
									.collect(Collectors.toList());
		
		System.out.println("THe square od numbers is:" + squareNumbers);
	}
}
