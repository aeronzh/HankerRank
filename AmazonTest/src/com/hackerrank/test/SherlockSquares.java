package com.hackerrank.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class SherlockSquares {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int testCount = Integer.parseInt(myScan.nextLine());
		for (int i = 0; i < testCount; i++) {
			String[] strNM = myScan.nextLine().split(" ");
			Long A = Long.parseLong(strNM[0]);
			Long B = Long.parseLong(strNM[1]);

			Long count = getSquaresNumCount(A, B);
			System.out.println(count);
		}
	}

	public static Long getSquaresNumCount(Long a, Long b) {
		HashMap<Long, Long> hs = new HashMap<Long, Long>();
		for (Long i = a; i <= b; i++) {
			if (hs.containsKey(i))
				continue;
			int lastNum = (int) (i % 10);
			if (lastNum == 2 || lastNum == 3 || lastNum == 7 || lastNum == 8)
				continue;
			int iSqrt = (int) Math.sqrt(i);
			if (iSqrt * iSqrt == i) {
				hs.put(i, i);
				Long nextSqrt = i * i;
				while (nextSqrt <= b) {
					hs.put(nextSqrt, nextSqrt);
					nextSqrt = nextSqrt * nextSqrt;
				}
			}
		}
		return (long) hs.size();
	}
}
