package com.hackerrank.test;

import java.util.Scanner;

public class ChocolateFeast {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int testCount = Integer.parseInt(myScan.nextLine());
		for (int i = 0; i < testCount; i++) {
			String[] strNM = myScan.nextLine().split(" ");
			Long N = Long.parseLong(strNM[0]);
			Long C = Long.parseLong(strNM[1]);
			Long M = Long.parseLong(strNM[2]);

			Long count = getChocolatesCount(N, C, M);
			System.out.println(count);
		}
	}

	public static Long getChocolatesCount(Long n, Long c, Long m) {
		Long count = 0l, leftWrappers = 0l, exchangedCandies = 0l;
		leftWrappers = count = n / c;
		while (leftWrappers >= m) {
			exchangedCandies = leftWrappers / m;
			count += exchangedCandies;
			leftWrappers = leftWrappers % m + exchangedCandies;
		}
		return count;
	}

}
