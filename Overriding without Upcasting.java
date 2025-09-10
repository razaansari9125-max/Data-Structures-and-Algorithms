package com.method.overriding;

public class OverridingWithoutUpcasting {
	//Parent class
	static class Vehicle
	{
		void run() {
			System.out.println("Vehicle is running");
		}
	}
	//Child class
	static class Bike extends Vehicle
	{
		@Override
		void run()
		{
			System.out.println("Bike is eunning safely");
		}
	}
	//Another child class
	static class Car extends Vehicle
	{
		void  runn()
		{
			System.out.println("Car is running fast");
		}
	}
	public static void main(String[] args)
	{
		//Vehicle v=new Vehicle();
		//v.run();
		
		Bike b=new Bike();
		b.run();
		
		Car c=new Car();
		c.run();
	}

}