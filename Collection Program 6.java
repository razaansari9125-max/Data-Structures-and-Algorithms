package com.collection;

import java.util.ArrayList;

public class Programs6 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList();
		a.add(12);
		a.add(28);
		a.add(40);
		
		
		System.out.println(a);
		System.out.println((Integer)a.get(0)+(Integer)a.get(1));
		System.out.println("-----sum of all the element-----");
		
		Integer sum = 0;
		for(int i=0; i<=a.size()-1; i++)
		{
			sum=sum+a.get(i);
		 }
		System.out.println("sum is:" +sum);
	}

}