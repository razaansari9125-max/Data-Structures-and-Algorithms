package com.Array;

public class SecondLargest {
	public static void main(String[] args) {

        int[] arr = {3, 2, 7, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("2nd largest number is: " + arr[1]);
    }

}