/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ScheduleTest {static class __CLR4_4_12y2ylut5akqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0033\u005c\u005c\u0037\u0036\u005c\u005c\u0053\u0063\u0068\u0065\u0064\u0075\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712713326697L,8589935092L,123,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test() {__CLR4_4_12y2ylut5akqf.R.globalSliceStart(getClass().getName(),106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt32y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12y2ylut5akqf.R.rethrow($CLV_t2$);}finally{__CLR4_4_12y2ylut5akqf.R.globalSliceEnd(getClass().getName(),"net.mooctest.ScheduleTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt32y(){try{__CLR4_4_12y2ylut5akqf.R.inc(106);
        __CLR4_4_12y2ylut5akqf.R.inc(107);Schedule schedule = new Schedule();
        
        __CLR4_4_12y2ylut5akqf.R.inc(108);List<Work> works0 = Arrays.asList(); //\u7ecc\u8f70\u7d94\u6d93\ufffd
        
        __CLR4_4_12y2ylut5akqf.R.inc(109);List<Work> works = Arrays.asList( 
            new Work("A", 0, 7),
            new Work("B", 1, 5),
            new Work("C", 2, 3)
            );

        __CLR4_4_12y2ylut5akqf.R.inc(110);List<Work> works1 = Arrays.asList( 
            new Work("A", 0, 7),
            new Work("B", 0, 5),
            new Work("C", 0, 3)
            );
        
        __CLR4_4_12y2ylut5akqf.R.inc(111);List<Work> works2 = Arrays.asList( //
            new Work("A", -1, -7)
            );
        
        __CLR4_4_12y2ylut5akqf.R.inc(112);List<Double> results0 = schedule.FCFS(works0);
        
        __CLR4_4_12y2ylut5akqf.R.inc(113);List<Double> results = schedule.FCFS(works); //FCFS
       
        __CLR4_4_12y2ylut5akqf.R.inc(114);List<Double> results1 = schedule.SJF(works); 
        
        __CLR4_4_12y2ylut5akqf.R.inc(115);List<Double> results2 = schedule.SJF(works1); //SJF\u951b\u5c7d\u6093\u93c3\u8dfa\u57cc\u6748\ufffd
        
        __CLR4_4_12y2ylut5akqf.R.inc(116);List<Double> results3 = schedule.SJF(works2);
               
        __CLR4_4_12y2ylut5akqf.R.inc(117);assertEquals(10.33, results.get(0), 0.01); // \u9a9e\u51b2\u6f4e\u935b\u3128\u6d46\u93c3\u5815\u68ff
        __CLR4_4_12y2ylut5akqf.R.inc(118);assertEquals(2.51, results.get(1), 0.01); // \u9a9e\u51b2\u6f4e\u752f\ufe3d\u6f48\u935b\u3128\u6d46\u93c3\u5815\u68ff
        
        __CLR4_4_12y2ylut5akqf.R.inc(119);assertEquals(9.67, results1.get(0), 0.01); // \u9a9e\u51b2\u6f4e\u935b\u3128\u6d46\u93c3\u5815\u68ff
        __CLR4_4_12y2ylut5akqf.R.inc(120);assertEquals(2.16, results1.get(1), 0.01); // \u9a9e\u51b2\u6f4e\u752f\ufe3d\u6f48\u935b\u3128\u6d46\u93c3\u5815\u68ff
        
        __CLR4_4_12y2ylut5akqf.R.inc(121);assertEquals(8.67, results2.get(0), 0.01); // \u9a9e\u51b2\u6f4e\u935b\u3128\u6d46\u93c3\u5815\u68ff
        __CLR4_4_12y2ylut5akqf.R.inc(122);assertEquals(1.58, results2.get(1), 0.01); // \u9a9e\u51b2\u6f4e\u752f\ufe3d\u6f48\u935b\u3128\u6d46\u93c3\u5815\u68ff
        
    }finally{__CLR4_4_12y2ylut5akqf.R.flushNeeded();}}

}