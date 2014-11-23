package com.amazon.test.ut;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazon.test.Solution;

public class UnitTestCase {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
    public void testFindMissingNum() {
        int N = 5;
        String[] strNums = { "1", "3", "5", "9", "11"};
        int expectedResult = 7;
        int result = Solution.findMissingNum(N, strNums);
        assertEquals(expectedResult, result);
    } 

}
