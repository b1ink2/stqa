/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Arrays;

public class MSD {public static class __CLR4_4_100ltz65w48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0039\u0039\u005c\u005c\u0037\u0036\u005c\u005c\u004d\u0053\u0044\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1710900802128L,8589935092L,125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int BITS_PER_BYTE =   8;
    private static final int BITS_PER_INT  =  32;   // each Java int is 32 bits 
    private static final int R             = 256;   // extended ASCII alphabet size
    private static final int CUTOFF        =  15;   // cutoff to insertion sort

    // do not instantiate
    private MSD() {try{__CLR4_4_100ltz65w48.R.inc(0); }finally{__CLR4_4_100ltz65w48.R.flushNeeded();}} 

   /**
     * Rearranges the array of extended ASCII strings in ascending order.
     *
     * @param a the array to be sorted
     */
    public static void sort(String[] a) {try{__CLR4_4_100ltz65w48.R.inc(1);
        __CLR4_4_100ltz65w48.R.inc(2);int n = a.length;
        __CLR4_4_100ltz65w48.R.inc(3);String[] aux = new String[n];
        __CLR4_4_100ltz65w48.R.inc(4);sort(a, 0, n-1, 0, aux);
    }finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

    // return dth character of s, -1 if d = length of string
    private static int charAt(String s, int d) {try{__CLR4_4_100ltz65w48.R.inc(5);
        assert (((d >= 0 && d <= s.length())&&(__CLR4_4_100ltz65w48.R.iget(6)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(7)==0&false));
        __CLR4_4_100ltz65w48.R.inc(8);if ((((d == s.length())&&(__CLR4_4_100ltz65w48.R.iget(9)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(10)==0&false))) {__CLR4_4_100ltz65w48.R.inc(11);return -1;
        }__CLR4_4_100ltz65w48.R.inc(12);return s.charAt(d);
    }finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

    // sort from a[lo] to a[hi], starting at the dth character
    private static void sort(String[] a, int lo, int hi, int d, String[] aux) {try{__CLR4_4_100ltz65w48.R.inc(13);

        // cutoff to insertion sort for small subarrays
        __CLR4_4_100ltz65w48.R.inc(14);if ((((hi <= lo + CUTOFF)&&(__CLR4_4_100ltz65w48.R.iget(15)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(16)==0&false))) {{
            __CLR4_4_100ltz65w48.R.inc(17);insertion(a, lo, hi, d);
            __CLR4_4_100ltz65w48.R.inc(18);return;
        }

        // compute frequency counts
        }__CLR4_4_100ltz65w48.R.inc(19);int[] count = new int[R+2];
        __CLR4_4_100ltz65w48.R.inc(20);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(21)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(22)==0&false)); i++) {{
            __CLR4_4_100ltz65w48.R.inc(23);int c = charAt(a[i], d);
            __CLR4_4_100ltz65w48.R.inc(24);count[c+2]++;
        }

        // transform counts to indicies
        }__CLR4_4_100ltz65w48.R.inc(25);for (int r = 0; (((r < R+1)&&(__CLR4_4_100ltz65w48.R.iget(26)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(27)==0&false)); r++)
            {__CLR4_4_100ltz65w48.R.inc(28);count[r+1] += count[r];

        // distribute
        }__CLR4_4_100ltz65w48.R.inc(29);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(30)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(31)==0&false)); i++) {{
            __CLR4_4_100ltz65w48.R.inc(32);int c = charAt(a[i], d);
            __CLR4_4_100ltz65w48.R.inc(33);aux[count[c+1]++] = a[i];
        }

        // copy back
        }__CLR4_4_100ltz65w48.R.inc(34);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(35)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(36)==0&false)); i++) 
            {__CLR4_4_100ltz65w48.R.inc(37);a[i] = aux[i - lo];


        // recursively sort for each character (excludes sentinel -1)
        }__CLR4_4_100ltz65w48.R.inc(38);for (int r = 0; (((r < R)&&(__CLR4_4_100ltz65w48.R.iget(39)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(40)==0&false)); r++)
            {__CLR4_4_100ltz65w48.R.inc(41);sort(a, lo + count[r], lo + count[r+1] - 1, d+1, aux);
    }}finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}


    // insertion sort a[lo..hi], starting at dth character
    private static void insertion(String[] a, int lo, int hi, int d) {try{__CLR4_4_100ltz65w48.R.inc(42);
        __CLR4_4_100ltz65w48.R.inc(43);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(44)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(45)==0&false)); i++)
            {__CLR4_4_100ltz65w48.R.inc(46);for (int j = i; (((j > lo && less(a[j], a[j-1], d))&&(__CLR4_4_100ltz65w48.R.iget(47)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(48)==0&false)); j--)
                {__CLR4_4_100ltz65w48.R.inc(49);exch(a, j, j-1);
    }}}finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

    // exchange a[i] and a[j]
    private static void exch(String[] a, int i, int j) {try{__CLR4_4_100ltz65w48.R.inc(50);
        __CLR4_4_100ltz65w48.R.inc(51);String temp = a[i];
        __CLR4_4_100ltz65w48.R.inc(52);a[i] = a[j];
        __CLR4_4_100ltz65w48.R.inc(53);a[j] = temp;
    }finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

    // is v less than w, starting at character d
    private static boolean less(String v, String w, int d) {try{__CLR4_4_100ltz65w48.R.inc(54);
        // assert v.substring(0, d).equals(w.substring(0, d));
        __CLR4_4_100ltz65w48.R.inc(55);for (int i = d; (((i < Math.min(v.length(), w.length()))&&(__CLR4_4_100ltz65w48.R.iget(56)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(57)==0&false)); i++) {{
            __CLR4_4_100ltz65w48.R.inc(58);if ((((v.charAt(i) < w.charAt(i))&&(__CLR4_4_100ltz65w48.R.iget(59)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(60)==0&false))) {__CLR4_4_100ltz65w48.R.inc(61);return true;
            }__CLR4_4_100ltz65w48.R.inc(62);if ((((v.charAt(i) > w.charAt(i))&&(__CLR4_4_100ltz65w48.R.iget(63)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(64)==0&false))) {__CLR4_4_100ltz65w48.R.inc(65);return false;
        }}
        }__CLR4_4_100ltz65w48.R.inc(66);return v.length() < w.length();
    }finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}


   /**
     * Rearranges the array of 32-bit integers in ascending order.
     * Currently assumes that the integers are nonnegative.
     *
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {try{__CLR4_4_100ltz65w48.R.inc(67);
        __CLR4_4_100ltz65w48.R.inc(68);int n = a.length;
        __CLR4_4_100ltz65w48.R.inc(69);int[] aux = new int[n];
        __CLR4_4_100ltz65w48.R.inc(70);sort(a, 0, n-1, 0, aux);
    }finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

    // MSD sort from a[lo] to a[hi], starting at the dth byte
    private static void sort(int[] a, int lo, int hi, int d, int[] aux) {try{__CLR4_4_100ltz65w48.R.inc(71);

        // cutoff to insertion sort for small subarrays
        __CLR4_4_100ltz65w48.R.inc(72);if ((((hi <= lo + CUTOFF)&&(__CLR4_4_100ltz65w48.R.iget(73)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(74)==0&false))) {{
            __CLR4_4_100ltz65w48.R.inc(75);insertion(a, lo, hi, d);
            __CLR4_4_100ltz65w48.R.inc(76);return;
        }

        // compute frequency counts (need R = 256)
        }__CLR4_4_100ltz65w48.R.inc(77);int[] count = new int[R+1];
        __CLR4_4_100ltz65w48.R.inc(78);int mask = R - 1;   // 0xFF;
        __CLR4_4_100ltz65w48.R.inc(79);int shift = BITS_PER_INT - BITS_PER_BYTE*d - BITS_PER_BYTE;
        __CLR4_4_100ltz65w48.R.inc(80);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(81)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(82)==0&false)); i++) {{
            __CLR4_4_100ltz65w48.R.inc(83);int c = (a[i] >> shift) & mask;
            __CLR4_4_100ltz65w48.R.inc(84);count[c + 1]++;
        }

        // transform counts to indicies
        }__CLR4_4_100ltz65w48.R.inc(85);for (int r = 0; (((r < R)&&(__CLR4_4_100ltz65w48.R.iget(86)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(87)==0&false)); r++)
            {__CLR4_4_100ltz65w48.R.inc(88);count[r+1] += count[r];

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
        }__CLR4_4_100ltz65w48.R.inc(89);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(90)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(91)==0&false)); i++) {{
            __CLR4_4_100ltz65w48.R.inc(92);int c = (a[i] >> shift) & mask;
            __CLR4_4_100ltz65w48.R.inc(93);aux[count[c]++] = a[i];
        }

        // copy back
        }__CLR4_4_100ltz65w48.R.inc(94);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(95)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(96)==0&false)); i++) 
            {__CLR4_4_100ltz65w48.R.inc(97);a[i] = aux[i - lo];

        // no more bits
        }__CLR4_4_100ltz65w48.R.inc(98);if ((((d == 4)&&(__CLR4_4_100ltz65w48.R.iget(99)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(100)==0&false))) {__CLR4_4_100ltz65w48.R.inc(101);return;

        // recursively sort for each character
        }__CLR4_4_100ltz65w48.R.inc(102);if ((((count[0] > 0)&&(__CLR4_4_100ltz65w48.R.iget(103)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(104)==0&false)))
            {__CLR4_4_100ltz65w48.R.inc(105);sort(a, lo, lo + count[0] - 1, d+1, aux);
        }__CLR4_4_100ltz65w48.R.inc(106);for (int r = 0; (((r < R)&&(__CLR4_4_100ltz65w48.R.iget(107)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(108)==0&false)); r++)
            {__CLR4_4_100ltz65w48.R.inc(109);if ((((count[r+1] > count[r])&&(__CLR4_4_100ltz65w48.R.iget(110)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(111)==0&false)))
                {__CLR4_4_100ltz65w48.R.inc(112);sort(a, lo + count[r], lo + count[r+1] - 1, d+1, aux);
    }}}finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

    // TODO: insertion sort a[lo..hi], starting at dth character
    private static void insertion(int[] a, int lo, int hi, int d) {try{__CLR4_4_100ltz65w48.R.inc(113);
        __CLR4_4_100ltz65w48.R.inc(114);for (int i = lo; (((i <= hi)&&(__CLR4_4_100ltz65w48.R.iget(115)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(116)==0&false)); i++)
            {__CLR4_4_100ltz65w48.R.inc(117);for (int j = i; (((j > lo && a[j] < a[j-1])&&(__CLR4_4_100ltz65w48.R.iget(118)!=0|true))||(__CLR4_4_100ltz65w48.R.iget(119)==0&false)); j--)
                {__CLR4_4_100ltz65w48.R.inc(120);exch(a, j, j-1);
    }}}finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {try{__CLR4_4_100ltz65w48.R.inc(121);
        __CLR4_4_100ltz65w48.R.inc(122);int temp = a[i];
        __CLR4_4_100ltz65w48.R.inc(123);a[i] = a[j];
        __CLR4_4_100ltz65w48.R.inc(124);a[j] = temp;
    }finally{__CLR4_4_100ltz65w48.R.flushNeeded();}}

}
