/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

public class ACOTest {static class __CLR4_4_16f6flugpgw9s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0031\u005c\u005c\u0037\u0036\u005c\u005c\u0041\u0043\u004f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711961153626L,8589935092L,249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(timeout = 4000)
  public void test(){__CLR4_4_16f6flugpgw9s.R.globalSliceStart(getClass().getName(),231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt36f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6flugpgw9s.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6flugpgw9s.R.globalSliceEnd(getClass().getName(),"net.mooctest.ACOTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt36f(){try{__CLR4_4_16f6flugpgw9s.R.inc(231);
      __CLR4_4_16f6flugpgw9s.R.inc(232);ArrayList<String[]> arrayList0 = new ArrayList<String[]>();
      __CLR4_4_16f6flugpgw9s.R.inc(233);ACO aCO0 = new ACO(arrayList0, 0, 0, 0.0, 0, 0);
      
      __CLR4_4_16f6flugpgw9s.R.inc(234);ArrayList<String[]> arrayList1 = new ArrayList<String[]>();
      __CLR4_4_16f6flugpgw9s.R.inc(235);arrayList1.add(new String[]{"#"});
      __CLR4_4_16f6flugpgw9s.R.inc(236);arrayList1.add(new String[]{"1"});
      __CLR4_4_16f6flugpgw9s.R.inc(237);arrayList1.add(new String[]{"2"});
      __CLR4_4_16f6flugpgw9s.R.inc(238);arrayList1.add(new String[]{"3"});
      __CLR4_4_16f6flugpgw9s.R.inc(239);arrayList1.add(new String[]{"4"});
      __CLR4_4_16f6flugpgw9s.R.inc(240);arrayList1.add(new String[]{"#"});
      __CLR4_4_16f6flugpgw9s.R.inc(241);arrayList1.add(new String[]{"1", "4", "1.0"});
      __CLR4_4_16f6flugpgw9s.R.inc(242);arrayList1.add(new String[]{"1", "2", "10.0"});
      __CLR4_4_16f6flugpgw9s.R.inc(243);arrayList1.add(new String[]{"1", "3", "100.0"});
      __CLR4_4_16f6flugpgw9s.R.inc(244);arrayList1.add(new String[]{"2", "4", "2.0"});
      __CLR4_4_16f6flugpgw9s.R.inc(245);arrayList1.add(new String[]{"2", "3", "20.0"});
      __CLR4_4_16f6flugpgw9s.R.inc(246);arrayList1.add(new String[]{"3", "4", "200.0"});
      __CLR4_4_16f6flugpgw9s.R.inc(247);ACO aCO1 = new ACO(arrayList1, 20, 1, 2, 1, 2);
      
      __CLR4_4_16f6flugpgw9s.R.inc(248);aCO1.antStartSearching(3);
      
  }finally{__CLR4_4_16f6flugpgw9s.R.flushNeeded();}}

}