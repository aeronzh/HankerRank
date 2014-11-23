package com.hackerrank.test;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCaseCount = in.nextInt();
		int N = 0;
		for (int i = 0; i < testCaseCount; i++) {
			N = in.nextInt();
			int count = computeHeight(N);
			System.out.println(count);
		}
	}

	public static int computeHeight(int n) {
		int height = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				height = 2 * height;
			} else {
				height += 1;
			}
		}
		return height;
	}

}
