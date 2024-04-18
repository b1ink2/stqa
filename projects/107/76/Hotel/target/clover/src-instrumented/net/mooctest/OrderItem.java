/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class OrderItem {public static class __CLR4_4_17c7cluut6nyy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String productName;//\u935f\u55d7\u6427\u935a\u5d87\u041e
    private double paymentPrice;//\u935f\u55d7\u6427\u9357\u66da\u73af*disconunt
    private int count;

    public OrderItem(String name, double paymentPrice, int count){try{__CLR4_4_17c7cluut6nyy.R.inc(264);
        __CLR4_4_17c7cluut6nyy.R.inc(265);this.productName = name;
        __CLR4_4_17c7cluut6nyy.R.inc(266);this.count = count;
        __CLR4_4_17c7cluut6nyy.R.inc(267);this.paymentPrice = paymentPrice;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public String PrintOrderItem(){try{__CLR4_4_17c7cluut6nyy.R.inc(268);
        __CLR4_4_17c7cluut6nyy.R.inc(269);return productName + "\t"
                + formatDouble(paymentPrice) + "\t"
                + count + "\t"
                + formatDouble(paymentPrice*count);
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public String getProductName() {try{__CLR4_4_17c7cluut6nyy.R.inc(270);
        __CLR4_4_17c7cluut6nyy.R.inc(271);return productName;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public double getPaymentPrice() {try{__CLR4_4_17c7cluut6nyy.R.inc(272);
        __CLR4_4_17c7cluut6nyy.R.inc(273);return paymentPrice;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public int getCount() {try{__CLR4_4_17c7cluut6nyy.R.inc(274);
        __CLR4_4_17c7cluut6nyy.R.inc(275);return count;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public void setProductName(String productName) {try{__CLR4_4_17c7cluut6nyy.R.inc(276);
        __CLR4_4_17c7cluut6nyy.R.inc(277);this.productName = productName;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public void setPaymentPrice(double paymentPrice) {try{__CLR4_4_17c7cluut6nyy.R.inc(278);
        __CLR4_4_17c7cluut6nyy.R.inc(279);this.paymentPrice = paymentPrice;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public void setCount(int count) {try{__CLR4_4_17c7cluut6nyy.R.inc(280);
        __CLR4_4_17c7cluut6nyy.R.inc(281);this.count = count;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}

    public double getAmount(){try{__CLR4_4_17c7cluut6nyy.R.inc(282);
        __CLR4_4_17c7cluut6nyy.R.inc(283);return paymentPrice*count;
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}
    
    public static String formatDouble(double d) {try{__CLR4_4_17c7cluut6nyy.R.inc(284);
        __CLR4_4_17c7cluut6nyy.R.inc(285);DecimalFormat df = new DecimalFormat("#.00");
        __CLR4_4_17c7cluut6nyy.R.inc(286);df.setRoundingMode(RoundingMode.DOWN);
        __CLR4_4_17c7cluut6nyy.R.inc(287);return df.format(d);
        
    }finally{__CLR4_4_17c7cluut6nyy.R.flushNeeded();}}
}
