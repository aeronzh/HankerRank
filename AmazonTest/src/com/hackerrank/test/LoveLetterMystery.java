package com.hackerrank.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LoveLetterMystery {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			line = br.readLine();
			int count = getChangesCount(line);
			System.out.println(count);
		}
	}

	public static int getChangesCount(String line) {
		int count = 0;
		char[] arr = line.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < arr.length / 2; i++) {
			stack.push(arr[i]);
		}
		int nextBegin = arr.length % 2 == 0 ? arr.length / 2
				: arr.length / 2 + 1;
		for (int i = nextBegin; i < arr.length; i++) {
			char pre = (char) stack.pop();
			if (pre < arr[i])
				count += arr[i] - pre;
			else if (pre > arr[i])
				count += pre - arr[i];
		}
		return count;
	}

}
