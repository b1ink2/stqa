/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public class Work {public static class __CLR4_4_12828lut5akoh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0033\u005c\u005c\u0037\u0036\u005c\u005c\u0053\u0063\u0068\u0065\u0064\u0075\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712713326297L,8589935092L,106,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	/** \u6d63\u6ec0\u7b1f\u935a\ufffd*/
	private String name;
	/** \u6d63\u6ec0\u7b1f\u9352\u62cc\u63ea\u93c3\u5815\u68ff*/
	private int arrivalTime;
	/** \u6d63\u6ec0\u7b1f\u93c8\u5d85\u59df\u93c3\u5815\u68ff*/
	private int serviceTime;
	/** \u5bee\ufffd\u6fee\u5b2b\u58bd\u741b\u5c7e\u6902\u95c2\ufffd*/
	private int beginTime;
	/** \u7039\u5c7e\u579a\u93c3\u5815\u68ff*/
	private int endTime;
	/** \u6d63\u6ec0\u7b1f\u93c4\ue21a\u60c1\u748b\u51a8\u53c6\u7eef\u8364\u7cba*/
	private boolean in=false;
	/**
	 * \u6d63\u6ec0\u7b1f\u5bb8\u8336\u769f\u934f\ufffd
	 */
	public void setIn(){try{__CLR4_4_12828lut5akoh.R.inc(80);
		__CLR4_4_12828lut5akoh.R.inc(81);this.in=true;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u9352\u3086\u67c7\u6d63\u6ec0\u7b1f\u93c4\ue21a\u60c1\u5bb8\u8336\u769f\u934f\u30e7\u90f4\u7f01\ufffd
	 * @return
	 */
	public boolean isIn(){try{__CLR4_4_12828lut5akoh.R.inc(82);
		__CLR4_4_12828lut5akoh.R.inc(83);return this.in;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * Constructor
	 * @param name
	 * @param t1
	 * @param t2
	 */
	public Work(String name,int t1,int t2){try{__CLR4_4_12828lut5akoh.R.inc(84);
		__CLR4_4_12828lut5akoh.R.inc(85);this.name=name;
		__CLR4_4_12828lut5akoh.R.inc(86);this.arrivalTime=t1;
		__CLR4_4_12828lut5akoh.R.inc(87);this.serviceTime=t2;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u7481\u5267\u7586\u5bee\ufffd\u6fee\u5b2b\u58bd\u741b\u5c7e\u6902\u95c2\ufffd
	 * @param t
	 */
	public void setBeginTime(int t){try{__CLR4_4_12828lut5akoh.R.inc(88);
		__CLR4_4_12828lut5akoh.R.inc(89);this.beginTime=t;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u947e\u5cf0\u5f47\u5bee\ufffd\u6fee\u5b2b\u6902\u95c2\ufffd
	 * @return
	 */
	public int getBeginTime(){try{__CLR4_4_12828lut5akoh.R.inc(90);
		__CLR4_4_12828lut5akoh.R.inc(91);return this.beginTime;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u7481\u5267\u7586\u7039\u5c7e\u579a\u93c3\u5815\u68ff
	 * @param t
	 */
	public void setEndTime(int t){try{__CLR4_4_12828lut5akoh.R.inc(92);
		__CLR4_4_12828lut5akoh.R.inc(93);this.endTime=t;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u947e\u5cf0\u5f47\u7f01\u64b4\u6f6b\u93c3\u5815\u68ff
	 * @return
	 */
	public int getEndTime(){try{__CLR4_4_12828lut5akoh.R.inc(94);
		__CLR4_4_12828lut5akoh.R.inc(95);return this.endTime;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u7481\uff04\u757b\u9225\u6ec3\u61c6\u675e\ue101\u6902\u95c2\u7cb9\ufffd\ufffd=\u7039\u5c7e\u579a\u93c3\u5815\u68ff-\u9352\u62cc\u63ea\u93c3\u5815\u68ff
	 * @return int
	 */
	public int getCircleTime(){try{__CLR4_4_12828lut5akoh.R.inc(96);
		__CLR4_4_12828lut5akoh.R.inc(97);return this.endTime-this.arrivalTime;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u7481\uff04\u757b\u9225\u6ec3\u752b\u93c9\u51a8\u61c6\u675e\ue101\u6902\u95c2\u7cb9\ufffd\ufffd=\u935b\u3128\u6d46\u93c3\u5815\u68ff/\u93c8\u5d85\u59df\u93c3\u5815\u68ff
	 * @return
	 */
	public double getCircleWPTime(){try{__CLR4_4_12828lut5akoh.R.inc(98);
		
		
		__CLR4_4_12828lut5akoh.R.inc(99);return ((double)getCircleTime())/this.serviceTime;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u7481\uff04\u757b"\u935d\u5d85\u7c32\u59e3\ufffd"=\u951b\u5822\u74d1\u5bf0\u546e\u6902\u95c2\ufffd+\u7455\u4f79\u7730\u93c8\u5d85\u59df\u93c3\u5815\u68ff\u951b\ufffd/\u7455\u4f79\u7730\u93c8\u5d85\u59df\u93c3\u5815\u68ff=\u935d\u5d85\u7c32\u93c3\u5815\u68ff/\u7455\u4f79\u7730\u93c8\u5d85\u59df\u93c3\u5815\u68ff
	 * @return
	 */
	public int getPriority(){try{__CLR4_4_12828lut5akoh.R.inc(100);
		//TODO
		
		__CLR4_4_12828lut5akoh.R.inc(101);return 0;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 *\u947e\u5cf0\u5f47\u9352\u62cc\u63ea\u93c3\u5815\u68ff
	 * @return
	 */
	public int getArrivalTime(){try{__CLR4_4_12828lut5akoh.R.inc(102);
		__CLR4_4_12828lut5akoh.R.inc(103);return this.arrivalTime;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
	/**
	 * \u947e\u5cf0\u5f47\u93c8\u5d85\u59df\u93c3\u5815\u68ff
	 * @return
	 */
	public int getServiceTime(){try{__CLR4_4_12828lut5akoh.R.inc(104);
		__CLR4_4_12828lut5akoh.R.inc(105);return this.serviceTime;
	}finally{__CLR4_4_12828lut5akoh.R.flushNeeded();}}
}