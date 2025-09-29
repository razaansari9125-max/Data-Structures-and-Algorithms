package com.Array;

public class oddAndEven {
	
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,7,6,9,8};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i] + " -Even");
			}
			else
			{
				System.out.println(arr[i] + " -odd");
			}
		}
	}
}