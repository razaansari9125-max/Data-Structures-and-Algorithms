package com.Pattern;

public class Pattern8 {
public static void main(String[] args) {
        
	int n = 9;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i<=j && i+j>=n-1)  {
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