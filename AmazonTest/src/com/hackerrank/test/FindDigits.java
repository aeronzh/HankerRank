package com.hackerrank.test;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCaseCount = in.nextInt();
		int N = 0;
		for (int i = 0; i < testCaseCount; i++) {
			N = in.nextInt();
			int count = findDigitsCount(N);
			System.out.println(count);
		}

	}

	/**
	 * @param N
	 * @return
	 */
	public static int findDigitsCount(int N) {
		int count = 0;
		if (N < 10) {
			count = 1;
		} else {
			for (int tens = 1; N > tens; tens = tens * 10) {
				int num = (N / tens) % 10;
				if (num != 0 && N % num == 0)
					count++;
			}
		}
		return count;
	}

}
