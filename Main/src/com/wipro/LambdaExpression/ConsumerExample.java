package com.wipro.LambdaExpression;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> print =(msg)-> System.out.println("Hello, " + msg);
		print.accept("java");

	}

}
