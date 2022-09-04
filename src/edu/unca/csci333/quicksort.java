package edu.unca.csci333;

import java.util.Arrays;

public class quicksort {

	private static int partition (int[] arr, int start, int end) {
		
		int x = arr[end-1];
		int i = start;
		
		for (int j = start + 1; j < end; j++) {
			
			if (arr[j] <= x) {
				
				i = i + 1;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = temp;
		return i+1;
	}
	
	public static void quicksort(int[] arr, int start, int end) {
		
		if (start < end) {
			
			int q = partition(arr, start, end);
			quicksort(arr, start, q - 1);
			quicksort(arr, q + 1, end);
		}
	}
	
	public static void main(String[] args) {

		int[] arr1 = {25,2,18,7,16,45,95};
		quicksort(arr1, 0, arr1.length);
		
		System.out.println(Arrays.toString(arr1));
	}

}
