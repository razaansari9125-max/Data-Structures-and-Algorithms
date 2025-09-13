package com.abstraction;

public class AbstractionConcreteExample2 {
	//Example 2: Abstract + Concrete class
	static abstract class Shape
	{
		abstract void draw(); //abstract method
	}
	static class Circle extends Shape
	{
		@Override
		void draw()
		{
			System.out.println("Drawing a Circle.");
		}
	}
	static class Rectangle extends Shape
	{
		@Override
		void draw()
		{
			System.out.println("Drawing a rectangle.");
		}
	}
	public static void main(String[] args)
	{
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		
		s1.draw();
		s2.draw();
	}

}