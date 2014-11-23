package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;

import com.hackerrank.test.AngryChildren;

public class AngryChildrenTestCase {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetBestUnfairness() {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(100);
		nums.add(300);
		nums.add(200);
		nums.add(1000);
		nums.add(20);
		nums.add(30);
		int k =3;
		assertEquals(20, AngryChildren.getBestUnfairness(nums, k));
	}

}
