package com.hackerrank.test;

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int R = in.nextInt();
		System.out.println(getMaxXOR(L, R));
	}

	/**
	 * @param L
	 * @param R
	 */
	public static int getMaxXOR(int L, int R) {
		int maxXOR = 0;
		int temp;
		for (int i = L; i <= R; i++) {
			for (int j = i; j <= R; j++) {
				temp = i ^ j;
				if (temp > maxXOR)
					maxXOR = temp;
			}
		}
		return maxXOR;
	}

}
