/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CoinChangeTest {static class __CLR4_4_1iiltz65o44{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0039\u0039\u005c\u005c\u0037\u0036\u005c\u005c\u0043\u006f\u0069\u006e\u0043\u0068\u0061\u006e\u0067\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1710900792132L,8589935092L,40,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	public int coinChangeOri(int[] coins, int amount) {try{__CLR4_4_1iiltz65o44.R.inc(18);
	    __CLR4_4_1iiltz65o44.R.inc(19);int max = amount + 1;
	    __CLR4_4_1iiltz65o44.R.inc(20);int[] dp = new int[amount + 1];
	    __CLR4_4_1iiltz65o44.R.inc(21);Arrays.fill(dp, max);
	    __CLR4_4_1iiltz65o44.R.inc(22);dp[0] = 0;
	    __CLR4_4_1iiltz65o44.R.inc(23);for (int i = 1; (((i <= amount)&&(__CLR4_4_1iiltz65o44.R.iget(24)!=0|true))||(__CLR4_4_1iiltz65o44.R.iget(25)==0&false)); i++) {{
	      __CLR4_4_1iiltz65o44.R.inc(26);for (int j = 0; (((j < coins.length)&&(__CLR4_4_1iiltz65o44.R.iget(27)!=0|true))||(__CLR4_4_1iiltz65o44.R.iget(28)==0&false)); j++) {{
	        __CLR4_4_1iiltz65o44.R.inc(29);if ((((coins[j] <= i)&&(__CLR4_4_1iiltz65o44.R.iget(30)!=0|true))||(__CLR4_4_1iiltz65o44.R.iget(31)==0&false))) {{
	          __CLR4_4_1iiltz65o44.R.inc(32);dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
	        }
	      }}
	    }}
	    }__CLR4_4_1iiltz65o44.R.inc(33);return (((dp[amount] > amount )&&(__CLR4_4_1iiltz65o44.R.iget(34)!=0|true))||(__CLR4_4_1iiltz65o44.R.iget(35)==0&false))? -1 : dp[amount];
	  }finally{__CLR4_4_1iiltz65o44.R.flushNeeded();}}

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {__CLR4_4_1iiltz65o44.R.globalSliceStart(getClass().getName(),36);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1156cmd10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1iiltz65o44.R.rethrow($CLV_t2$);}finally{__CLR4_4_1iiltz65o44.R.globalSliceEnd(getClass().getName(),"net.mooctest.CoinChangeTest.test0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),36,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1156cmd10() throws Throwable{try{__CLR4_4_1iiltz65o44.R.inc(36);
      __CLR4_4_1iiltz65o44.R.inc(37);assertEquals(coinChangeOri(new int[]{1,2,3},0), new CoinChange().coinChange(new int[]{1,2,3},0));
      __CLR4_4_1iiltz65o44.R.inc(38);assertEquals(coinChangeOri(new int[]{},3), new CoinChange().coinChange(new int[]{},3));
      __CLR4_4_1iiltz65o44.R.inc(39);assertEquals(coinChangeOri(new int[]{1,1,1},3), new CoinChange().coinChange(new int[]{1,1,1},3));
      
  }finally{__CLR4_4_1iiltz65o44.R.flushNeeded();}}

}
