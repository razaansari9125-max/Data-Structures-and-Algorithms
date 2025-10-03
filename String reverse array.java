package com.String;

public class reverseArray {
	public static void main(String[] args) {
		
		String s="java";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]+" ");
		}
	}

}