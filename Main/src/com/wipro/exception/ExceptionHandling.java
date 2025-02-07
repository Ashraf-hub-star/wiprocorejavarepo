package com.wipro.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result=10/0;
			System.out.println("Result: "+ result);
			
		}
		catch(ArithmeticException e){
			System.out.println("Error: Division By Zero is not allowed:");
			
		}
		finally {
			System.out.println("This block always executes");
		}
   }
}