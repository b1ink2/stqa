/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingTest {static class __CLR4_4_12727lugph480{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0031\u005c\u005c\u0037\u0036\u005c\u005c\u0053\u006f\u0072\u0074\u0069\u006e\u0067\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711961163927L,8589935092L,98,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test(timeout=4000)
	public void test() {__CLR4_4_12727lugph480.R.globalSliceStart(getClass().getName(),79);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt327();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12727lugph480.R.rethrow($CLV_t2$);}finally{__CLR4_4_12727lugph480.R.globalSliceEnd(getClass().getName(),"net.mooctest.SortingTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),79,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt327(){try{__CLR4_4_12727lugph480.R.inc(79);
		__CLR4_4_12727lugph480.R.inc(80);Sorting sort = new Sorting();
		
		__CLR4_4_12727lugph480.R.inc(81);int[] a = {3, 2, 0, 1};
		__CLR4_4_12727lugph480.R.inc(82);int[] b = {0, 1, 2, 3};
		__CLR4_4_12727lugph480.R.inc(83);int[] d = {1, 1, 1, 1};
		
		__CLR4_4_12727lugph480.R.inc(84);assertEquals(sort.isSorted(a), false);
		__CLR4_4_12727lugph480.R.inc(85);assertEquals(sort.isSorted(b), true);
		__CLR4_4_12727lugph480.R.inc(86);assertEquals(sort.isSorted(d), true);
		
		__CLR4_4_12727lugph480.R.inc(87);sort.insertionSort(a);
		__CLR4_4_12727lugph480.R.inc(88);assertArrayEquals(a, new int[] {0, 1, 2, 3});
		
		__CLR4_4_12727lugph480.R.inc(89);b = new int[]{2, 3, 1, 0};
		__CLR4_4_12727lugph480.R.inc(90);Sorting.quicksort(b);
		__CLR4_4_12727lugph480.R.inc(91);assertArrayEquals(b, new int[] {0, 1, 2, 3});
		
		__CLR4_4_12727lugph480.R.inc(92);a = new int[]{20, 18, 10, 9, 8, 17, 16, 19, 12, 11, 7, 15, 14, 13, 6, 5, 4, 3, -2, -1};
		__CLR4_4_12727lugph480.R.inc(93);Sorting.quicksort(a);
		__CLR4_4_12727lugph480.R.inc(94);assertArrayEquals(a, new int[]{-2, -1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
		
		
		__CLR4_4_12727lugph480.R.inc(95);Object[] c = {0, 1, 2, 3};
		__CLR4_4_12727lugph480.R.inc(96);Sorting.swapReferences(c, 0, 3);
		__CLR4_4_12727lugph480.R.inc(97);assertArrayEquals(c, new Object[] {3,1,2,0});
	}finally{__CLR4_4_12727lugph480.R.flushNeeded();}}
}
