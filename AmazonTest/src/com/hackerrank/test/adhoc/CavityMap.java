package com.hackerrank.test.adhoc;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		char[][] map = new char[n][n];
		for (int i = 0; i < n; i++) {
			String strNum = scanner.nextLine();
			for (int j = n - 1; j >= 0; j--) {
				char current = (strNum.charAt(j));
				map[i][j] = current;
			}
		}
		scanner.close();
		markCavity(map);
	}

	public static void markCavity(char[][] map) {
		if (map == null)
			return;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				char current = map[i][j];
				if (i == 0 || i == map.length - 1 || j == 0
						|| j == map[i].length - 1) {
					System.out.printf("%c", current);
					continue;
				}
				char up = map[i - 1][j];
				char down = map[i + 1][j];
				char left = map[i][j - 1];
				char right = map[i][j + 1];
				if (current > up && current > down && current > left
						&& current > right) {
					System.out.printf("X");
				}
				else
					System.out.printf("%c", current);
			}
			System.out.println();
		}
	}
}
