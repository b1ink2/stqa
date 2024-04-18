/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;

/**
 * \u94d3\u509d\u6b8e\u7eeb\u4f19\u7d1d\u6769\u6d9c\ue511\u74ba\ue21a\u7dde\u93bc\u6ec5\u50a8\u9428\u52ee\u6d47\u6d63\ufffd
 * 
 * @author lyq
 * 
 */
public class Ant implements Comparable<Ant> {public static class __CLR4_4_14y4ylugpgw84{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0031\u005c\u005c\u0037\u0036\u005c\u005c\u0041\u0043\u004f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711961153220L,8589935092L,231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	// \u94d3\u509d\u6b8e\u8930\u64b3\u58a0\u93b5\ufffd\u9366\u3125\u7144\u752f\ufffd
	String currentPos;
	// \u94d3\u509d\u6b8e\u95ac\u5d85\u5dfb\u7039\u5c7d\u6d16\u9352\u677f\u5e2b\u9410\u89c4\u588d\u9422\u3127\u6b91\u93ac\u660f\u7a9b\u7ec2\ufffd
	Double sumDistance;
	// \u9369\u5ea1\u7af6\u95c2\u5bf8\u6b91\u6dc7\u2103\u4f05\u7ef1\u72b3\u797f\u6434\ufe3e\u7169\u95c3\u7889\u7d1d\u95c5\u5fd5\u6f43\u93c3\u5815\u68ff\u9428\u52eb\ue583\u6fb6\u6c33\ufffd\u5c7d\u567a\u704f\ufffd
	double[][] pheromoneMatrix;
	// \u94d3\u509d\u6b8e\u5bb8\u832c\u7ca1\u74a7\u62cc\u7e43\u9428\u52eb\u7144\u752f\u509e\u6ce6\u935a\ufffd
	ArrayList<String> visitedCitys;
	// \u6769\u6a3b\u6e6d\u74a7\u62cc\u7e43\u9428\u52eb\u7144\u752f\u509e\u6ce6\u935a\ufffd
	ArrayList<String> nonVisitedCitys;
	// \u94d3\u509d\u6b8e\u8930\u64b3\u58a0\u74a7\u62cc\u7e43\u9428\u52ee\u77fe\u5bf0\ufffd
	ArrayList<String> currentPath;

	public Ant(double[][] pheromoneMatrix, ArrayList<String> nonVisitedCitys) {try{__CLR4_4_14y4ylugpgw84.R.inc(178);
		__CLR4_4_14y4ylugpgw84.R.inc(179);this.pheromoneMatrix = pheromoneMatrix;
		__CLR4_4_14y4ylugpgw84.R.inc(180);this.nonVisitedCitys = nonVisitedCitys;

		__CLR4_4_14y4ylugpgw84.R.inc(181);this.visitedCitys = new ArrayList<String>();
		__CLR4_4_14y4ylugpgw84.R.inc(182);this.currentPath = new ArrayList<String>();
	}finally{__CLR4_4_14y4ylugpgw84.R.flushNeeded();}}

	/**
	 * \u7481\uff04\u757b\u74ba\ue21a\u7dde\u9428\u52ec\ufffd\u7ed8\u579a\u93c8\ufffd(\u74ba\u6fc8\ue787)
	 * 
	 * @return
	 */
	public double calSumDistance() {try{__CLR4_4_14y4ylugpgw84.R.inc(183);
		__CLR4_4_14y4ylugpgw84.R.inc(184);sumDistance = 0.0;
		__CLR4_4_14y4ylugpgw84.R.inc(185);String lastCity;
		__CLR4_4_14y4ylugpgw84.R.inc(186);String currentCity;

		__CLR4_4_14y4ylugpgw84.R.inc(187);for (int i = 0; (((i < currentPath.size() - 1)&&(__CLR4_4_14y4ylugpgw84.R.iget(188)!=0|true))||(__CLR4_4_14y4ylugpgw84.R.iget(189)==0&false)); i++) {{
			__CLR4_4_14y4ylugpgw84.R.inc(190);lastCity = currentPath.get(i);
			__CLR4_4_14y4ylugpgw84.R.inc(191);currentCity = currentPath.get(i + 1);

			// \u95ab\u6c33\u7e43\u74ba\u6fc8\ue787\u942d\u2545\u6a00\u6769\u6d9c\ue511\u7481\uff04\u757b
			__CLR4_4_14y4ylugpgw84.R.inc(192);sumDistance += ACO.disMatrix[Integer.parseInt(lastCity)][Integer
					.parseInt(currentCity)];
		}

		}__CLR4_4_14y4ylugpgw84.R.inc(193);return sumDistance;
	}finally{__CLR4_4_14y4ylugpgw84.R.flushNeeded();}}

	/**
	 * \u94d3\u509d\u6b8e\u95ab\u590b\u5ae8\u9353\u5d85\u7dda\u6d93\u5b29\u7af4\u6d93\ue044\u7144\u752f\ufffd
	 * 
	 * @param city
	 *            \u93b5\ufffd\u95ab\u590c\u6b91\u9369\u5ea1\u7af6
	 */
	public void goToNextCity(String city) {try{__CLR4_4_14y4ylugpgw84.R.inc(194);
		__CLR4_4_14y4ylugpgw84.R.inc(195);this.currentPath.add(city);
		__CLR4_4_14y4ylugpgw84.R.inc(196);this.currentPos = city;
		__CLR4_4_14y4ylugpgw84.R.inc(197);this.nonVisitedCitys.remove(city);
		__CLR4_4_14y4ylugpgw84.R.inc(198);this.visitedCitys.add(city);
	}finally{__CLR4_4_14y4ylugpgw84.R.flushNeeded();}}

