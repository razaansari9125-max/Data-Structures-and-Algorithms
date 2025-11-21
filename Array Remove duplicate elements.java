package com.Array;

import java.util.HashSet;

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,5,6,5};
		HashSet<Integer> seen=new HashSet<>();
		HashSet<Integer> duplicate = new HashSet<>();
		
		for(int dup:arr)
		{
			if(!seen.add(dup))
			{
				duplicate.add(dup);
			}
		}
		System.out.println(duplicate);
	}

}
