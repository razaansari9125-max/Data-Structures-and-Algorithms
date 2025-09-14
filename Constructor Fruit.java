package com.constrcutor;

public class Fruit {
	//constrcutor - overloading
	int price;
	String color;
	String name;double weight;
	Fruit()
	{
		
	}
	Fruit(int price)
	{
		this.price=price;
	}
	Fruit(int price, String color)
	{
		this.price=price;
		this.color=color;
	}
	Fruit(int price, String color, String name)
	{
		this.price=price;
		this.color=color;
		this.name=name;
	}
	Fruit(int price, String color, String name, double weight)
	{
		this.price=price;
		this.color=color;
		this.name=name;
		this.weight=weight;
	}
	void display()
	{
		System.out.println("Fruit price:" +price);
		System.out.println("Fruit color:" +color);
		System.out.println("Fruit name:" +name);
		System.out.println("Fruit weight:" +weight);
	}
	public static void main(String[] args) {
		Fruit f1=new Fruit(123, "Green", "apple",2.5);
		f1.display();
	}

}