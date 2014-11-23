package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.SherlockSquares;

public class SherlockSquaresTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Long a = 3l, b = 9l;
		Long count = SherlockSquares.getSquaresNumCount(a, b);
		assertTrue(2 == count);

	}
	@Test
	public void test2() {
		Long a = 17l, b = 24l;
		Long count = SherlockSquares.getSquaresNumCount(a, b);
		assertTrue(0== count);

	}
}
