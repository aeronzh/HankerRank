package com.hackerrank.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternatingCharacters {

	public static void main(String[] args) throws IOException {
		// Scanner in = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		int testCaseCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCaseCount; i++) {
			line = br.readLine();
			int count = getDeletionCount(line);
			System.out.println(count);
		}
	}

	public static int getDeletionCount(String str) {
		int count = 0;
		if (str.length() == 1)
			return 0;
		char[] charArr = str.toCharArray();
		
		for (int i = 1; i < charArr.length; i++) {
			char pre = charArr[i-1], next = charArr[i];
			if (pre == next) {
				count++;
			}
		}
		return count;
	}
}
