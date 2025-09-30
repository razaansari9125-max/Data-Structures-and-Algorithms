package com.Multithreading;

public class B1Driver {
	public static void main(String[] args) {
		
		B1 r = new B1();
		
		Thread th1=new Thread(r);
		Thread th2= new Thread(r);
		
		th1.setName("thread1");
		th1.setName("thread2");
		
		th1.start();
		th2.start();
		
		
	}

}