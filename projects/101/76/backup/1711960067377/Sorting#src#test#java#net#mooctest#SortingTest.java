package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {

	@Test(timeout=4000)
	public void test() {
		Sorting sort = new Sorting();
		
		int[] a = {3, 2, 0, 1};
		int[] b = {0, 1, 2, 3};
		int[] d = {1, 1, 1, 1};
		
		assertEquals(sort.isSorted(a), false);
		assertEquals(sort.isSorted(b), true);
		assertEquals(sort.isSorted(d), true);
		
		sort.insertionSort(a);
		
		assertArrayEquals(a, new int[] {0, 1, 2, 3});
		b = new int[]{2, 3, 1, 0};
		Sorting.quicksort(b);
		
		assertArrayEquals(b, new int[] {0, 1, 2, 3});
		a = new int[]{20, 18, 10, 9, 8, 17, 16, 19, 12, 11, 7, 15, 14, 13, 6, 5, 4, 3, -2, -1};
		Sorting.quicksort(a);
		
		assertArrayEquals(a, new int[]{-2, -1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
		Object[] c = {0, 1, 2, 3};
		Sorting.swapReferences(c, 0, 3);
	}
}
