package com.constrcutor;

public class Laptop {
	
	int id;
	String name;
	String brand;
	
	Laptop(int id, String name, String brand)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
	}
	void display() 
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(brand);
	}
	public static void main(String[] args) {
		Laptop l1=new Laptop(123, "HP", "Apple");
		l1.display();
		
		System.out.println("--------------------");
		
		Laptop l2=new Laptop(987, "lenevo", "Ivedia");
		l2.display();
		
		System.out.println("-----------------------");
		
		Laptop l3=new Laptop(345, "cell", "oppo");
		l3.display();
	}

}