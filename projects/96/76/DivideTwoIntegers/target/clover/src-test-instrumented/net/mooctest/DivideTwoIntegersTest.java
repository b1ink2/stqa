/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;
import org.junit.Test;


public class DivideTwoIntegersTest {static class __CLR4_4_11010ltz6at35{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0039\u0036\u005c\u005c\u0037\u0036\u005c\u005c\u0044\u0069\u0076\u0069\u0064\u0065\u0054\u0077\u006f\u0049\u006e\u0074\u0065\u0067\u0065\u0072\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1710901031862L,8589935092L,79,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  @Test
  public void test() {__CLR4_4_11010ltz6at35.R.globalSliceStart(getClass().getName(),36);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt310();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11010ltz6at35.R.rethrow($CLV_t2$);}finally{__CLR4_4_11010ltz6at35.R.globalSliceEnd(getClass().getName(),"net.mooctest.DivideTwoIntegersTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt310(){try{__CLR4_4_11010ltz6at35.R.inc(36);
      __CLR4_4_11010ltz6at35.R.inc(37);assertEquals(divideOri(0,1),new DivideTwoIntegers().divide(0, 1));
      __CLR4_4_11010ltz6at35.R.inc(38);assertEquals(divideOri(0,-1),new DivideTwoIntegers().divide(0, -1));
      __CLR4_4_11010ltz6at35.R.inc(39);assertEquals(divideOri(10,3),new DivideTwoIntegers().divide(10, 3));
      __CLR4_4_11010ltz6at35.R.inc(40);assertEquals(divideOri(15,-3),new DivideTwoIntegers().divide(15, -3));
      __CLR4_4_11010ltz6at35.R.inc(41);assertEquals(divideOri(-7,2),new DivideTwoIntegers().divide(-7, 2));
      __CLR4_4_11010ltz6at35.R.inc(42);assertEquals(divideOri(Integer.MIN_VALUE,-1),new DivideTwoIntegers().divide(Integer.MIN_VALUE, -1));
  }finally{__CLR4_4_11010ltz6at35.R.flushNeeded();}}

  public int divideOri(int dividend, int divisor) {try{__CLR4_4_11010ltz6at35.R.inc(43);
      __CLR4_4_11010ltz6at35.R.inc(44);boolean sign = (dividend > 0) ^ (divisor > 0);
      __CLR4_4_11010ltz6at35.R.inc(45);int result = 0;
      __CLR4_4_11010ltz6at35.R.inc(46);if((((dividend>0)&&(__CLR4_4_11010ltz6at35.R.iget(47)!=0|true))||(__CLR4_4_11010ltz6at35.R.iget(48)==0&false))) {{
          __CLR4_4_11010ltz6at35.R.inc(49);dividend = -dividend;
      }
      }__CLR4_4_11010ltz6at35.R.inc(50);if((((divisor>0)&&(__CLR4_4_11010ltz6at35.R.iget(51)!=0|true))||(__CLR4_4_11010ltz6at35.R.iget(52)==0&false))) {__CLR4_4_11010ltz6at35.R.inc(53);divisor = -divisor;
      }__CLR4_4_11010ltz6at35.R.inc(54);while((((dividend <= divisor)&&(__CLR4_4_11010ltz6at35.R.iget(55)!=0|true))||(__CLR4_4_11010ltz6at35.R.iget(56)==0&false))) {{
          __CLR4_4_11010ltz6at35.R.inc(57);int temp_result = -1;
          __CLR4_4_11010ltz6at35.R.inc(58);int temp_divisor = divisor;
          __CLR4_4_11010ltz6at35.R.inc(59);while((((dividend <= (temp_divisor << 1))&&(__CLR4_4_11010ltz6at35.R.iget(60)!=0|true))||(__CLR4_4_11010ltz6at35.R.iget(61)==0&false))) {{
              __CLR4_4_11010ltz6at35.R.inc(62);if((((temp_divisor <= (Integer.MIN_VALUE >> 1))&&(__CLR4_4_11010ltz6at35.R.iget(63)!=0|true))||(__CLR4_4_11010ltz6at35.R.iget(64)==0&false))){__CLR4_4_11010ltz6at35.R.inc(65);break;
              }__CLR4_4_11010ltz6at35.R.inc(66);temp_result = temp_result << 1;
              __CLR4_4_11010ltz6at35.R.inc(67);temp_divisor = temp_divisor << 1;
          }
          }__CLR4_4_11010ltz6at35.R.inc(68);dividend = dividend - temp_divisor;
          __CLR4_4_11010ltz6at35.R.inc(69);result += temp_result;
      }
      }__CLR4_4_11010ltz6at35.R.inc(70);if((((!sign)&&(__CLR4_4_11010ltz6at35.R.iget(71)!=0|true))||(__CLR4_4_11010ltz6at35.R.iget(72)==0&false))) {{
          __CLR4_4_11010ltz6at35.R.inc(73);if((((result <= Integer.MIN_VALUE)&&(__CLR4_4_11010ltz6at35.R.iget(74)!=0|true))||(__CLR4_4_11010ltz6at35.R.iget(75)==0&false))) {__CLR4_4_11010ltz6at35.R.inc(76);return Integer.MAX_VALUE;
          }__CLR4_4_11010ltz6at35.R.inc(77);result = - result;
      }
      }__CLR4_4_11010ltz6at35.R.inc(78);return result;
  }finally{__CLR4_4_11010ltz6at35.R.flushNeeded();}}
}
