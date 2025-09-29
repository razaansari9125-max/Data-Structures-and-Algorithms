package com.Array;

public class SecondSmallest {
	public static void main(String[] args) {

        int[] arr = {9, 2, 4, 1, 7, 6, 3, 8, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("2nd Samllest number is: " + arr[1]);
    }
}