package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.FindDigits;

public class FindDigitsTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		int N = 12;
		int actual = FindDigits.findDigitsCount(N);
		int expected = 2;
		assertEquals(expected, actual);
	}

}
