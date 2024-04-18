/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.List;

public class Schedule {public static class __CLR4_4_100lut5aknk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0033\u005c\u005c\u0037\u0036\u005c\u005c\u0053\u0063\u0068\u0065\u0064\u0075\u006c\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712713326297L,8589935092L,80,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public List<Double> FCFS(List<Work> works) {try{__CLR4_4_100lut5aknk.R.inc(0);
		__CLR4_4_100lut5aknk.R.inc(1);double avgCircleTime = 0;
		__CLR4_4_100lut5aknk.R.inc(2);double avgCircleTimeWP = 0;
		__CLR4_4_100lut5aknk.R.inc(3);List<Double> lst = new ArrayList<Double>();
		__CLR4_4_100lut5aknk.R.inc(4);for (int i = 0; (((i < works.size())&&(__CLR4_4_100lut5aknk.R.iget(5)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(6)==0&false)); i++) {{
			// works.get(i).getArrivalTime();
			// works.get(i).getServiceTime();
			__CLR4_4_100lut5aknk.R.inc(7);if ((((i != 0)&&(__CLR4_4_100lut5aknk.R.iget(8)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(9)==0&false))) {{
				__CLR4_4_100lut5aknk.R.inc(10);works.get(i).setBeginTime(works.get(i - 1).getEndTime());
			} }else {{
				__CLR4_4_100lut5aknk.R.inc(11);works.get(i).setBeginTime(works.get(i).getArrivalTime());
			}
			}__CLR4_4_100lut5aknk.R.inc(12);works.get(i)
					.setEndTime(
							works.get(i).getBeginTime()
									+ works.get(i).getServiceTime());
			__CLR4_4_100lut5aknk.R.inc(13);avgCircleTime += works.get(i).getCircleTime();
			__CLR4_4_100lut5aknk.R.inc(14);avgCircleTimeWP += works.get(i).getCircleWPTime();
		}
		}__CLR4_4_100lut5aknk.R.inc(15);avgCircleTime /= works.size();
		__CLR4_4_100lut5aknk.R.inc(16);avgCircleTimeWP /= works.size();
		__CLR4_4_100lut5aknk.R.inc(17);lst.add(avgCircleTime);
		__CLR4_4_100lut5aknk.R.inc(18);lst.add(avgCircleTimeWP);
		__CLR4_4_100lut5aknk.R.inc(19);return lst;
	}finally{__CLR4_4_100lut5aknk.R.flushNeeded();}}

