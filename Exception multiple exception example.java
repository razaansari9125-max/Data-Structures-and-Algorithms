package com.exception;

public class MultipleExceptionExample {
	public static void main(String[] args) {
		try
		{
			int[] numbers = {1, 2, 3};
			int result = numbers[3] / 0;
			System.out.println("Result: " + result);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arithmetic error: Divion by zero!");
		}
		catch (Exception e)
		{
			System.out.println("Some other exception occurred: " + e);
		}
		System.out.println("Program comtinues.......");
	}

}