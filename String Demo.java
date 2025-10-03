package com.String;

public class Demo {
	public static void main(String[] args) {
		
		String s1="java";
		
		System.out.println(s1);
		
		String s2=new String("Education");
		System.out.println(s2);
		
		Car c=new Car(900);
		c.display();
		
		System.out.println(c.toString());
	}
}