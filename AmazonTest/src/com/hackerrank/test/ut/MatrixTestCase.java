package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amazon.test.Matrix;

public class MatrixTestCase {

	@Test
	public void testConvertMatrix1() {
		int width = 5, height = 3;
		int N = width * height;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		int[] res = Matrix.convertMatrix(width, height, arr);
		int[] expected = new int[] { 1, 2, 3, 4, 5, 9, 13, 12, 11, 6, 7, 8 };
		for (int i = 0; i < res.length; i++) {
			assertEquals(expected[i], res[i]);
		}
	}

	@Test
	public void testConvertMatrix2() {
		int width = 3, height = 5;
		int N = width * height;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		int[] res = Matrix.convertMatrix(width, height, arr);
		int[] expected = new int[] { 1, 2, 3, 5, 7, 4 };
		for (int i = 0; i < res.length; i++) {
			assertEquals(expected[i], res[i]);
		}
	}
}
