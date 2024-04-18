/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class MSDTest {static class __CLR4_4_13h3hltz65w7l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0039\u0039\u005c\u005c\u0037\u0036\u005c\u005c\u004d\u0053\u0044\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1710900802616L,8589935092L,147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() {__CLR4_4_13h3hltz65w7l.R.globalSliceStart(getClass().getName(),125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt33h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13h3hltz65w7l.R.rethrow($CLV_t2$);}finally{__CLR4_4_13h3hltz65w7l.R.globalSliceEnd(getClass().getName(),"net.mooctest.MSDTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt33h(){try{__CLR4_4_13h3hltz65w7l.R.inc(125);
		__CLR4_4_13h3hltz65w7l.R.inc(126);String[] a = {};
        __CLR4_4_13h3hltz65w7l.R.inc(127);String[] a1 = {"j1","2","a","2","d"};
        __CLR4_4_13h3hltz65w7l.R.inc(128);int[] a2 = {};
        __CLR4_4_13h3hltz65w7l.R.inc(129);int[] a3 = {0,2523,5623,-3223,-423,-523,-523,-523,-523,-523};
        __CLR4_4_13h3hltz65w7l.R.inc(130);String[] a4 = {"-19","-4","-32","-1","-26","59","-14","-2","-17","-216","12","b","k","G","rr","op0","-.kt"};
        __CLR4_4_13h3hltz65w7l.R.inc(131);int[] a5 = {1,52,65234,-1,0,659234,-53,7,5214,-5,-68,45,5213,13,22,16,5,4,17};
        __CLR4_4_13h3hltz65w7l.R.inc(132);String[] a6 = {"-4","-32","-1","-26","59","-14","-2","-216","12","b","k","G","rr","op0","-.kt"};
        
        
        __CLR4_4_13h3hltz65w7l.R.inc(133);MSD.sort(a);
        __CLR4_4_13h3hltz65w7l.R.inc(134);MSD.sort(a1);
        __CLR4_4_13h3hltz65w7l.R.inc(135);MSD.sort(a2);
        __CLR4_4_13h3hltz65w7l.R.inc(136);MSD.sort(a3);
        __CLR4_4_13h3hltz65w7l.R.inc(137);MSD.sort(a4);
        __CLR4_4_13h3hltz65w7l.R.inc(138);MSD.sort(a5);
        __CLR4_4_13h3hltz65w7l.R.inc(139);MSD.sort(a6);

    
        
        __CLR4_4_13h3hltz65w7l.R.inc(140);assertArrayEquals(new String[] {},a);
        __CLR4_4_13h3hltz65w7l.R.inc(141);assertArrayEquals(new String[] {"2","2","a","d","j1"},a1);
        __CLR4_4_13h3hltz65w7l.R.inc(142);assertArrayEquals(new int[] {},a2);
        __CLR4_4_13h3hltz65w7l.R.inc(143);assertArrayEquals(new int[] {-3223,-523,-523,-523,-523,-523,-423,0,2523,5623},a3);
        __CLR4_4_13h3hltz65w7l.R.inc(144);assertArrayEquals(new String[] {"-.kt","-1","-14","-17","-19","-2","-216","-26","-32","-4","12","59","G","b","k","op0","rr"},a4);
        __CLR4_4_13h3hltz65w7l.R.inc(145);assertArrayEquals(new int[] {0,1,4,5,7,13,16,17,22,45,52,5213,5214,65234,659234,-68,-53,-5,-1}, a5);
        __CLR4_4_13h3hltz65w7l.R.inc(146);assertArrayEquals(new String[] {"-.kt","-1","-14","-2","-216","-26","-32","-4","12","59","G","b","k","op0","rr"},a6);
    }finally{__CLR4_4_13h3hltz65w7l.R.flushNeeded();}}
}