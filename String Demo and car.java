package com.String;

public class Car {
	int price;
	
	Car(int price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println(price);
	}
	@Override
	public String toString()
	{
		System.out.println("ToString method");
		return "Car [price=" + price + "]";
	}

}