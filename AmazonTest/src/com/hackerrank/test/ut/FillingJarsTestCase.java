package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import com.hackerrank.test.FillingJars;

public class FillingJarsTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetAllCandies() {
		long a =1, b=2, k=100;
		long total = FillingJars.getAllCandies( a, b, k);
		String message ="Get expected candy count.";
		assertEquals(200, total);
	}

}
