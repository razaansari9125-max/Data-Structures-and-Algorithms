package com.Array;

public class LeftRotate {
	public static void main(String[] args) {
		
		int []arr1 = {1, 2, 3, 4, 5};
		int first = arr1[0];
		
		for(int i=1; i<arr1.length; i++)
		{
			arr1[i-1] = arr1[i];
		}
		arr1[arr1.length-1] = first;
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}
