package com.Array;

public class SumOfAllEven {
	public static void main(String[] args) {
		int []arr = {3, 4, 5, 6, 7, 8, 9};
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}

}