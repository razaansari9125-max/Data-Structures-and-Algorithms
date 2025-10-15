package com.Array;

public class SumOfOddIndex {
public static void main(String[] args) {
		
		int []arr = {11, 12, 9, 8, 4};
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==1)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}


}