package com.collection;

import java.util.ArrayList;

public class Programs7 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(3244);
		a.add(234);
		a.add(88);
		a.add(88);
		
		System.out.println(a);
		System.out.println(a.get(0)+a.get(1));
		Integer sum = 0;
		for(int i=0; i<=a.size()-1; i++)
		{
			sum = sum + a.get(i);
		}
		System.out.println("sum is :" +sum);
	}

}