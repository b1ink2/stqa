/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * \u94d3\u4f7a\u5162\u7ee0\u6941\u7876\u5bb8\u30e5\u53ff\u7eeb\ufffd
 * 
 * @author lyq
 * 
 */
public class ACO {public static class __CLR4_4_100lugpgw6w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0031\u005c\u005c\u0037\u0036\u005c\u005c\u0041\u0043\u004f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711961153220L,8589935092L,178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	// \u6748\u64b3\u53c6\u93c1\u7248\u5d41\u7eeb\u8bf2\u7037
	public static final int INPUT_CITY_NAME = 1;
	public static final int INPUT_CITY_DIS = 2;

	// \u9369\u5ea1\u7af6\u95c2\u78cb\u7a9b\u7ec2\u5a5a\u5066\u93ba\u30e7\u7169\u95c3\ufffd
	public static double[][] disMatrix;
	// \u8930\u64b3\u58a0\u93c3\u5815\u68ff
	public static int currentTime;

	// \u5a34\u5b2d\u762f\u93c1\u7248\u5d41\u9366\u677f\u6f43
	private String filePath;
	// \u94d3\u509d\u6b8e\u93c1\u4f34\u567a
	private int antNum;
	// \u93ba\u0443\u57d7\u9359\u509b\u669f
	private double alpha;
	private double beita;
	private double p;
	private double Q;
	// \u95c5\u5fd4\u6e80\u93c1\u9881\u9a87\u9422\u71b7\u6ad2
	private Random random;
	// \u9369\u5ea1\u7af6\u935a\u5d87\u041e\u95c6\u55d7\u608e,\u6769\u6b13\u5677\u6d93\u8f70\u7c21\u93c2\u901b\u7a76\u951b\u5c7d\u76a2\u9369\u5ea1\u7af6\u9422\u3126\u669f\u701b\u6944\u3003\u7ec0\ufffd
	private ArrayList<String> totalCitys;
	// \u93b5\ufffd\u93c8\u590c\u6b91\u94d3\u509d\u6b8e\u95c6\u55d7\u608e
	private ArrayList<Ant> totalAnts;
	// \u9369\u5ea1\u7af6\u95c2\u5bf8\u6b91\u6dc7\u2103\u4f05\u7ef1\u72b3\u797f\u6434\ufe3e\u7169\u95c3\u7889\u7d1d\u95c5\u5fd5\u6f43\u93c3\u5815\u68ff\u9428\u52eb\ue583\u6fb6\u6c33\ufffd\u5c7d\u567a\u704f\ufffd
	private double[][] pheromoneMatrix;
	// \u9429\ue1bd\u7223\u9428\u52ec\u6e36\u942d\ue161\u77fe\u5bf0\ufffd,\u6924\u54c4\u7c2d\u6d93\u8f70\u7ca0\u95c6\u55d7\u608e\u9428\u52eb\u58a0\u95ae\u3125\u7dda\u935a\u5ea2\u5c13\u9354\ufffd
	private ArrayList<String> bestPath;
	// \u6dc7\u2103\u4f05\u7ef1\u72b5\u7169\u95c3\u975b\u74e8\u934c\u3125\u6d58,key\u95b2\u56e9\u6564\u9428\u52ec\u7278\u5bee\ufffd(i,j,t)->value
	private Map<String, Double> pheromoneTimeMap;

	public ACO(ArrayList<String[]> dataArray, int antNum, double alpha, double beita,
			double p, double Q) {try{__CLR4_4_100lugpgw6w.R.inc(0);
		__CLR4_4_100lugpgw6w.R.inc(1);this.antNum = antNum;
		__CLR4_4_100lugpgw6w.R.inc(2);this.alpha = alpha;
		__CLR4_4_100lugpgw6w.R.inc(3);this.beita = beita;
		__CLR4_4_100lugpgw6w.R.inc(4);this.p = p;
		__CLR4_4_100lugpgw6w.R.inc(5);this.Q = Q;
		__CLR4_4_100lugpgw6w.R.inc(6);this.currentTime = 0;

		__CLR4_4_100lugpgw6w.R.inc(7);readDataFile(dataArray);
	}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}

