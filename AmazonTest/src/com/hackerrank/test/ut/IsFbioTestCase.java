package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.IsFibo;

public class IsFbioTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testIsFibo() {
		assertEquals(true, IsFibo.isFibo(3));
	}
	@Test
	public void testIsFibonacci(){
		assertEquals(true, IsFibo.isFibonacci(new BigDecimal(3)));
	}

}
