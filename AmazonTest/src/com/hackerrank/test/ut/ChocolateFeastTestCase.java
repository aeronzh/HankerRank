package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.ChocolateFeast;

public class ChocolateFeastTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		long candies = ChocolateFeast.getChocolatesCount(10L,2L,5L);
		assertEquals(6	, candies);
	}

}
