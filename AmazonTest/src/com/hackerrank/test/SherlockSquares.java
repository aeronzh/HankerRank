package com.hackerrank.test;

import java.time.Period;
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

	public static boolean isExactSquare(Long a) {
		// 1. it ends in 2, 3,7 or 8
		int lastNum = (int) (a % 10);
		if (lastNum == 2 || lastNum == 3 || lastNum == 7 || lastNum == 8)
			return false;
		// 2. it terminates in an odd number of zeros
		// 3. its last digit is 6 but its penultimate (tens) digit is even
		if (a > 9) {
			int penultimate = (int) (a / 10) % 10;
			if (lastNum == 6 && penultimate % 2 == 0)
				return false;
			// 4. its last digit is not 6 but its penultimate (tens) digit is
			// odd
			if (lastNum != 6 && penultimate % 2 != 0)
				return false;
			// 5. its last digit is 5 but its penultimate (tens) digit is other
			// than 2
			if (lastNum == 5 && penultimate != 2)
				return false;
			// 6. its last 2 digits are not divisible by 4 if it is even number
			int last2Digits = (int) (a % 100);
			if (last2Digits % 2 == 0 && last2Digits % 4 != 0)
				return false;
		}
		return true;
	}

	public static Long getSquaresNumCount(Long a, Long b) {
		HashMap<Long, Long> hs = new HashMap<Long, Long>();
		for (Long i = a; i <= b; i++) {
			if (hs.containsKey(i))
				continue;
			if (!isExactSquare(i))
				continue;
			long iSqrt = (long) Math.sqrt(i);
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
