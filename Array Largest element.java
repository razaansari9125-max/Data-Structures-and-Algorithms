package com.Array;

public class LargestElement {
	public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 20};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element: " + max);
    }
}
