package com.wipro.collections; //defines the package where this class belongs

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap; //is a Map that orders its keys in natural order or by a custom comparator.
import java.util.TreeMap; //is a type of SortedMap that sorts entries based on keys.

public class Test2Comparator{
	public static void main(String[] args)
	{
		//I declaring a SortedMap with keys of type Long and values of type Student.
		//TreeMap is used to store the entries, and it automatically sorts the entries based on the key (in this case, Long). So, the map will be sorted by Long keys.
		SortedMap<Long, Student> sm=new TreeMap<>();
		
		Student Ashraf=new Student(01, "Ashraf");
		Student Shaik=new Student(01, "Shaik");
		 Student Rajat = new Student(03, "Rajat");
		 
		 // using the put method to add entries into the SortedMap.
		 //The TreeMap will automatically sort these entries based on the Long keys (phone numbers).
		 sm.put(76767676L, Ashraf);
		 sm.put(76767677L, Shaik);
		 sm.put(76767686L, Rajat);
		 
		 //Converting the Map to a List
		 //Maps Do Not Have a Built-in Sorting Mechanism:
		 //In a Map, entries (key-value pairs) are stored without any inherent order. 
		 //Even though TreeMap sorts its entries by keys when they are inserted, it doesn't provide a straightforward way to sort by values (like student IDs in this case).
		 //If you want to sort a Map based on the values (like sorting students by their IDs), a Map alone doesn't allow you to do that directly.
		 
		 
		 //This line converts the SortedMap into a list of map entries.
		 //sm.entrySet() returns a Set of Map.Entry objects, where each Map.Entry represents a key-value pair.
		 //new ArrayList<>(...) converts the Set into an ArrayList. Now, you have a list of map entries, which can be sorted manually (since a map by itself doesn't have a sort method).
		 List<Map.Entry<Long, Student>> list=new ArrayList<>(sm.entrySet());
		 
		 
		 //The Collections.sort(list, ...) method sorts the list based on the logic provided by the comparator.
		 //Here, new Test1Comparator() is an instance of a custom Comparator that defines how the entries should be compared and sorted.
		 
		 Collections.sort(list, new Test1Comparator());
		 
		 
		 //Now that the list is sorted, you iterate over each Map.Entry in the list.
		 //For each entry, you print the key (entry.getKey()) and the student details (student ID and student name).
		 //entry.getValue() returns the Student object, and you use getStid() and getStname() to access the student ID and name.
		 
		 for (Map.Entry<Long, Student> entry : list) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue().getStid() + " ," + entry.getValue().getStname());
	        }
		 
	}
}