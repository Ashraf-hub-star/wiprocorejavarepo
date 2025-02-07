package streamapiProgram;

import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
	public static void main(String[] args)
	{
		List<String> names = List.of("Kalyan","Zambi", "Lokesh","Ashraf");
		List<String> sortedNamesAsc = names.stream()
				.sorted()
				.collect(Collectors.toList());
		List<String> sortedNamesDesc = names.stream()
                .sorted((a, b) -> b.compareTo(a))  
                .collect(Collectors.toList());

        System.out.println("Ascending: " + sortedNamesAsc);
        System.out.println("Descending: " + sortedNamesDesc);
	}
}
