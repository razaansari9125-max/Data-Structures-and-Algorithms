package com.exception;

public class FinallyExample {
	public static void main(String[] args) {
		try
		{
			int num = 10 / 0;
			System.out.println("Result:" + num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: Cannot divide by zero!");
		}
		finally
		{
			System.out.println("This is the finally block, it always executes.");
		}
		System.out.println("Program continues after try-catch-finally..");
	}

}