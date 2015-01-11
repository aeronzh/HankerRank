package com.hackerrank.test.ut;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackerrank.test.arraysorting.InsertionSort;

public class InsertionSortTestCase {

	@Test
	public void testInsertIntoSorted() {
		int[] arr = { 2, 4, 6, 8, 3 };
		InsertionSort.insertIntoSorted(arr);
	}
	
	@Test
	public void testInsertIntoSortedWhenArrayIsSorted() {
		int[] arr = { 1, 2, 3, 4, 5 };
		InsertionSort.insertIntoSorted(arr);
	}
	
	@Test
	public void testInsertIntoSortedWhenArrayIsNotSorted() {
		int[] arr = { 2, 3, 1 };
		InsertionSort.insertIntoSorted(arr);
	}
	
	@Test
	public void testInsertionSortPart2(){
		int[] arr ={1, 4, 3, 5, 6, 2};
		InsertionSort.insertionSortPart2(arr);
	}
}
