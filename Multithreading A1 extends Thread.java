package com.Multithreading;

public class A1 extends Thread {
	
	@Override
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=0; i<3; i++)
		{
			System.out.println(name);
		}
	}
}