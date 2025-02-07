package com.wipro.exception;

public class ExceptionHandling2 {
	public static void main(String[] args)
	{
		ExceptionHandling1 ex=new ExceptionHandling1();
		
		try {
			ex.division();
			
		}
		catch(ArithmeticException e){
			System.out.println("Caught an exception: Division by zero is not allowed");
		}
		finally {
			System.out.println("Excution completed");
		}
		
	}

}
