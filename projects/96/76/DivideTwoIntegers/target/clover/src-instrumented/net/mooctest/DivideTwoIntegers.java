/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * \u6d93\u3086\u669f\u9429\u6401\u6ace
 * 
 * @author luca-zhao
 * 
 */


public class DivideTwoIntegers {public static class __CLR4_4_100ltz6at0x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0039\u0036\u005c\u005c\u0037\u0036\u005c\u005c\u0044\u0069\u0076\u0069\u0064\u0065\u0054\u0077\u006f\u0049\u006e\u0074\u0065\u0067\u0065\u0072\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1710901031486L,8589935092L,36,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public int divide(int dividend, int divisor) {try{__CLR4_4_100ltz6at0x.R.inc(0);
        __CLR4_4_100ltz6at0x.R.inc(1);boolean sign = (dividend > 0) ^ (divisor > 0);
        __CLR4_4_100ltz6at0x.R.inc(2);int result = 0;
        __CLR4_4_100ltz6at0x.R.inc(3);if((((dividend>0)&&(__CLR4_4_100ltz6at0x.R.iget(4)!=0|true))||(__CLR4_4_100ltz6at0x.R.iget(5)==0&false))) {{
            __CLR4_4_100ltz6at0x.R.inc(6);dividend = -dividend;
        }
        }__CLR4_4_100ltz6at0x.R.inc(7);if((((divisor>0)&&(__CLR4_4_100ltz6at0x.R.iget(8)!=0|true))||(__CLR4_4_100ltz6at0x.R.iget(9)==0&false))) {__CLR4_4_100ltz6at0x.R.inc(10);divisor = -divisor;
        }__CLR4_4_100ltz6at0x.R.inc(11);while((((dividend <= divisor)&&(__CLR4_4_100ltz6at0x.R.iget(12)!=0|true))||(__CLR4_4_100ltz6at0x.R.iget(13)==0&false))) {{
            __CLR4_4_100ltz6at0x.R.inc(14);int temp_result = -1;
            __CLR4_4_100ltz6at0x.R.inc(15);int temp_divisor = divisor;
            __CLR4_4_100ltz6at0x.R.inc(16);while((((dividend <= (temp_divisor << 1))&&(__CLR4_4_100ltz6at0x.R.iget(17)!=0|true))||(__CLR4_4_100ltz6at0x.R.iget(18)==0&false))) {{
                __CLR4_4_100ltz6at0x.R.inc(19);if((((temp_divisor <= (Integer.MIN_VALUE >> 1))&&(__CLR4_4_100ltz6at0x.R.iget(20)!=0|true))||(__CLR4_4_100ltz6at0x.R.iget(21)==0&false))){__CLR4_4_100ltz6at0x.R.inc(22);break;
                }__CLR4_4_100ltz6at0x.R.inc(23);temp_result = temp_result << 1;
                __CLR4_4_100ltz6at0x.R.inc(24);temp_divisor = temp_divisor << 1;
            }
            }__CLR4_4_100ltz6at0x.R.inc(25);dividend = dividend - temp_divisor;
            __CLR4_4_100ltz6at0x.R.inc(26);result += temp_result;
        }
        }__CLR4_4_100ltz6at0x.R.inc(27);if((((!sign)&&(__CLR4_4_100ltz6at0x.R.iget(28)!=0|true))||(__CLR4_4_100ltz6at0x.R.iget(29)==0&false))) {{
            __CLR4_4_100ltz6at0x.R.inc(30);if((((result <= Integer.MIN_VALUE)&&(__CLR4_4_100ltz6at0x.R.iget(31)!=0|true))||(__CLR4_4_100ltz6at0x.R.iget(32)==0&false))) {__CLR4_4_100ltz6at0x.R.inc(33);return Integer.MAX_VALUE;
            }__CLR4_4_100ltz6at0x.R.inc(34);result = - result;
        }
        }__CLR4_4_100ltz6at0x.R.inc(35);return result;
    }finally{__CLR4_4_100ltz6at0x.R.flushNeeded();}}

}
