package com.Pattern;

public class Pattern4 {
	
	public static void main(String[] args) {
	        int n=10;
	        for(int i=1; i<=10; i++) {
	            for(int j=1; j<=10; j++) {
	                if(i+j<=n-1) {
	                    System.out.print(" *");
	                }
	                else{
	                    System.out.print("  ");
	                }
	            }
	            System.out.println( );
	    }
	}
}