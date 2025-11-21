package com.Array;

public class Frequency {
	public static void main(String[] args) {
		
		 int[] arr1 = {3, 4, 5, 6, 6};
	        boolean[] visited = new boolean[arr1.length];

	        for (int i = 0; i < arr1.length; i++) {
	            if (visited[i]) {
	                continue;
	            }
	            int count = 1;

	            for (int j = i + 1; j < arr1.length; j++) {
	                if (arr1[i] == arr1[j]) {
	                    visited[j] = true;
	                    count++;
	                }
	            }

	            System.out.println(arr1[i] + " appears " + count + " times");
	        }
		}
}
