package com.inheritance;

public class SuperExample {
	//Parent class
	static class Vehicle
	{
		Vehicle()
		{
			System.out.println("Vehicle constructor called");
		}
	}
	//child class
	
	static class Car extends Vehicle
	{
		Car()
		{
			System.out.println("Car constructor called.");
		}
	}
	public static void main(String[] args)
	{
		Car c=new Car();
	}

}