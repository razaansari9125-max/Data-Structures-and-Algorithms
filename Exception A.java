package com.exception;

public class A {
	public static void main(String[] args) {
		
		System.out.println("Good");
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("e");
		}
		System.out.println("Morning");
	}

}