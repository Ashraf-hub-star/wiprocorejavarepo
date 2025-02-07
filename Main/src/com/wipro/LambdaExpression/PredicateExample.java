package com.wipro.LambdaExpression;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> isEven = (num) -> num%2==0;
		
		boolean result=isEven.test(4);
		System.out.println("Is 4 even ?" + result);

	}

}
