package com.collection.list;

import java.util.ArrayList;

public class forEachLoopExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		System.out.println("Printing numbers using for-each loop");
		for(Integer num : numbers)
		{
			System.out.println(num);
		}
		
	}

}