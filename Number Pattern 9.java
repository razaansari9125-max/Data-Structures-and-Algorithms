package com.NumbersPattern;

public class Pattern9 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				char ch = 'A';
				if(i>=j)
				{
					System.out.print(ch++ +" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


}