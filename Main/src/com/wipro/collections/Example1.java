package com.wipro.collections;
import java.util.List;
import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names= new ArrayList<>();
		names.add("Ashraf");
		names.add("Shaik");
		names.add("UPD");
		
		System.out.println(names);
		names.add(2, "SKD");
		System.out.println(names);
		
	}

}
