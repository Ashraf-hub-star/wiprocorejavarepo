package streamapiProgram;

import java.util.Arrays;
import java.util.List;

public class CountElements {
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10,9,12,4,18,6,19,9,99);
		long count = numbers.stream()
				.filter(n -> n >10)
				.count();
		System.out.println("Count of numbers greater than 10:"+ numbers + ":"  + count);
	}
}
