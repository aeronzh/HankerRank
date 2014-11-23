package com.amazon.test.ut;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazon.test.Solution2;
import com.amazon.test.Solution2.Node;

public class DiameterTreeTestCase {

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
	public void testDiameterOfTree() {
		int[] nodeDatas = new int[] { 40, 30, 65, 78, 22, 38 };
		int root_i = 0, root_cnt = 0, root_num = 0;
		Node _root = null;
		int isBst = 1;
		root_cnt = nodeDatas.length;
		for (root_i = 0; root_i < root_cnt; root_i++) {
			root_num = nodeDatas[root_i];
			if (isBst == 0) {
				_root = Solution2.addRandomElement(_root, root_num, root_i);
			} else {
				_root = Solution2.insert(_root, root_num);
			}
		}

		int diameter = Solution2.diameterOfTree(_root);
		int expected = 5;
		assertEquals(expected, diameter);
	}
}
