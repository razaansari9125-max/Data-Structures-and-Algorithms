package com.exception;

public class throwsExample {
	static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("You must be 18 or older!");
		}
		else
		{
			System.out.println("Welcome! You are old enough.");
		}
	}
	public static void main(String[] args) {
		try {
			checkAge(12);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught" + e.getMessage());
		}
		System.out.println("Program comtinues");
	}

}