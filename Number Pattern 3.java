package com.NumbersPattern;

public class Pattern3 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n; i++)
		{
			int k=1;
			for(int j=0; j<n; j++)
			{
				if(i>=j)
				{
					System.out.print(k++ +" ");
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