	/**
	 * \u7487\u8bf2\u5f47\u93c1\u7248\u5d41
	 */
	private void readDataFile(ArrayList<String[]> dataArray) {try{__CLR4_4_100lugpgw6w.R.inc(8);

		__CLR4_4_100lugpgw6w.R.inc(9);int flag = -1;
		__CLR4_4_100lugpgw6w.R.inc(10);int src = 0;
		__CLR4_4_100lugpgw6w.R.inc(11);int des = 0;
		__CLR4_4_100lugpgw6w.R.inc(12);int size = 0;
		// \u6769\u6d9c\ue511\u9369\u5ea1\u7af6\u935a\u5d87\u041e\u7ec9\u5d86\u669f\u9428\u52ed\u7cba\u7481\ufffd
		__CLR4_4_100lugpgw6w.R.inc(13);this.totalCitys = new ArrayList<String>();
		__CLR4_4_100lugpgw6w.R.inc(14);for (String[] array : dataArray) {{
			__CLR4_4_100lugpgw6w.R.inc(15);if ((((array[0].equals("#") && totalCitys.size() == 0)&&(__CLR4_4_100lugpgw6w.R.iget(16)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(17)==0&false))) {{
				__CLR4_4_100lugpgw6w.R.inc(18);flag = INPUT_CITY_NAME;

				__CLR4_4_100lugpgw6w.R.inc(19);continue;
			} }else {__CLR4_4_100lugpgw6w.R.inc(20);if ((((array[0].equals("#") && totalCitys.size() > 0)&&(__CLR4_4_100lugpgw6w.R.iget(21)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(22)==0&false))) {{
				__CLR4_4_100lugpgw6w.R.inc(23);size = totalCitys.size();
				// \u9352\u6fc6\ue750\u9356\u682c\u7a9b\u7ec2\u8364\u7169\u95c3\ufffd
				__CLR4_4_100lugpgw6w.R.inc(24);this.disMatrix = new double[size + 1][size + 1];
				__CLR4_4_100lugpgw6w.R.inc(25);this.pheromoneMatrix = new double[size + 1][size + 1];

				// \u9352\u6fc6\ue750\u934a\ufffd-1\u6d60\uff48\u3003\u59dd\u3085\ue1ee\u6434\u65be\u7d85\u7f03\ue1bd\u68e4\u934a\ufffd
				__CLR4_4_100lugpgw6w.R.inc(26);for (int i = 0; (((i < size)&&(__CLR4_4_100lugpgw6w.R.iget(27)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(28)==0&false)); i++) {{
					__CLR4_4_100lugpgw6w.R.inc(29);for (int j = 0; (((j < size)&&(__CLR4_4_100lugpgw6w.R.iget(30)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(31)==0&false)); j++) {{
						__CLR4_4_100lugpgw6w.R.inc(32);this.disMatrix[i][j] = -1;
						__CLR4_4_100lugpgw6w.R.inc(33);this.pheromoneMatrix[i][j] = -1;
					}
				}}

				}__CLR4_4_100lugpgw6w.R.inc(34);flag = INPUT_CITY_DIS;
				__CLR4_4_100lugpgw6w.R.inc(35);continue;
			}

			}}__CLR4_4_100lugpgw6w.R.inc(36);if ((((flag == INPUT_CITY_NAME)&&(__CLR4_4_100lugpgw6w.R.iget(37)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(38)==0&false))) {{
				__CLR4_4_100lugpgw6w.R.inc(39);this.totalCitys.add(array[0]);
			} }else {{
				__CLR4_4_100lugpgw6w.R.inc(40);src = Integer.parseInt(array[0]);
				__CLR4_4_100lugpgw6w.R.inc(41);des = Integer.parseInt(array[1]);

				__CLR4_4_100lugpgw6w.R.inc(42);this.disMatrix[src][des] = Double.parseDouble(array[2]);
				__CLR4_4_100lugpgw6w.R.inc(43);this.disMatrix[des][src] = Double.parseDouble(array[2]);
			}
		}}
	}}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}

	/**
	 * \u7481\uff04\u757b\u6d60\u5ea4\u6b8f\u94d3\u4f78\u7144\u752f\u4ff0\u9352\u7679\u9428\u52ec\ue6e7\u941c\ufffd
	 * 
	 * @param cityI
	 *            \u9369\u5ea1\u7af6I
	 * @param cityJ
	 *            \u9369\u5ea1\u7af6J
	 * @param currentTime
	 *            \u8930\u64b3\u58a0\u93c3\u5815\u68ff
	 * @return
	 */
	private double calIToJProbably(String cityI, String cityJ, int currentTime) {try{__CLR4_4_100lugpgw6w.R.inc(44);
		__CLR4_4_100lugpgw6w.R.inc(45);double pro = 0;
		__CLR4_4_100lugpgw6w.R.inc(46);double n = 0;
		__CLR4_4_100lugpgw6w.R.inc(47);double pheromone;
		__CLR4_4_100lugpgw6w.R.inc(48);int i;
		__CLR4_4_100lugpgw6w.R.inc(49);int j;

		__CLR4_4_100lugpgw6w.R.inc(50);i = Integer.parseInt(cityI);
		__CLR4_4_100lugpgw6w.R.inc(51);j = Integer.parseInt(cityJ);

		__CLR4_4_100lugpgw6w.R.inc(52);pheromone = getPheromone(currentTime, cityI, cityJ);
		__CLR4_4_100lugpgw6w.R.inc(53);n = 1.0 / disMatrix[i][j];

		__CLR4_4_100lugpgw6w.R.inc(54);if ((((pheromone == 0)&&(__CLR4_4_100lugpgw6w.R.iget(55)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(56)==0&false))) {{
			__CLR4_4_100lugpgw6w.R.inc(57);pheromone = 1;
		}

		}__CLR4_4_100lugpgw6w.R.inc(58);pro = Math.pow(n, alpha) * Math.pow(pheromone, beita);

		__CLR4_4_100lugpgw6w.R.inc(59);return pro;
	}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}

	/**
	 * \u7481\uff04\u757b\u7f01\u714e\u608e\u59d2\u509c\u5dfc\u94d3\u509d\u6b8e\u6d60\u5daa\u9369\u5ea1\u7af6\u74a7\u677f\u57ccJ\u9369\u5ea1\u7af6\u9428\u52ec\ue6e7\u941c\ufffd
	 * 
	 * @return
	 */
	public String selectAntNextCity(Ant ant, int currentTime) {try{__CLR4_4_100lugpgw6w.R.inc(60);
		__CLR4_4_100lugpgw6w.R.inc(61);double randomNum;
		__CLR4_4_100lugpgw6w.R.inc(62);double tempPro;
		// \u93ac\u7ed8\ue6e7\u941c\u56e8\u5bda\u93c1\ufffd
		__CLR4_4_100lugpgw6w.R.inc(63);double proTotal;
		__CLR4_4_100lugpgw6w.R.inc(64);String nextCity = null;
		__CLR4_4_100lugpgw6w.R.inc(65);ArrayList<String> allowedCitys;
		// \u935a\u52eb\u7144\u752f\u509b\ue6e7\u941c\u56ec\u6ce6
		__CLR4_4_100lugpgw6w.R.inc(66);double[] proArray;

		// \u6fe1\u509b\u7049\u93c4\ue21a\u57b0\u9352\u6c2c\u7d11\u6fee\u5b2c\u6b91\u93c3\u8dfa\ufffd\u6b19\u7d1d\u5a0c\u2103\u6e41\u74ba\ue21d\u7e43\u6d60\u8bb3\u7d8d\u9369\u5ea1\u7af6\u951b\u5c7d\u57af\u95c5\u5fd4\u6e80\u6769\u65bf\u6d16\u6d93\ufffd\u6d93\ue044\u7144\u752f\ufffd
		__CLR4_4_100lugpgw6w.R.inc(67);if ((((ant.currentPath.size() == 0)&&(__CLR4_4_100lugpgw6w.R.iget(68)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(69)==0&false))) {{
			__CLR4_4_100lugpgw6w.R.inc(70);nextCity = String.valueOf(random.nextInt(totalCitys.size()) + 1);

			__CLR4_4_100lugpgw6w.R.inc(71);return nextCity;
		} }else {__CLR4_4_100lugpgw6w.R.inc(72);if ((((ant.nonVisitedCitys.isEmpty())&&(__CLR4_4_100lugpgw6w.R.iget(73)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(74)==0&false))) {{
			// \u6fe1\u509b\u7049\u934f\u3129\u5134\u95ac\u5d85\u5dfb\u7039\u5c7e\u762f\u951b\u5c7d\u57af\u9350\u5d86\ue0bc\u9365\u70b2\u57cc\u74a7\u98ce\u5063
			__CLR4_4_100lugpgw6w.R.inc(75);nextCity = ant.currentPath.get(0);

			__CLR4_4_100lugpgw6w.R.inc(76);return nextCity;
		}

		}}__CLR4_4_100lugpgw6w.R.inc(77);proTotal = 0;
		__CLR4_4_100lugpgw6w.R.inc(78);allowedCitys = ant.nonVisitedCitys;
		__CLR4_4_100lugpgw6w.R.inc(79);proArray = new double[allowedCitys.size()];

		__CLR4_4_100lugpgw6w.R.inc(80);for (int i = 0; (((i < allowedCitys.size())&&(__CLR4_4_100lugpgw6w.R.iget(81)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(82)==0&false)); i++) {{
			__CLR4_4_100lugpgw6w.R.inc(83);nextCity = allowedCitys.get(i);
			__CLR4_4_100lugpgw6w.R.inc(84);proArray[i] = calIToJProbably(ant.currentPos, nextCity, currentTime);
			__CLR4_4_100lugpgw6w.R.inc(85);proTotal += proArray[i];
		}

		}__CLR4_4_100lugpgw6w.R.inc(86);for (int i = 0; (((i < allowedCitys.size())&&(__CLR4_4_100lugpgw6w.R.iget(87)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(88)==0&false)); i++) {{
			// \u8930\u638d\u7af4\u9356\u6827\ue629\u941e\ufffd
			__CLR4_4_100lugpgw6w.R.inc(89);proArray[i] /= proTotal;
		}

		// \u9422\u3129\u6ba2\u93c8\u70d8\u669f\u95ab\u590b\u5ae8\u6d93\u5b29\u7af4\u6d93\ue044\u7144\u752f\ufffd
		}__CLR4_4_100lugpgw6w.R.inc(90);randomNum = random.nextInt(100) + 1;
		__CLR4_4_100lugpgw6w.R.inc(91);randomNum = randomNum / 100;
		// \u9365\u72b1\u8d1f1.0\u93c4\ue21b\u68e4\u5a09\u66de\u57bd\u93c2\ue15e\u57cc\u9428\u52f6\u7d1d,\u93ac\u8bf2\u62f0\u6d7c\u6c2d\u68e4\u95c4\u612d\u5e34\u6769\ufffd1.0\u9359\u6826\u8d1f0.99\u934b\u6c2c\u57bd\u93c2\ufffd
		__CLR4_4_100lugpgw6w.R.inc(92);if ((((randomNum == 1)&&(__CLR4_4_100lugpgw6w.R.iget(93)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(94)==0&false))) {{
			__CLR4_4_100lugpgw6w.R.inc(95);randomNum = randomNum - 0.01;
		}

		}__CLR4_4_100lugpgw6w.R.inc(96);tempPro = 0;
		// \u7ead\ue1bc\u757e\u9356\u6d2a\u68ff
		__CLR4_4_100lugpgw6w.R.inc(97);for (int j = 0; (((j < allowedCitys.size())&&(__CLR4_4_100lugpgw6w.R.iget(98)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(99)==0&false)); j++) {{
			__CLR4_4_100lugpgw6w.R.inc(100);if ((((randomNum > tempPro && randomNum <= tempPro + proArray[j])&&(__CLR4_4_100lugpgw6w.R.iget(101)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(102)==0&false))) {{
				// \u95b2\u56e9\u6564\u93b7\u75af\u7909\u9428\u52ec\u67df\u5bee\u5fdb\u4f29\u934f\u5d85\u7d29\u9422\u3129\u5678\u6fb6\ufffd
				__CLR4_4_100lugpgw6w.R.inc(103);nextCity = allowedCitys.get(j);
				__CLR4_4_100lugpgw6w.R.inc(104);break;
			} }else {{
				__CLR4_4_100lugpgw6w.R.inc(105);tempPro += proArray[j];
			}
		}}

		}__CLR4_4_100lugpgw6w.R.inc(106);return nextCity;
	}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}

	/**
	 * \u947e\u5cf0\u5f47\u7f01\u6b0f\u757e\u93c3\u5815\u68ff\u9410\u901b\u7b02\u6d60\u5ea1\u7144\u752f\u4ff0\u9352\u677f\u7144\u752f\u4ff2\u9428\u52ea\u4fca\u93ad\ue21c\u790c\u5a34\u64b3\u5bb3
	 * 
	 * @param t
	 * @param cityI
	 * @param cityJ
	 * @return
	 */
	private double getPheromone(int t, String cityI, String cityJ) {try{__CLR4_4_100lugpgw6w.R.inc(107);
		__CLR4_4_100lugpgw6w.R.inc(108);double pheromone = 0;
		__CLR4_4_100lugpgw6w.R.inc(109);String key;

		// \u6d93\u5a41\u7af4\u935b\u3126\u6e61\u95c7\ufffd\u704f\u55d8\u6902\u95c2\u6751\ufffd\u6391\u6d16\u6d93\ufffd\u935b\u3126\u6e61
		__CLR4_4_100lugpgw6w.R.inc(110);key = MessageFormat.format("{0},{1},{2}", cityI, cityJ, t);

		__CLR4_4_100lugpgw6w.R.inc(111);if ((((pheromoneTimeMap.containsKey(key))&&(__CLR4_4_100lugpgw6w.R.iget(112)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(113)==0&false))) {{
			__CLR4_4_100lugpgw6w.R.inc(114);pheromone = pheromoneTimeMap.get(key);
		}

		}__CLR4_4_100lugpgw6w.R.inc(115);return pheromone;
	}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}

	/**
	 * \u59e3\u5fda\u7586\u7f01\u64b4\u6f6b\u951b\u5c7d\u57db\u93c2\u9881\u4fca\u93ad\ue21c\u790c\u5a34\u64b3\u5bb3\u942d\u2545\u6a00
	 * 
	 * @param t
	 */
	private void refreshPheromone(int t) {try{__CLR4_4_100lugpgw6w.R.inc(116);
		__CLR4_4_100lugpgw6w.R.inc(117);double pheromone = 0;
		// \u6d93\u5a41\u7af4\u675e\ue1bc\u61c6\u93c8\u71ba\u7ca8\u93c9\u71b7\u6097\u9428\u52ea\u4fca\u93ad\ue21c\u790c\u5a34\u64b3\u5bb3\u951b\u5c7c\u7b21\u6dc7\u2103\u4f05\u7ef1\u72b3\u797f\u6434\ufe40\u6d58\u6d93\ue15f\u7161\u93b5\ufffd
		__CLR4_4_100lugpgw6w.R.inc(118);double lastTimeP = 0;
		// \u93c8\ue103\u7586\u6dc7\u2103\u4f05\u7ef1\u72b3\u797f\u6434\ufe40\ue583\u9354\u72bb\u567a
		__CLR4_4_100lugpgw6w.R.inc(119);double addPheromone;
		__CLR4_4_100lugpgw6w.R.inc(120);String key;

		__CLR4_4_100lugpgw6w.R.inc(121);for (String i : totalCitys) {{
			__CLR4_4_100lugpgw6w.R.inc(122);for (String j : totalCitys) {{
				__CLR4_4_100lugpgw6w.R.inc(123);if ((((!i.equals(j))&&(__CLR4_4_100lugpgw6w.R.iget(124)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(125)==0&false))) {{
					// \u6d93\u5a41\u7af4\u935b\u3126\u6e61\u95c7\ufffd\u704f\u55d8\u6902\u95c2\u6751\ufffd\u6391\u6d16\u6d93\ufffd\u935b\u3126\u6e61
					__CLR4_4_100lugpgw6w.R.inc(126);key = MessageFormat.format("{0},{1},{2}", i, j, t - 1);

					__CLR4_4_100lugpgw6w.R.inc(127);if ((((pheromoneTimeMap.containsKey(key))&&(__CLR4_4_100lugpgw6w.R.iget(128)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(129)==0&false))) {{
						__CLR4_4_100lugpgw6w.R.inc(130);lastTimeP = pheromoneTimeMap.get(key);
					} }else {{
						__CLR4_4_100lugpgw6w.R.inc(131);lastTimeP = 0;
					}

					}__CLR4_4_100lugpgw6w.R.inc(132);addPheromone = 0;
					__CLR4_4_100lugpgw6w.R.inc(133);for (Ant ant : totalAnts) {{
						__CLR4_4_100lugpgw6w.R.inc(134);if((((ant.pathContained(i, j))&&(__CLR4_4_100lugpgw6w.R.iget(135)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(136)==0&false))){{
							// \u59e3\u5fd3\u5f67\u94d3\u509d\u6b8e\u6d7c\u72b3\u6331\u9428\u52ea\u4fca\u93ad\ue21c\u790c\u6d93\u70d8\u5e36\u9352\u8dfa\u6d1c\u701b\u6130\u6ace\u6d60\u30e8\u7a9b\u7ec2\u7ed8\ufffd\u7ed8\u579a\u93c8\ufffd
							__CLR4_4_100lugpgw6w.R.inc(137);addPheromone += Q / ant.calSumDistance();
						}
					}}

					// \u704f\u55d5\u7b02\u5a06\uff04\u6b91\u7f01\u64b4\u7049\u934a\u714e\u59de\u6d93\u5a47\ufffd\u6391\ue583\u9428\u52ef\u567a\u951b\u5c7d\u82df\u701b\u6a3a\u53c6\u9365\u53e5\u8151
					}__CLR4_4_100lugpgw6w.R.inc(138);pheromone = p * lastTimeP + addPheromone;
					__CLR4_4_100lugpgw6w.R.inc(139);key = MessageFormat.format("{0},{1},{2}", i, j, t);
					__CLR4_4_100lugpgw6w.R.inc(140);pheromoneTimeMap.put(key, pheromone);
				}
			}}
		}}

	}}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}

	/**
	 * \u94d3\u4f7a\u5162\u7ee0\u6941\u7876\u6769\ue15d\u552c\u5a06\u2103\u669f
	 * @param loopCount
	 * \u934f\u8702\u7d8b\u95ac\u5d85\u5dfb\u5a06\u2103\u669f
	 */
	public void antStartSearching(int loopCount) {try{__CLR4_4_100lugpgw6w.R.inc(141);
		// \u94d3\u4f7a\u5162\u7035\u7ed8\u58d8\u9428\u52ec\ufffd\u7ed8\ue0bc\u93c1\ufffd
		__CLR4_4_100lugpgw6w.R.inc(142);int count = 0;
		// \u95ab\u5909\u8151\u9428\u52ea\u7b05\u6d93\ufffd\u6d93\ue044\u7144\u752f\ufffd
		__CLR4_4_100lugpgw6w.R.inc(143);String selectedCity = "";

		__CLR4_4_100lugpgw6w.R.inc(144);pheromoneTimeMap = new HashMap<String, Double>();
		__CLR4_4_100lugpgw6w.R.inc(145);totalAnts = new ArrayList<Ant>();
		__CLR4_4_100lugpgw6w.R.inc(146);random = new Random();

		__CLR4_4_100lugpgw6w.R.inc(147);while ((((count < loopCount)&&(__CLR4_4_100lugpgw6w.R.iget(148)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(149)==0&false))) {{
			__CLR4_4_100lugpgw6w.R.inc(150);initAnts();

			__CLR4_4_100lugpgw6w.R.inc(151);while (true) {{
				__CLR4_4_100lugpgw6w.R.inc(152);for (Ant ant : totalAnts) {{
					__CLR4_4_100lugpgw6w.R.inc(153);selectedCity = selectAntNextCity(ant, currentTime);
					__CLR4_4_100lugpgw6w.R.inc(154);ant.goToNextCity(selectedCity);
				}

				// \u6fe1\u509b\u7049\u5bb8\u832c\u7ca1\u95ac\u5d85\u5dfb\u7039\u5c7e\u588d\u93c8\u590a\u7144\u752f\u50a6\u7d1d\u9352\u6b12\u70e6\u9351\u70d8\ue11d\u675e\ue1bc\u60ca\u941c\ufffd
				}__CLR4_4_100lugpgw6w.R.inc(155);if ((((totalAnts.get(0).isBack())&&(__CLR4_4_100lugpgw6w.R.iget(156)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(157)==0&false))) {{
					__CLR4_4_100lugpgw6w.R.inc(158);break;
				}
			}}

			// \u935b\u3126\u6e61\u93c3\u5815\u68ff\u9359\u72b2\u59de
			}__CLR4_4_100lugpgw6w.R.inc(159);currentTime++;
			__CLR4_4_100lugpgw6w.R.inc(160);refreshPheromone(currentTime);
			__CLR4_4_100lugpgw6w.R.inc(161);count++;
		}

		// \u93cd\u89c4\u5d41\u74ba\u6fc8\ue787\u93b4\u612d\u6e70\u951b\u5c84\ufffd\u590a\u56ad\u93b5\ufffd\u947a\u8fab\u7a9b\u7ec2\u7ed8\u6e36\u942d\ue160\u6b91\u6d93\ufffd\u6d93\ue047\u77fe\u5bf0\ufffd
		}__CLR4_4_100lugpgw6w.R.inc(162);Collections.sort(totalAnts);
		__CLR4_4_100lugpgw6w.R.inc(163);bestPath = totalAnts.get(0).currentPath;
		__CLR4_4_100lugpgw6w.R.inc(164);System.out.println(MessageFormat.format("\u7f01\u5fda\u7e43{0}\u5a06\u2033\u60ca\u941c\ue21e\u4eb6\u9358\u55ed\u7d1d\u93c8\ufffd\u7f01\u581d\u7df1\u9351\u8679\u6b91\u93c8\ufffd\u6d63\u5ba0\u77fe\u5bf0\u52f6\u7d30", count));
		__CLR4_4_100lugpgw6w.R.inc(165);System.out.print("entrance");
		__CLR4_4_100lugpgw6w.R.inc(166);for (String cityName : bestPath) {{
			__CLR4_4_100lugpgw6w.R.inc(167);System.out.print(MessageFormat.format("-->{0}", cityName));
		}
	}}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}

	/**
	 * \u9352\u6fc6\ue750\u9356\u682c\u6b8e\u7f07\u3086\u6437\u6d63\ufffd
	 */
	private void initAnts() {try{__CLR4_4_100lugpgw6w.R.inc(168);
		__CLR4_4_100lugpgw6w.R.inc(169);Ant tempAnt;
		__CLR4_4_100lugpgw6w.R.inc(170);ArrayList<String> nonVisitedCitys;
		__CLR4_4_100lugpgw6w.R.inc(171);totalAnts.clear();

		// \u9352\u6fc6\ue750\u9356\u682c\u6b8e\u7f07\ufffd
		__CLR4_4_100lugpgw6w.R.inc(172);for (int i = 0; (((i < antNum)&&(__CLR4_4_100lugpgw6w.R.iget(173)!=0|true))||(__CLR4_4_100lugpgw6w.R.iget(174)==0&false)); i++) {{
			__CLR4_4_100lugpgw6w.R.inc(175);nonVisitedCitys = (ArrayList<String>) totalCitys.clone();
			__CLR4_4_100lugpgw6w.R.inc(176);tempAnt = new Ant(pheromoneMatrix, nonVisitedCitys);

			__CLR4_4_100lugpgw6w.R.inc(177);totalAnts.add(tempAnt);
		}
	}}finally{__CLR4_4_100lugpgw6w.R.flushNeeded();}}
}
