package com.constructorChaining;

public class Vehicle {
	String name;
	String color;
	String brand;
	Vehicle()
	{
	
	}
	Vehicle(String name)
	{
		this();
		this.name=name;
	}
	Vehicle(String name, String color)
	{
		this(name);
		this.name=name;
		this.color=color;
	}
	Vehicle(String name, String color, String brand)
	{
		this(name,color);
		this.name=name;
		this.color=color;
		this.brand=brand;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(brand);
	}
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle("Maruti", "Green", "Yamaha");
		v.display();
	}
}