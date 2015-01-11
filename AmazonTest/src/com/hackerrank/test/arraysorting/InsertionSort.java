package com.hackerrank.test.arraysorting;

public class InsertionSort {

	public static void main(String[] args) {

	}
	public static void insertionSortPart2(int[] ar) {
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided
		if (ar == null || ar.length == 0)
			return;
		if (ar.length == 1) {
			printArray(ar);
			return;
		}
		int temp;
		for (int i = 1; i < ar.length; i++) {
			int j = i;
			while (j > 0 && ar[j] < ar[j - 1]) {
				temp = ar[j];
				ar[j] = ar[j - 1];
				ar[j - 1] = temp;
				j--;
			}
			printArray(ar);
		}
	}
	
	public static void insertIntoSorted(int[] ar) {
		if (ar == null || ar.length == 0)
			return;
		int lastNum = ar[ar.length - 1];
		for (int i = ar.length - 2; i >= 0; i--) {
			if (lastNum < ar[i]) {
				ar[i + 1] = ar[i];
				printArray(ar);
			} else {
				ar[i + 1] = lastNum;
				printArray(ar);
				return;
			}
		}
		ar[0] = lastNum;
		printArray(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
