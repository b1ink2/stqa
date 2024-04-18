package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class MSDTest {

	@Test
	public void test() {
		String[] a = {};
        String[] a1 = {"j1","2","a","2","d"};
        int[] a2 = {};
        int[] a3 = {0,2523,5623,-3223,-423,-523,-523,-523,-523,-523};
        String[] a4 = {"-19","-4","-32","-1","-26","59","-14","-2","-17","-216","12","b","k","G","rr","op0","-.kt"};
        int[] a5 = {1,52,65234,-1,0,659234,-53,7,5214,-5,-68,45,5213,13,22,16,5,4,17};
        String[] a6 = {"-4","-32","-1","-26","59","-14","-2","-216","12","b","k","G","rr","op0","-.kt"};
        
        
        MSD.sort(a);
        MSD.sort(a1);
        MSD.sort(a2);
        MSD.sort(a3);
        MSD.sort(a4);
        MSD.sort(a5);
        MSD.sort(a6);

    
        
        assertArrayEquals(new String[] {},a);
        assertArrayEquals(new String[] {"2","2","a","d","j1"},a1);
        assertArrayEquals(new int[] {},a2);
        assertArrayEquals(new int[] {-3223,-523,-523,-523,-523,-523,-423,0,2523,5623},a3);
        assertArrayEquals(new String[] {"-.kt","-1","-14","-17","-19","-2","-216","-26","-32","-4","12","59","G","b","k","op0","rr"},a4);
        assertArrayEquals(new int[] {0,1,4,5,7,13,16,17,22,45,52,5213,5214,65234,659234,-68,-53,-5,-1}, a5);
        assertArrayEquals(new String[] {"-.kt","-1","-14","-2","-216","-26","-32","-4","12","59","G","b","k","op0","rr"},a6);
    }
}