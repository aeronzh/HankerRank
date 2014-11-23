package com.amazon.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matrix {

	static int right(int width, int height, int[] matrix, int currentIndex,
			List<Integer> res) {
		int lastIndex = currentIndex;
		for (int i = currentIndex % width + 1; i < width; i++) {
			lastIndex++;
			if (!res.contains(matrix[lastIndex]))
				res.add(matrix[lastIndex]);
		}
		return lastIndex;
	}

	static int leftDown(int width, int height, int[] matrix, int currentIndex,
			List<Integer> res) {
		int lastIndex = currentIndex;
		for (int i = currentIndex % width - 1, j = currentIndex / width + 1; i >= 0
				&& j < height; i--, j++) {
			lastIndex = j * width + i;
			if (!res.contains(matrix[lastIndex]))
				res.add(matrix[lastIndex]);
		}
		return lastIndex;
	}

	static int left(int width, int height, int[] matrix, int currentIndex,
			List<Integer> res) {
		int lastIndex = currentIndex;
		for (int i = currentIndex % width - 1; i >= 0; i--) {
			lastIndex--;
			if (!res.contains(matrix[lastIndex]))
				res.add(matrix[lastIndex]);
		}
		return lastIndex;
	}

	static int up(int width, int height, int[] matrix, int currentIndex,
			List<Integer> res) {
		int lastIndex = currentIndex;
		for (int i = currentIndex / width - 1; i >= 0; i--) {
			lastIndex = lastIndex - width;
			if (!res.contains(matrix[lastIndex]))
				res.add(matrix[lastIndex]);
		}
		return lastIndex;
	}

	public static int[] convertMatrix(int width, int height, int[] matrix) {
		// 1 2 3 4 5 9 13 12 11 6 7 8
		List<Integer> res = new ArrayList<Integer>();

		int lastIndex = -1;
		for (int j = 0; j < 2; j++) {
			lastIndex = right(width, height, matrix, lastIndex, res);
			lastIndex = leftDown(width, height, matrix, lastIndex, res);
			lastIndex = left(width, height, matrix, lastIndex, res);
			lastIndex = up(width, height, matrix, lastIndex, res);
		}

		return convertIntegers(res);

	}

	public static int[] convertIntegers(List<Integer> integers) {
		int[] ret = new int[integers.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = integers.get(i).intValue();
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] res;
		int _width;
		_width = in.nextInt();

		int _height;
		_height = in.nextInt();

		int[] _matrix = new int[_width * _height];
		int _matrix_item;
		for (int _matrix_i = 0; _matrix_i < _width * _height; _matrix_i++) {
			_matrix_item = in.nextInt();
			_matrix[_matrix_i] = _matrix_item;
		}

		res = convertMatrix(_width, _height, _matrix);
		for (int res_i = 0; res_i < res.length; res_i++) {
			System.out.print(res[res_i]);
			System.out.print(" ");
		}

	}
}