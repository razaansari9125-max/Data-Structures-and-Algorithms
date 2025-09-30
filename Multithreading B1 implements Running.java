package com.Multithreading;

public class B1 implements Runnable {
	
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