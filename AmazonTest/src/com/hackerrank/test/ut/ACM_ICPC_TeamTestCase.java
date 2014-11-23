package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.ACM_ICPC_Team;
import com.hackerrank.test.ACM_ICPC_Team.BestResult;

public class ACM_ICPC_TeamTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		ACM_ICPC_Team acm_ICPC_Team = new ACM_ICPC_Team();
		BestResult expected = acm_ICPC_Team.new BestResult(5, 2);
		List<String> abilities = new ArrayList<String>();
		int N = 4, M = 5;
		abilities.add("10101");
		abilities.add("11100");
		abilities.add("11010");
		abilities.add("00101");

		assertEquals(expected, acm_ICPC_Team.getBestResult(M, abilities));
	}

	@Test
	public void testNumberFormat() {
//ULong
//		String input = "1001101111101011011100101100100110111011111011000100111100111110111101011011011100111001100011111010";
//		ulong a =UnsignLong.parseLong(input, 2);
//		assertEquals(1, 1);

	}
}
