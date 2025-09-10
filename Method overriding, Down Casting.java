package com.method.overriding;

public class DownCastingExample {
	static class Food
	{
		void eat()
		{
			System.out.println("Food method");
		}
	}
	static class Pizza extends Food
	{
		void sleep()
		{
			System.out.println("sleep method");
		}
	}
	public static void main(String[] args)
	{
		Food f=new Pizza();
		Pizza p=(Pizza)f;
		
		p.eat();
		p.sleep();
	}

}