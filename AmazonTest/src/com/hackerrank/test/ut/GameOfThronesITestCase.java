package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.GameOfThronesI;

public class GameOfThronesITestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCheckAnswer() {
		assertEquals(true, GameOfThronesI.checkAnswer("aaabbbb"));
	}

}
