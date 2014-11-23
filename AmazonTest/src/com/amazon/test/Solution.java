package com.amazon.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String args[]) throws Exception {
		/*
		 * Sample input 5 1 3 5 9 11
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		line = br.readLine();
		String[] strNums = line.split(" ");
		// int[] iNums = new int[N];
		int targetNum = findMissingNum(N, strNums);

		System.out.println(targetNum);
	}

	public static int findMissingNum(int N, String[] strNums) {
		int pre, current, next;
		int targetNum = 0;
		for (int i = 1; (i + 1) < strNums.length; i++) {
			pre = Integer.parseInt(strNums[i - 1]);
			current = Integer.parseInt(strNums[i]);
			next = Integer.parseInt(strNums[i + 1]);
			if (next - current != current - pre) {
				targetNum = current + (next - current) / 2;
				break;
			}
		}
		return targetNum;
	}
}
