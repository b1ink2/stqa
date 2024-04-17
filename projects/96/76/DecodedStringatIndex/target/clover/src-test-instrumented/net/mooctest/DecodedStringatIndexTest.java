/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import static org.junit.Assert.*;
import org.junit.Test;

public class DecodedStringatIndexTest {static class __CLR4_4_1yyltz6al7o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0039\u0036\u005c\u005c\u0037\u0036\u005c\u005c\u0044\u0065\u0063\u006f\u0064\u0065\u0064\u0053\u0074\u0072\u0069\u006e\u0067\u0061\u0074\u0049\u006e\u0064\u0065\u0078\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1710901021655L,8589935092L,75,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String result1 = decodeAtIndexOri("", 0);
    String result2 = decodeAtIndexOri("a1qwdsvr2", 10);
    String result3 = decodeAtIndexOri("a12", 2);
  @Test(timeout = 4000)
  public void test0() {__CLR4_4_1yyltz6al7o.R.globalSliceStart(getClass().getName(),34);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1156cmdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1yyltz6al7o.R.rethrow($CLV_t2$);}finally{__CLR4_4_1yyltz6al7o.R.globalSliceEnd(getClass().getName(),"net.mooctest.DecodedStringatIndexTest.test0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),34,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1156cmdy(){try{__CLR4_4_1yyltz6al7o.R.inc(34);

      __CLR4_4_1yyltz6al7o.R.inc(35);assertEquals(null,new DecodedStringatIndex().decodeAtIndex("0", 1));
      __CLR4_4_1yyltz6al7o.R.inc(36);assertEquals(result3,new DecodedStringatIndex().decodeAtIndex("a12", 2));
      __CLR4_4_1yyltz6al7o.R.inc(37);assertEquals(result2,new DecodedStringatIndex().decodeAtIndex("a1qwdsvr2", 10));
      __CLR4_4_1yyltz6al7o.R.inc(38);assertEquals(result1,new DecodedStringatIndex().decodeAtIndex("", 0));
      __CLR4_4_1yyltz6al7o.R.inc(39);assertEquals(null,new DecodedStringatIndex().decodeAtIndex("a1b", 98));
      __CLR4_4_1yyltz6al7o.R.inc(40);assertEquals("b",new DecodedStringatIndex().decodeAtIndex("a1b", 2));
  }finally{__CLR4_4_1yyltz6al7o.R.flushNeeded();}}
  
  public String decodeAtIndexOri(String S, int K) {try{__CLR4_4_1yyltz6al7o.R.inc(41);
      __CLR4_4_1yyltz6al7o.R.inc(42);char[] chs=S.toCharArray();
      __CLR4_4_1yyltz6al7o.R.inc(43);long size=0; 
      __CLR4_4_1yyltz6al7o.R.inc(44);for(char ch:chs){{
          __CLR4_4_1yyltz6al7o.R.inc(45);if((((Character.isDigit(ch))&&(__CLR4_4_1yyltz6al7o.R.iget(46)!=0|true))||(__CLR4_4_1yyltz6al7o.R.iget(47)==0&false))) {__CLR4_4_1yyltz6al7o.R.inc(48);size*=(int)(ch-'0');
          }else {__CLR4_4_1yyltz6al7o.R.inc(49);size++;
      }}
      }__CLR4_4_1yyltz6al7o.R.inc(50);if((((K>size)&&(__CLR4_4_1yyltz6al7o.R.iget(51)!=0|true))||(__CLR4_4_1yyltz6al7o.R.iget(52)==0&false))) {__CLR4_4_1yyltz6al7o.R.inc(53);return null;
      }__CLR4_4_1yyltz6al7o.R.inc(54);long sNo=size;
      __CLR4_4_1yyltz6al7o.R.inc(55);for(int ix=chs.length-1;(((ix>=0)&&(__CLR4_4_1yyltz6al7o.R.iget(56)!=0|true))||(__CLR4_4_1yyltz6al7o.R.iget(57)==0&false));ix--){{
          __CLR4_4_1yyltz6al7o.R.inc(58);char ch=chs[ix];
          __CLR4_4_1yyltz6al7o.R.inc(59);if((((K==0 && Character.isLetter(ch))&&(__CLR4_4_1yyltz6al7o.R.iget(60)!=0|true))||(__CLR4_4_1yyltz6al7o.R.iget(61)==0&false))) {__CLR4_4_1yyltz6al7o.R.inc(62);return String.valueOf(ch);
          }__CLR4_4_1yyltz6al7o.R.inc(63);if((((Character.isDigit(ch))&&(__CLR4_4_1yyltz6al7o.R.iget(64)!=0|true))||(__CLR4_4_1yyltz6al7o.R.iget(65)==0&false))){{
              __CLR4_4_1yyltz6al7o.R.inc(66);int dgt=(int)(ch-'0');
              __CLR4_4_1yyltz6al7o.R.inc(67);sNo=sNo/dgt; 
              __CLR4_4_1yyltz6al7o.R.inc(68);K%=sNo; 
          }}else {__CLR4_4_1yyltz6al7o.R.inc(69);if( (((K==sNo )&&(__CLR4_4_1yyltz6al7o.R.iget(70)!=0|true))||(__CLR4_4_1yyltz6al7o.R.iget(71)==0&false))){{
              __CLR4_4_1yyltz6al7o.R.inc(72);return String.valueOf(ch);
          }}else{{
              __CLR4_4_1yyltz6al7o.R.inc(73);sNo--;
          }
      }}}
      }__CLR4_4_1yyltz6al7o.R.inc(74);return null;
    }finally{__CLR4_4_1yyltz6al7o.R.flushNeeded();}}

}