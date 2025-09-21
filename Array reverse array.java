package com.Array;
 //Question1= Write a program to print array element in reverse order.
public class ReverseArray {
	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60};
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.println(array[i]);
		}
	}
}