package com.wipro.collections;


import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;


//Comparator Interface: This class implements the Comparator interface, which allows us to define custom comparison logic. The comparator is used to compare two objects (in this case, map entries) to decide their order.
//Generic Type: Comparator<Map.Entry<Long, Student>> means the comparator is designed to compare Map.Entry objects where the key is of type Long and the value is of type Student.
public class Test1Comparator implements Comparator<Map.Entry<Long, Student>> {
 
	
//	Entry<Long, Student> o1 and Entry<Long, Student> o2: These represent two map entries (key-value pairs) that will be compared.
//	o1.getValue(): Gets the Student object associated with the first entry.
//	o2.getValue(): Gets the Student object associated with the second entry.
//	getStid(): Gets the student ID (which is an Integer).
//	compareTo(): Compares the two student IDs.
//	If o1's ID is less than o2's ID, it returns a negative value (meaning o1 should come before o2).
//	If o1's ID is greater than o2's ID, it returns a positive value (meaning o1 should come after o2).
//	If both IDs are the same, it returns 0, meaning they are considered equal in the sorted order.
	
	
	@Override
	public int compare(Entry<Long, Student> o1, Entry<Long, Student> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getStid().compareTo(o2.getValue().getStid());
	}
 
}
