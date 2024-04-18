package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MSDTest {

	@Test
	public void test() {
		String[] a = {"c","a","e","d","c"};
		MSD.sort(a);
		String[] b = {"c","e","a","f","g","h"};
		MSD.sort(b);
		String[] c = {"A","C","c","D","f","h","g","A","C","c","D","f","h","g","A","C","c","D","f","h","g"};
		MSD.sort(c);
		
		int[] d = {1,4,3,42,5,43,6,346,54,7,5,43,534,5,324,35,4,35,34,53,53,45,3};
		MSD.sort(d);
    }

}
