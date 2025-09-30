package com.Multithreading;

public class A_ThreadSchedulor extends Thread {
	
	@Override
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=0; i<=3; i++)
		{
			System.out.println(n);
			
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}