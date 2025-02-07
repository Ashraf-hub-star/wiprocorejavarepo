package com.wipro.collections;

import java.util.ArrayList;
import java.util.List;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		int searchNumber=30;
		if(numbers.contains(searchNumber)) {
			System.out.println(searchNumber+"exists in the list");
		}
		else {
			System.out.println(searchNumber+"does not exist in the list");
		}
		
		

	}

}
