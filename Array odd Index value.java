package com.Array;

//Question4= Write a program to print odd Index value.
public class oddIndexValues {
	public static void main(String[] args) {
		
		int [] array = {10,20,30,40,50,60};
		for(int i=0; i<array.length; i++)
		{
			if(i%2==1)
			{
				System.out.println("Index" + i + ":" + array[i]);
			}
		}
	}

}