package com.collection.list;


import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ansari");
		names.add("Rahul");
		names.add("Priya");
		names.add("Sneha");
		
		ListIterator<String> listItr =names.listIterator();
		
		System.out.println("\nForward direction:");
		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}
		System.out.println("\nBackward direction:");
		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}
	}
}