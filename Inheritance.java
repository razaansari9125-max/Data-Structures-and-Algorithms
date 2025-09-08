package com.inheritance;

public class MultilevelInheritance {
	//Parent
		static class A 
		{
			void sum()
			{
				System.out.println("Sum method class A");
			}
		}
		//Child class
		static class B extends A 
		{
			void sub()
			{
				System.out.println("This is sub method inside B");
			}
		}
		static class C extends B 
		{
			void multiply()
			{
				System.out.println("This is multiply() inside");
			}
		}
		
	    public static void main(String[] args)
	{
		C c=new C();
		c.multiply();
		c.sub();
		c.sum();
	}
}