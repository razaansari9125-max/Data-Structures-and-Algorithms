package com.Multithreading;

public class A1Driver {
	public static void main(String[] args) {
		
		A1 t1 = new A1();
		A1 t2 = new A1();
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		
		for(int j=1; j<=3; j++)
		{
			System.out.println("hello");
		}
		
	}

}