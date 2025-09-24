package com.collection;

import java.util.ArrayList;

public class Programs4 {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(12);
		a.add(20);
		
		System.out.println(a);//12   20
		
		a.add(21);  //12 20 21
		a.add(3,45); 
		
		System.out.println(a); //12 20 21 45
		
		a.add(1,48);
		System.out.println(a); //12 48 20 21 45
		
		ArrayList b = new ArrayList(30);
		ArrayList c = new ArrayList(a);
		
		System.out.println(c);////12 48 20 21 45
		System.out.println(c.get(3)); //21
				
	}

}