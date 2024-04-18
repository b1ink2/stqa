/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ShopTest {static class __CLR4_4_1f5f5luut6o4u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813921426L,8589935092L,558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(timeout=4000)
    public void test1() {__CLR4_4_1f5f5luut6o4u.R.globalSliceStart(getClass().getName(),545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beuf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1f5f5luut6o4u.R.rethrow($CLV_t2$);}finally{__CLR4_4_1f5f5luut6o4u.R.globalSliceEnd(getClass().getName(),"net.mooctest.ShopTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beuf5(){try{__CLR4_4_1f5f5luut6o4u.R.inc(545);
        __CLR4_4_1f5f5luut6o4u.R.inc(546);Shop shop =  new Shop();
        __CLR4_4_1f5f5luut6o4u.R.inc(547);shop.addProduct(new Product("water", 2, 5));
        __CLR4_4_1f5f5luut6o4u.R.inc(548);shop.addProduct(new Product("bread", 3, 10));
        __CLR4_4_1f5f5luut6o4u.R.inc(549);shop.addProduct(new Product("milk", 4, 15));

        __CLR4_4_1f5f5luut6o4u.R.inc(550);String info = shop.getAllProductsInfo();
        __CLR4_4_1f5f5luut6o4u.R.inc(551);System.out.println(info);

        __CLR4_4_1f5f5luut6o4u.R.inc(552);shop.deletProduct("milk");
        __CLR4_4_1f5f5luut6o4u.R.inc(553);shop.sellProduct("bread", 4);

        __CLR4_4_1f5f5luut6o4u.R.inc(554);shop.updateProduct("water", 3, 0.9);

        __CLR4_4_1f5f5luut6o4u.R.inc(555);try{
            __CLR4_4_1f5f5luut6o4u.R.inc(556);int indexOfWater = shop.searchProduct("apple");
        } catch (NullPointerException e) {

        }

        __CLR4_4_1f5f5luut6o4u.R.inc(557);Product bread = shop.getProductByName("bread");
    }finally{__CLR4_4_1f5f5luut6o4u.R.flushNeeded();}}
}
