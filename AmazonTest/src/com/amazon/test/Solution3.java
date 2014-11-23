package com.amazon.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {
	static int getNumberOfPrimes(int N) {
		int count = 0;
		int i = 1;
		while (i < N) {
			if (isPrime(i))
				count++;
			i++;
		}
		return count;
	}

	// checks whether an int is prime or not.
	static boolean isPrime(int n) {
		// check if n is a multiple of 2
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _a;
		_a = in.nextInt();
		res = getNumberOfPrimes(_a);
		System.out.println(res);
	}
}