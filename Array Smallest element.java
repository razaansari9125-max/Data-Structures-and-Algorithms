package com.Array;

public class Smallest {
	public static void main(String[] args) {
        int[] arr = {10, 50, 5, 70, 20};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);
    }
}