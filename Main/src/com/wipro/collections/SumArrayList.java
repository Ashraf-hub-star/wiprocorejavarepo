package com.wipro.collections;
import java.util.ArrayList;
import java.util.List;

public class SumArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=new ArrayList<>();
		number.add(20);
		number.add(30);
		number.add(50);
		number.add(10);
		number.add(40);
		
		System.out.println(number);
		
		int sum=0;
		for(int num : number) {
			sum += num;
		}
		
		System.out.println("Sum of elements :" + sum);
	}
	

}
