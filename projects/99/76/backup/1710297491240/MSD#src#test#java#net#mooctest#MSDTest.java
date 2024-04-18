package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class MSDTest {

	@Test
	public void test() {
		String[] a = {"c","a","e","d","c"};
		String[] a1 = {"c","a","e","d","c"};
		MSD.sort(a);
		MSDO.sort(a1);
		for(int i = 0; i<a.length;i++) {
			assert a[i].equals(a1[i]);
		}
		
		String[] b = {"c","e","a","f","g","g"};
		String[] b1 = {"a", "c", "e", "f", "g", "g"};
		MSD.sort(b);
		MSDO.sort(b1);
		for(int i = 0; i<b.length;i++) {
			assert b[i].equals(b1[i]);
		}
		
		String[] c = {"A","C","c","D","f","h","g","A","C","c","D","f","h","g","A","C","c","D","f","h","g"};
		String[] c1 = {"A", "A", "A", "A", "C", "C", "C", "D", "D", "D", "c","c","c","f","f", "f", "g", "g", "g", "h", "h", "h"};
		MSD.sort(c);
		MSDO.sort(c1);
		for(int i = 0; i<a.length;i++) {
			assert c[i].equals(c1[i]);
		}
		
		String[] f = {"A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A"};
		String[] f1 = {"A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A","A"};
		MSD.sort(f);
		MSDO.sort(f1);
		for(int i = 0; i<a.length;i++) {
			assert f[i].equals(f1[i]);
		}
		
		int[] d = {1,4,3,42,5,43,6,346,54,7777,5,43,534,5,324,35,4,35,34,53,53,45,3};
		int[] d1 = {1, 3, 3, 4, 4, 5, 5, 5, 6, 34, 35, 35, 42, 43, 43, 45, 53, 53, 54, 324, 346, 534, 7777};
		MSD.sort(d);
		MSDO.sort(d1);
		for(int i = 0; i<a.length;i++) {
			assert d[i] == d1[i];
		}
    }
}

class MSDO {
	private static final int BITS_PER_BYTE =   8;
    private static final int BITS_PER_INT  =  32;   // each Java int is 32 bits 
    private static final int R             = 256;   // extended ASCII alphabet size
    private static final int CUTOFF        =  15;   // cutoff to insertion sort

    // do not instantiate
    private MSDO() { } 

   /**
     * Rearranges the array of extended ASCII strings in ascending order.
     *
     * @param a the array to be sorted
     */
    public static void sort(String[] a) {
        int n = a.length;
        String[] aux = new String[n];
        sort(a, 0, n-1, 0, aux);
    }

    // return dth character of s, -1 if d = length of string
    private static int charAt(String s, int d) {
        assert d >= 0 && d <= s.length();
        if (d == s.length()) return -1;
        return s.charAt(d);
    }

    // sort from a[lo] to a[hi], starting at the dth character
    private static void sort(String[] a, int lo, int hi, int d, String[] aux) {

        // cutoff to insertion sort for small subarrays
        if (hi <= lo + CUTOFF) {
            insertion(a, lo, hi, d);
            return;
        }

        // compute frequency counts
        int[] count = new int[R+2];
        for (int i = lo; i <= hi; i++) {
            int c = charAt(a[i], d);
            count[c+2]++;
        }

        // transform counts to indicies
        for (int r = 0; r < R+1; r++)
            count[r+1] += count[r];

        // distribute
        for (int i = lo; i <= hi; i++) {
            int c = charAt(a[i], d);
            aux[count[c+1]++] = a[i];
        }

        // copy back
        for (int i = lo; i <= hi; i++) 
            a[i] = aux[i - lo];


        // recursively sort for each character (excludes sentinel -1)
        for (int r = 0; r < R; r++)
            sort(a, lo + count[r], lo + count[r+1] - 1, d+1, aux);
    }


    // insertion sort a[lo..hi], starting at dth character
    private static void insertion(String[] a, int lo, int hi, int d) {
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(a[j], a[j-1], d); j--)
                exch(a, j, j-1);
    }

    // exchange a[i] and a[j]
    private static void exch(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // is v less than w, starting at character d
    private static boolean less(String v, String w, int d) {
        // assert v.substring(0, d).equals(w.substring(0, d));
        for (int i = d; i < Math.min(v.length(), w.length()); i++) {
            if (v.charAt(i) < w.charAt(i)) return true;
            if (v.charAt(i) > w.charAt(i)) return false;
        }
        return v.length() < w.length();
    }


   /**
     * Rearranges the array of 32-bit integers in ascending order.
     * Currently assumes that the integers are nonnegative.
     *
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        int n = a.length;
        int[] aux = new int[n];
        sort(a, 0, n-1, 0, aux);
    }

    // MSD sort from a[lo] to a[hi], starting at the dth byte
    private static void sort(int[] a, int lo, int hi, int d, int[] aux) {

        // cutoff to insertion sort for small subarrays
        if (hi <= lo + CUTOFF) {
            insertion(a, lo, hi, d);
            return;
        }

        // compute frequency counts (need R = 256)
        int[] count = new int[R+1];
        int mask = R - 1;   // 0xFF;
        int shift = BITS_PER_INT - BITS_PER_BYTE*d - BITS_PER_BYTE;
        for (int i = lo; i <= hi; i++) {
            int c = (a[i] >> shift) & mask;
            count[c + 1]++;
        }

        // transform counts to indicies
        for (int r = 0; r < R; r++)
            count[r+1] += count[r];

/************* BUGGGY CODE.
        // for most significant byte, 0x80-0xFF comes before 0x00-0x7F
        if (d == 0) {
            int shift1 = count[R] - count[R/2];
            int shift2 = count[R/2];
            for (int r = 0; r < R/2; r++)
                count[r] += shift1;
            for (int r = R/2; r < R; r++)
                count[r] -= shift2;
        }
************************************/
        // distribute
        for (int i = lo; i <= hi; i++) {
            int c = (a[i] >> shift) & mask;
            aux[count[c]++] = a[i];
        }

        // copy back
        for (int i = lo; i <= hi; i++) 
            a[i] = aux[i - lo];

        // no more bits
        if (d == 4) return;

        // recursively sort for each character
        if (count[0] > 0)
            sort(a, lo, lo + count[0] - 1, d+1, aux);
        for (int r = 0; r < R; r++)
            if (count[r+1] > count[r])
                sort(a, lo + count[r], lo + count[r+1] - 1, d+1, aux);
    }

    // TODO: insertion sort a[lo..hi], starting at dth character
    private static void insertion(int[] a, int lo, int hi, int d) {
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && a[j] < a[j-1]; j--)
                exch(a, j, j-1);
    }

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
