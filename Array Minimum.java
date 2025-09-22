package com.Array;

//Question5= Find minimum value in array.
public class Minimum {
	public static void main(String[] args) {
		int [] array = {4,2,9,1,7};
		int minimum = array[0];
		for(int i=1; i<array.length; i++)
		{
			if(array[i] < minimum)
			{
				minimum = array[i];
			}
		}
		System.out.println("minimum value:" + minimum);
	}
	

}