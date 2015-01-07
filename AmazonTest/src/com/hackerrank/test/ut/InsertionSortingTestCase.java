package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackerrank.test.arraysorting.InsertionSorting;

public class InsertionSortingTestCase {

	@Test
	public void testInsertIntoSorted() {
		int[] arr = { 2, 4, 6, 8, 3 };
		InsertionSorting.insertIntoSorted(arr);
	}
	
	@Test
	public void testInsertIntoSortedWhenArrayIsSorted() {
		int[] arr = { 1, 2, 3, 4, 5 };
		InsertionSorting.insertIntoSorted(arr);
	}
	
	@Test
	public void testInsertIntoSortedWhenArrayIsNotSorted() {
		int[] arr = { 2, 3, 1 };
		InsertionSorting.insertIntoSorted(arr);
	}
	
	
}
