package com.String;

public class reverseWord {
	public static void main(String[] args) {
		
		String str="Delhi is a Capital";
		String [] word=str.split(" ");  
		for(int i=word.length-1; i>=0; i--)
		{
			System.out.print(word[i]+" ");
		}
	}

}