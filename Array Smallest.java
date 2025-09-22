package com.Array;

//Question6= Find Smallest value in array.
public class Smallest {
	public static void main(String[] args) {
		
		int []array = {11,12,43,23,50,8};
		int sum = 0;
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > sum)
			{
				sum =array[i];
			}
		}
		System.out.println(sum);
	}

}