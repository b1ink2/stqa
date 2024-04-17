/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * \u7ef1\u3220\u7d29\u6fb6\u52ed\u6b91\u7459\uff47\u721c\u701b\u6943\ue0c1\u6d93\ufffd
 * 
 * @author brianlin
 * 
 */
public class DecodedStringatIndex {public static class __CLR4_4_100ltz6al5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0039\u0036\u005c\u005c\u0037\u0036\u005c\u005c\u0044\u0065\u0063\u006f\u0064\u0065\u0064\u0053\u0074\u0072\u0069\u006e\u0067\u0061\u0074\u0049\u006e\u0064\u0065\u0078\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1710901021268L,8589935092L,34,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public String decodeAtIndex(String S, int K) {try{__CLR4_4_100ltz6al5i.R.inc(0);
        __CLR4_4_100ltz6al5i.R.inc(1);char[] chs=S.toCharArray();
        __CLR4_4_100ltz6al5i.R.inc(2);long size=0; 
        __CLR4_4_100ltz6al5i.R.inc(3);for(char ch:chs){{
            __CLR4_4_100ltz6al5i.R.inc(4);if((((Character.isDigit(ch))&&(__CLR4_4_100ltz6al5i.R.iget(5)!=0|true))||(__CLR4_4_100ltz6al5i.R.iget(6)==0&false))) {__CLR4_4_100ltz6al5i.R.inc(7);size*=(int)(ch-'0');
            }else {__CLR4_4_100ltz6al5i.R.inc(8);size++;
        }}
        }__CLR4_4_100ltz6al5i.R.inc(9);if((((K>size)&&(__CLR4_4_100ltz6al5i.R.iget(10)!=0|true))||(__CLR4_4_100ltz6al5i.R.iget(11)==0&false))) {__CLR4_4_100ltz6al5i.R.inc(12);return null;
        }__CLR4_4_100ltz6al5i.R.inc(13);long sNo=size;
        __CLR4_4_100ltz6al5i.R.inc(14);for(int ix=chs.length-1;(((ix>=0)&&(__CLR4_4_100ltz6al5i.R.iget(15)!=0|true))||(__CLR4_4_100ltz6al5i.R.iget(16)==0&false));ix--){{
            __CLR4_4_100ltz6al5i.R.inc(17);char ch=chs[ix];
            __CLR4_4_100ltz6al5i.R.inc(18);if((((K==0 && Character.isLetter(ch))&&(__CLR4_4_100ltz6al5i.R.iget(19)!=0|true))||(__CLR4_4_100ltz6al5i.R.iget(20)==0&false))) {__CLR4_4_100ltz6al5i.R.inc(21);return String.valueOf(ch);
            }__CLR4_4_100ltz6al5i.R.inc(22);if((((Character.isDigit(ch))&&(__CLR4_4_100ltz6al5i.R.iget(23)!=0|true))||(__CLR4_4_100ltz6al5i.R.iget(24)==0&false))){{
                __CLR4_4_100ltz6al5i.R.inc(25);int dgt=(int)(ch-'0');
                __CLR4_4_100ltz6al5i.R.inc(26);sNo=sNo/dgt; 
                __CLR4_4_100ltz6al5i.R.inc(27);K%=sNo; 
            }}else {__CLR4_4_100ltz6al5i.R.inc(28);if( (((K==sNo )&&(__CLR4_4_100ltz6al5i.R.iget(29)!=0|true))||(__CLR4_4_100ltz6al5i.R.iget(30)==0&false))){{
                __CLR4_4_100ltz6al5i.R.inc(31);return String.valueOf(ch);
            }}else{{
                __CLR4_4_100ltz6al5i.R.inc(32);sNo--;
            }
        }}}
        }__CLR4_4_100ltz6al5i.R.inc(33);return null;
	}finally{__CLR4_4_100ltz6al5i.R.flushNeeded();}}
}
