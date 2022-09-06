package edu.unca.csci333;

import java.util.Arrays;
import java.util.Random;

public class quicksort {
	
	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int partition (int[] arr, int start, int end) {
		
		int piv = arr[end];
		int i = start - 1;
		
		for (int j = start; j < end; j++) {
			
			if (arr[j] < piv) {
				
				i++;
				swap(arr, i , j);
			}
		}
		
		swap(arr, i+1, end);
		return i+1;
	}
	
	public static void quicksort(int[] arr, int start, int end) {
		
		if (start < end) {
			
			int q = partition(arr, start, end);
			quicksort(arr, start, q - 1);
			quicksort(arr, q + 1, end);
		}
	}
	
	public static void randomizedQuicksort(int[] arr, int start, int end) {
		
		if (start < end) {
			
			Random rand = new Random();
			
			int z = rand.nextInt(end + 1);
			swap(arr, end, z);
			int q = partition(arr, start, end);
			randomizedQuicksort(arr, start, q - 1);
			randomizedQuicksort(arr, q + 1, end);
		}
	}
	
	public static void main(String[] args) {

		int[] arr1 = {35,2,18,7,16,45,95};
		int[] arr2 = {4,6,2,76,12,6,8,6,5,6,90};
		int[] arr3 = {1,1,2,3,4,5,6,7,3,4};
		int[] arr4 = {1,9,2,8,3,7,4,6,5};
		int[] arr5 = {10,9,8,7,6,5,4,3,2,1};
		int[] arr6 = {35,2,18,7,16,45,95};
		int[] arr7 = {4,6,2,76,12,6,8,6,5,6,90};
		int[] arr8 = {1,1,2,3,4,5,6,7,3,4};
		int[] arr9 = {1,9,2,8,3,7,4,6,5};
		int[] arr10 = {10,9,8,7,6,5,4,3,2,1};
		
		quicksort(arr1, 0, arr1.length - 1);
		quicksort(arr2, 0, arr2.length - 1);
		quicksort(arr3, 0, arr3.length - 1);
		quicksort(arr4, 0, arr4.length - 1);
		quicksort(arr5, 0, arr5.length - 1);
		
		randomizedQuicksort(arr6, 0, arr6.length - 1);
		randomizedQuicksort(arr7, 0, arr7.length - 1);
		randomizedQuicksort(arr8, 0, arr8.length - 1);
		randomizedQuicksort(arr9, 0, arr9.length - 1);
		randomizedQuicksort(arr10, 0, arr10.length - 1);
		
		System.out.println("Quicksort");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		System.out.println();
		
		System.out.println("randomizedQuicksort");
		System.out.println(Arrays.toString(arr6));
		System.out.println(Arrays.toString(arr7));
		System.out.println(Arrays.toString(arr8));
		System.out.println(Arrays.toString(arr9));
		System.out.println(Arrays.toString(arr10));
		System.out.println();
	}

}
