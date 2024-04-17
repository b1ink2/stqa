package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MSDTest {

	@Test
	public void test() {
		String[] a = {"c","a","e","d","c"};
		MSD.sort(a);
		String[] b = {"c","e","a","f","g","g"};
		MSD.sort(b);
		String[] c = {"A","C","c","D","f","h","g","A","C","c","D","f","h","g","A","C","c","D","f","h","g"};
		MSD.sort(c);
		String[] f = {"A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A"};
		MSD.sort(f);
		
		int[] d = {1,4,3,42,5,43,6,346,54,7,5,43,534,5,324,35,4,35,34,53,53,45,3};
		MSD.sort(d);
		
		int[] e = {};
		MSD.sort(e);
		

    }
	@Test
	public void testOutOfRangeD() {
		String[] a = {"c","a","e","d","c"};
		try {
			MSD.sort(a, -1); // Passing an out of range value of d
			fail("Expected an AssertionError to be thrown");
		} catch (AssertionError e) {
			// Expected behavior
		}
	}

	@Test
	public void testDGreaterThanLength() {
		String[] b = {"c","e","a","f","g","g"};
		try {
			MSD.sort(b, 6); // Passing a value of d greater than the string length
			fail("Expected an AssertionError to be thrown");
		} catch (AssertionError e) {
			// Expected behavior
		}
	}

}
