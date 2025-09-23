package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Mango");
		
		Iterator<String> it = fruits.iterator();
		
		System.out.println("Fruits in the list:");
		while(it.hasNext())
		{
			String fruit = it.next();
			System.out.println(fruit+" ");
		}	
	}
}