	/**
	 * \u9352\u3086\u67c7\u94d3\u509d\u6b8e\u93c4\ue21a\u60c1\u5bb8\u832c\u7ca1\u9359\u5825\u5678\u93c2\u677f\u6d16\u9352\u62cc\u6363\u9410\ufffd
	 * 
	 * @return
	 */
	public boolean isBack() {try{__CLR4_4_14y4ylugpgw84.R.inc(199);
		__CLR4_4_14y4ylugpgw84.R.inc(200);boolean isBack = false;
		__CLR4_4_14y4ylugpgw84.R.inc(201);String startPos;
		__CLR4_4_14y4ylugpgw84.R.inc(202);String endPos;

		__CLR4_4_14y4ylugpgw84.R.inc(203);if ((((currentPath.size() == 0)&&(__CLR4_4_14y4ylugpgw84.R.iget(204)!=0|true))||(__CLR4_4_14y4ylugpgw84.R.iget(205)==0&false))) {{
			__CLR4_4_14y4ylugpgw84.R.inc(206);return isBack;
		}

		}__CLR4_4_14y4ylugpgw84.R.inc(207);startPos = currentPath.get(0);
		__CLR4_4_14y4ylugpgw84.R.inc(208);endPos = currentPath.get(currentPath.size() - 1);
		__CLR4_4_14y4ylugpgw84.R.inc(209);if ((((currentPath.size() > 1 && startPos.equals(endPos))&&(__CLR4_4_14y4ylugpgw84.R.iget(210)!=0|true))||(__CLR4_4_14y4ylugpgw84.R.iget(211)==0&false))) {{
			__CLR4_4_14y4ylugpgw84.R.inc(212);isBack = true;
		}

		}__CLR4_4_14y4ylugpgw84.R.inc(213);return isBack;
	}finally{__CLR4_4_14y4ylugpgw84.R.flushNeeded();}}

	/**
	 * \u9352\u3086\u67c7\u94d3\u509d\u6b8e\u9366\u3126\u6e70\u5a06\uff04\u6b91\u74a7\u62cc\u7e43\u9428\u52ee\u77fe\u5bf0\u52ea\u8151\u93c4\ue21a\u60c1\u9356\u546d\u60c8\u6d60\u5ea1\u7144\u752f\u4ff0\u9352\u677f\u7144\u752f\u4ff2
	 * 
	 * @param cityI
	 *            \u9369\u5ea1\u7af6I
	 * @param cityJ
	 *            \u9369\u5ea1\u7af6J
	 * @return
	 */
	public boolean pathContained(String cityI, String cityJ) {try{__CLR4_4_14y4ylugpgw84.R.inc(214);
		__CLR4_4_14y4ylugpgw84.R.inc(215);String lastCity;
		__CLR4_4_14y4ylugpgw84.R.inc(216);String currentCity;
		__CLR4_4_14y4ylugpgw84.R.inc(217);boolean isContained = false;

		__CLR4_4_14y4ylugpgw84.R.inc(218);for (int i = 0; (((i < currentPath.size() - 1)&&(__CLR4_4_14y4ylugpgw84.R.iget(219)!=0|true))||(__CLR4_4_14y4ylugpgw84.R.iget(220)==0&false)); i++) {{
			__CLR4_4_14y4ylugpgw84.R.inc(221);lastCity = currentPath.get(i);
			__CLR4_4_14y4ylugpgw84.R.inc(222);currentCity = currentPath.get(i + 1);

			// \u6fe1\u509b\u7049\u93cc\u612a\u7af4\u5a08\u4f43\u77fe\u5bf0\u52ed\u6b91\u6fee\u5b2b\u6e6f\u6d63\u5d87\u7586\u6d93\ufffd\u9477\u8fbe\u7d1d\u9352\u6b12\ue17b\u6d93\u70d8\u6e41\u7f01\u5fda\u7e43\u59dd\u3085\u7144\u752f\ufffd
			__CLR4_4_14y4ylugpgw84.R.inc(223);if (((((lastCity.equals(cityI) && currentCity.equals(cityJ))
					|| (lastCity.equals(cityJ) && currentCity.equals(cityI)))&&(__CLR4_4_14y4ylugpgw84.R.iget(224)!=0|true))||(__CLR4_4_14y4ylugpgw84.R.iget(225)==0&false))) {{
				__CLR4_4_14y4ylugpgw84.R.inc(226);isContained = true;
				__CLR4_4_14y4ylugpgw84.R.inc(227);break;
			}
		}}

		}__CLR4_4_14y4ylugpgw84.R.inc(228);return isContained;
	}finally{__CLR4_4_14y4ylugpgw84.R.flushNeeded();}}

	public int compareTo(Ant o) {try{__CLR4_4_14y4ylugpgw84.R.inc(229);
		// TODO Auto-generated method stub
		__CLR4_4_14y4ylugpgw84.R.inc(230);return this.sumDistance.compareTo(o.sumDistance);
	}finally{__CLR4_4_14y4ylugpgw84.R.flushNeeded();}}
}
