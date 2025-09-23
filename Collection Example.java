package com.collection.list;

import java.util.ArrayList;

public class CollectionExample {
public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Apple");
		a.add("Banana");
		a.add("Orange");
		
		System.out.println("Does list contain 'Apple'? " + a.contains("Apple"));
		System.out.println("Does list contain 'Banana'? " + a.contains("Banana"));
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Apple");
		b.add("Banana");
		
		System.out.println("Does list a contain all element of list b ? " + a.containsAll(b));
		b.add("Mango");
		
		System.out.println("Now does list a contain all element of list b ? " + a.containsAll(b));
		
		
		
	}


}