	/**
	 * \u93c0\u7470\u6097\u9428\u52ed\u716d\u6d63\u6ec0\u7b1f\u6d7c\u6a3a\u539b\u748b\u51a8\u5bb3\u7ee0\u6941\u7876
	 * 
	 * @param works
	 * @return
	 */
	public List<Double> SJF(List<Work> works) {try{__CLR4_4_100lut5aknk.R.inc(20);
		__CLR4_4_100lut5aknk.R.inc(21);List<Double> lst = new ArrayList<Double>();
		__CLR4_4_100lut5aknk.R.inc(22);double avgCircleTime = 0;
		__CLR4_4_100lut5aknk.R.inc(23);double avgCircleTimeWP = 0;
		__CLR4_4_100lut5aknk.R.inc(24);List<Work> ins = new ArrayList<Work>();
		__CLR4_4_100lut5aknk.R.inc(25);int i = 0;
		__CLR4_4_100lut5aknk.R.inc(26);int counter = 0; // \u5bb8\u63d2\u756c\u93b4\u612a\u7d94\u6d93\u6c31\u6b91\u7481\u2103\u669f\u9363\ufffd
		// \u9352\u3086\u67c7\u93c4\ue21a\u60c1\u5bb8\u832c\u7ca1\u93b6\u5a43\u588d\u93c8\u590c\u6b91\u6d63\u6ec0\u7b1f\u95ae\u85c9\ue629\u941e\u55d7\u756c\u59e3\ufffd
		__CLR4_4_100lut5aknk.R.inc(27);while ((((counter < works.size())&&(__CLR4_4_100lut5aknk.R.iget(28)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(29)==0&false))) {{
			// \u93b5\u60e7\u57cc\u93b5\ufffd\u93c8\u590b\u6e6d\u93b5\u0446\ue511\u951b\u5c7c\u7b16\u9352\u62cc\u63ea\u93c3\u5815\u68ff\u704f\u5fce\u7c2ci\u9428\u52ea\u7d94\u6d93\ufffd
			__CLR4_4_100lut5aknk.R.inc(30);for (int j = 0; (((j < works.size())&&(__CLR4_4_100lut5aknk.R.iget(31)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(32)==0&false)); j++) {{
				__CLR4_4_100lut5aknk.R.inc(33);if ((((works.get(j).isIn())&&(__CLR4_4_100lut5aknk.R.iget(34)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(35)==0&false)))
					{__CLR4_4_100lut5aknk.R.inc(36);continue;
				}__CLR4_4_100lut5aknk.R.inc(37);if ((((works.get(j).getArrivalTime() <= i)&&(__CLR4_4_100lut5aknk.R.iget(38)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(39)==0&false))) {{
					__CLR4_4_100lut5aknk.R.inc(40);ins.add(works.get(j));
				}
			}}
			}__CLR4_4_100lut5aknk.R.inc(41);if ((((ins.isEmpty())&&(__CLR4_4_100lut5aknk.R.iget(42)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(43)==0&false))) {{
				__CLR4_4_100lut5aknk.R.inc(44);i++;
			} }else {{
				__CLR4_4_100lut5aknk.R.inc(45);ins = sortByServiceTime(ins);
				// \u704f\u55d7\u7d8b\u9353\u5d85\u51e1\u9352\u62cc\u63ea\u9428\u52ea\u7d94\u6d93\u6c2b\u8151\u951b\u5c7e\u6e47\u9354\u2103\u6902\u95c2\u5b58\u6e36\u942d\ue160\u6b91\u6d63\u6ec0\u7b1f\u9354\u72b2\u53c6\u9352\u7648PU\u93b5\u0446\ue511
				__CLR4_4_100lut5aknk.R.inc(46);Work now = ins.get(0);
				__CLR4_4_100lut5aknk.R.inc(47);now.setBeginTime(i);
				__CLR4_4_100lut5aknk.R.inc(48);now.setEndTime(now.getBeginTime() + now.getServiceTime());
				__CLR4_4_100lut5aknk.R.inc(49);now.setIn(); // \u93cd\u56ea\ue187\u6d63\u6ec0\u7b1f\u5bb8\u8336\u769f\u6434\ufffd
				__CLR4_4_100lut5aknk.R.inc(50);counter++;
				__CLR4_4_100lut5aknk.R.inc(51);i = now.getEndTime(); // \u93c7\u5b58\u67ca\u8930\u64b3\u58a0\u93c3\u5815\u68ff
				__CLR4_4_100lut5aknk.R.inc(52);ins.clear(); // \u5a13\u546f\u2516\u6d93\u5b58\u6902\u93c1\u626e\u7c8dins
			}

		}}
		}__CLR4_4_100lut5aknk.R.inc(53);for (int m = 0; (((m < works.size())&&(__CLR4_4_100lut5aknk.R.iget(54)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(55)==0&false)); m++) {{
			__CLR4_4_100lut5aknk.R.inc(56);avgCircleTime += works.get(m).getCircleTime();
			__CLR4_4_100lut5aknk.R.inc(57);avgCircleTimeWP += works.get(m).getCircleWPTime();
		}
		}__CLR4_4_100lut5aknk.R.inc(58);avgCircleTime = avgCircleTime / works.size();
		__CLR4_4_100lut5aknk.R.inc(59);avgCircleTimeWP = avgCircleTimeWP / works.size();
		__CLR4_4_100lut5aknk.R.inc(60);lst.add(avgCircleTime);
		__CLR4_4_100lut5aknk.R.inc(61);lst.add(avgCircleTimeWP);
		__CLR4_4_100lut5aknk.R.inc(62);return lst;
	}finally{__CLR4_4_100lut5aknk.R.flushNeeded();}}

	/**
	 * \u7035\u7470\u59de\u934f\u30e5\u57cc\u7eef\u8364\u7cba\u6d93\ue160\u6b91\u6d63\u6ec0\u7b1f\u6e1a\u6fc7\u5d41\u93c8\u5d85\u59df\u93c3\u5815\u68ff\u6fb6\u6c2c\u76af\u6769\u6d9c\ue511\u93ba\u6391\u7c2d<BR>
	 * \u9412\u8dfa\u6097\u9429\u5b58\u5e34\u6769\u65bf\u6d16
	 * 
	 * @param ins
	 * @return ins
	 */
	public static List<Work> sortByServiceTime(List<Work> ins) {try{__CLR4_4_100lut5aknk.R.inc(63);
		__CLR4_4_100lut5aknk.R.inc(64);for (int i = 0; (((i < ins.size())&&(__CLR4_4_100lut5aknk.R.iget(65)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(66)==0&false)); i++) {{
			__CLR4_4_100lut5aknk.R.inc(67);for (int j = i + 1; (((j < ins.size())&&(__CLR4_4_100lut5aknk.R.iget(68)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(69)==0&false)); j++) {{
				__CLR4_4_100lut5aknk.R.inc(70);Work aw = ins.get(i);
				__CLR4_4_100lut5aknk.R.inc(71);int a = aw.getServiceTime();
				__CLR4_4_100lut5aknk.R.inc(72);Work bw = ins.get(j);
				__CLR4_4_100lut5aknk.R.inc(73);int b = bw.getServiceTime();
				__CLR4_4_100lut5aknk.R.inc(74);if ((((a > b)&&(__CLR4_4_100lut5aknk.R.iget(75)!=0|true))||(__CLR4_4_100lut5aknk.R.iget(76)==0&false))) {{
					__CLR4_4_100lut5aknk.R.inc(77);ins.remove(j);
					__CLR4_4_100lut5aknk.R.inc(78);ins.add(i, bw);
				}
			}}
		}}
		}__CLR4_4_100lut5aknk.R.inc(79);return ins;
	}finally{__CLR4_4_100lut5aknk.R.flushNeeded();}}
}