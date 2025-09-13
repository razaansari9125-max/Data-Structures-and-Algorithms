package com.abstraction;

public class AbstractionClassExample {
	static abstract class Vehicle
	{
		abstract void start(); //abstract method
		
		public void test()
		{
			//concrete method
			System.out.println("This is concrete method");
		}
	}
	static class Car extends Vehicle 
	{
		@Override
		void start() {
			System.out.println("This is run method");
		}
	}
	public static void main(String[]args)
	{
		Vehicle v=new Car();
		v.test();
		v.start();
	}
}