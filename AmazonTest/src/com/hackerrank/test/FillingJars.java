package com.hackerrank.test;

import java.util.Scanner;

public class FillingJars {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String[] strNM = myScan.nextLine().split(" ");
		Long N = Long.parseLong(strNM[0]);//Double.parseDouble(strNM[0]);
		Long M = Long.parseLong(strNM[1]);
		long totalCandies = 0;
		for (long i = 0; i < M; i++) {
			String[] abk = myScan.nextLine().split(" ");
			long a = Long.parseLong(abk[0]);
			long b = Long.parseLong(abk[1]);
			long k = Long.parseLong(abk[2]);
			totalCandies += getAllCandies(a, b, k);
		}
		System.out.println((long)Math.ceil(totalCandies/N));
	}

	public static long getAllCandies(long a, long b, long k) {
		long total = 0;
		total = (b - a + 1) * k;
		return total;
	}

}
