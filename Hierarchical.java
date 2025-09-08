package com.Hirarchical;

public class HirarchicalExample {
	
	static class A 
	{
		void test1()
		{
			System.out.println("This is test1");
		}
	}
	static class B extends A 
	{
		void test2()
		{
			System.out.println("This is test2");
		}
	}
	static class C extends A
	{
		void test3()
		{
			System.out.println("This is test3");
		}
	}
	public static void main(String[] args)
	{
		A a=new A();
		a.test1();
		//a.test2();
		//a.test3();
		System.out.println("---------------");
		B b=new B();
		b.test1();
		b.test2();
		//b.test3();
		System.out.println("-----------------");
		C c=new C();
		c.test1();
		c.test3();
		//c.test2();
	}

}