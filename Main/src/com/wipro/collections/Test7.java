package com.wipro.collections;

import java.util.SortedMap;
import java.util.TreeMap;
 
public class Test7 {
 
	
	public static void main(String[] args) {
		
		//create the object of Map interface
		
		//Map<Integer,String> map = new HashMap<>();
		
		/*SortedMap<Integer,String> map = new TreeMap<>(new MyComparator());
			
		map.put(100, "mayank");
		
		
		map.put(20, "lokeshwar");
		
		map.put(200, "rajat raj");
		
		
		for( Object o: map.entrySet()) {
			
			System.out.println(o);
		}
		
		*/
		
		SortedMap<Student,Long> sm  = new TreeMap<>(new StudentNameComparator());
		
		Student kumar = new Student(10,"kumar");
		Student mayank = new Student(4,"mayank");
		Student rajat = new Student(56,"rajat");
		
		sm.put(kumar, 9848426L);
		sm.put(mayank, 76577767L);
		sm.put(rajat, 876767868L);
		
		for(Object o: sm.entrySet())
		{
			System.out.println(o);
		}
		
	}
}