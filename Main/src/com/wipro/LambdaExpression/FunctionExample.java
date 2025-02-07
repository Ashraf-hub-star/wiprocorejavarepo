package com.wipro.LambdaExpression;

import java.util.function.Function;


//Function: Converts an integer to a string.
public class FunctionExample {
	public static void main(String[] args) {
		Function<Integer, String> convert = (num) -> "Number: " + num;
		
		String result=convert.apply(10);
		System.out.println(result);
	}

}
