package com.wipro.practice;

import java.util.SortedSet;
import java.util.TreeSet;

class PracticeSet{
	public static void main(String[] args) {
		SortedSet<String> sortedSet =new TreeSet<>();
		
		sortedSet.add("Apple");
		sortedSet.add("Mango");
		sortedSet.add("Banana");
		sortedSet.add("Grapes");
		
		System.out.println("SortedSet: " + sortedSet);
		
		System.out.println(sortedSet.first());
		System.out.println(sortedSet.last());
		
		
		
	}
}