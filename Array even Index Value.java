package com.Array;

//Question3= Write a program to print only even Index value.
public class EvenIndexValues {
	public static void main(String[] args) {
		
		int [] array = {10,20,30,40,50,60};
		for(int i=0; i<array.length; i++)
		{
			if(i%2==0)
			{
				System.out.println("Intex" + i + ":" + array[i]);
			}
		}
	}

}
