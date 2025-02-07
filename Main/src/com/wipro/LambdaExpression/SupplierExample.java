package com.wipro.LambdaExpression;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Double> randomValue = () -> Math.random();
		
		double result = randomValue.get();
		System.out.println("Random value: " + result);

	}

}
