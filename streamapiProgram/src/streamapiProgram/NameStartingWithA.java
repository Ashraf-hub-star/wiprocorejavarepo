package streamapiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartingWithA {
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Ashraf", "alex", "chandra", "Apple");
		List<String> filtredNames = names.stream()
									.filter(name -> name.startsWith("A"))
									.collect(Collectors.toList());
		
		System.out.println(filtredNames);
				
	}
}
