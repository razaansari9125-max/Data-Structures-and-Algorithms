package com.constrcutor;

public class StudentDriver {
	int id;
	String name;
	
	StudentDriver()
	{
		id = 123;
		name = "Java is a language";
		System.out.println("Abdul noida");
	}
	public static void main(String[] args) {
		StudentDriver s1 = new StudentDriver();
		System.out.println("ID:" + s1.id);
		System.out.println("Name:" + s1.name);
	}

}