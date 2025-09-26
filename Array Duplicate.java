package com.Array;

public class Duplicates {
	public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 4, 5, 7};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; 
                }
            }
        }
    }
}