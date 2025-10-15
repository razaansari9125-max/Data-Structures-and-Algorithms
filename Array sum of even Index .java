package com.Array;

public class SumOfEvenIndex {
	public static void main(String[] args) {
		
		int []arr = {11, 12, 9, 8, 4};
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}

}