package com.inheritance;

public class SingleInheritanceExample {
	//Parent class
	static class Animal 
	{
		void eat()
		{
			int j=10;
			System.out.println("Animals can eat1");
		}
	}
	
	//Child class (inherits from Animal)
	
	static class Dog extends Animal
	{
		void bark() 
		{
			System.out.println("Dog can bark1");
		}
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		
		//Child class method
		d.bark();
		
		//Parent class method (inherits)
		d.eat();
	}

}