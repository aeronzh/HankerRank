package com.hackerrank.test.arraysorting;

public class InsertionSorting {

	public static void main(String[] args) {

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
