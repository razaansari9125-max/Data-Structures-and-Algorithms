package com.collection;

import java.util.ArrayList;

public class Programs5 {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(24);
		a.add(4235.5);
		a.add("Ansari");
		a.add('@');
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println("index 2 object 15:" +a.get(2));
		System.out.println("==access by for loop==");
		for(int i=0; i<=a.size()-1; i++)
		{
			System.out.println(a.get(i));
		}
		
	}

}