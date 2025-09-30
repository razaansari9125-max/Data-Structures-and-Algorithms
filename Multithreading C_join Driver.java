package com.Multithreading;

public class C_joinDriver {
	public static void main(String[] args) {
		
		A_ThreadSchedulor t1=new A_ThreadSchedulor();
		A_ThreadSchedulor t2=new A_ThreadSchedulor();
		A_ThreadSchedulor t3=new A_ThreadSchedulor();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t2.start();
		
		t3.start();
		try
		{
			t3.join();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			
		}
		String n=Thread.currentThread().getName();
		for(int i=0; i<=3; i++)
		{
			System.out.println(n);
		}
	}

}