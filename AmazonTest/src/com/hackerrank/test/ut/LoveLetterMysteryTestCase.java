package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.LoveLetterMystery;

public class LoveLetterMysteryTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetChangesCount() {
		assertEquals(2, LoveLetterMystery.getChangesCount("abc"));
	}

	@Test
	public void testGetChangesCountComplicated() {
		/*
		 * pue 11 heubsbn 11 feazhaxpux 58 hmhcy27 tmp 4
		 */

		assertEquals(11,
				LoveLetterMystery.getChangesCount("pue"));
	}

}
