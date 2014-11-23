package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.UtopianTree;

public class UtopianTreeTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testComputeHeight() {
		assertEquals(6,UtopianTree.computeHeight(3));
	}

}
