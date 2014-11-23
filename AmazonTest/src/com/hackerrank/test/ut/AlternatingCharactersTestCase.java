package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.AlternatingCharacters;

public class AlternatingCharactersTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetDeletionCount() {
		assertEquals(4, AlternatingCharacters.getDeletionCount("AAABBB"));
	}

}
