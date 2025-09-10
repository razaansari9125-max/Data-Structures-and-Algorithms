package com.method.overriding;

public class FruitUpcasting {
	static class fruit
	{
		int id=12;
		void test()
		{
			System.out.println("This is test method..");
		}
	}
	static class Apple extends fruit
	{
		int j=13;
		void demo()
		{
			System.out.println("This is demo method..");
		}
	}
	public static void main(String[] args)
	{
		fruit f=new Apple();
		f.test();
		
		System.out.println(f.id);
	}

}