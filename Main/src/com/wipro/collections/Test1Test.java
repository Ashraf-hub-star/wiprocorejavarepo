package com.wipro.collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class Test1Test {

	@Test
	void testSortedSetSorting() {
		Test1 test1 = new Test1();
		SortedSet<Integer> s = test1.createSortedSet();
		
		assertEquals(-5, s.first(), "The smallest element should be -5");
		
		assertEquals(333, s.last(), "The largest element should be 333");
		
		assertEquals(new TreeSet<>(java.util.Arrays.asList(-5, 6,67,100,152,234, 333)),s,"The elements should be in ascending order");
		
	}


@Test
void testHeadSet() {
	Test1 test1 = new Test1();
	SortedSet<Integer> s= test1.createSortedSet();
	
	SortedSet<Integer> headSet = s.headSet(234);
	
	assertEquals(new TreeSet<> (java.util.Arrays.asList(-5,6,67,100,152)),headSet,"The headSet Should contain less than 234");
}



@Test
void testTailSet() {
	Test1 test1 = new Test1();
	SortedSet<Integer> s= test1.createSortedSet();
	
	SortedSet<Integer> tailSet=s.tailSet(152);
	
	assertEquals(new TreeSet<> (java.util.Arrays.asList(152,234,333)), tailSet,"The tailSet should contain elements greater than or equal to 152");
}



@Test
void testSubSet() {
	Test1 test1 = new Test1();
	SortedSet<Integer> s = test1.createSortedSet();
	
	SortedSet<Integer> subSet=s.subSet(67,234);
	
	assertEquals(new TreeSet<> (java.util.Arrays.asList(67, 100, 152)), subSet, "The subset should contain between 67, 234");
}
}