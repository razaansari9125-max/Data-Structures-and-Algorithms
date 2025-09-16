package com.constrcutor;

public class Student {
	int id;
	String name;
	
	Student(int i, String n)
	{
		id = i;
		name = n;
		System.out.println("this is P.C.");
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(123, "Ankush");
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		System.out.println("---------------------");
		
		Student s2 = new Student(124, "Akash");
		System.out.println(s2.id);
		System.out.println(s2.name);
	}
	

}