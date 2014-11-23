package com.hackerrank.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class GameOfThronesI {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String inputString = myScan.nextLine();

		String ans = checkAnswer(inputString) ? "YES" : "NO";
		// Assign ans a value of YES or NO, depending on whether or not
		// inputString satisfies the required condition
		System.out.println(ans);
		myScan.close();
	}

	public static boolean checkAnswer(String inputString) {
		boolean isPalindrome = false;
		if (null == inputString)
			return isPalindrome;
		char[] chars = inputString.toCharArray();
		int oddTimesCount = 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < chars.length; i++) {
			char key = chars[i];
			map.put(key, new Integer(map.getOrDefault(key, 0) + 1));
		}
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			if (it.next().getValue() % 2 != 0)
				oddTimesCount++;
		}

		return oddTimesCount <= 1;
	}
}
