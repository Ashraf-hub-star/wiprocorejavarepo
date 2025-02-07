package streamapiProgram;

import java.util.List;
import java.util.Optional;

public class MaximumMinimum {
	public static void main(String[] args)
	{
		List<Integer> numbers = List.of(1,45,23,76,88,100);
		
		Optional<Integer> max= numbers.stream().max(Integer::compare);
		Optional<Integer> min= numbers.stream().min(Integer::compare);
		
		System.out.println("Maximum: "+ max.orElse(Integer.MIN_VALUE));
		System.out.println("Manimum: "+ min.orElse(Integer.MAX_VALUE));
	}
}
