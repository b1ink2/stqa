/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import net.mooctest.Room;

import java.util.*;

/**
 * @author: Diors.Po
 * @Email: 171256175@qq.com
 * @date 2019-09-16 09:56
 */
public class Hotel {public static class __CLR4_4_1zzluut6nxc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static List<Room> rooms = new ArrayList<>();
    private static Map<String,Integer> roomState ;
    private static Map<String,Integer> roomType ;
    private static Map<String,Integer> roomType2;

    static {try{__CLR4_4_1zzluut6nxc.R.inc(35);
        __CLR4_4_1zzluut6nxc.R.inc(36);init();
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}

    public static void main (String args [] ){try{__CLR4_4_1zzluut6nxc.R.inc(37);
        __CLR4_4_1zzluut6nxc.R.inc(38);System.out.println(Integer.MAX_VALUE);
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}


    private static void init (){try{__CLR4_4_1zzluut6nxc.R.inc(39);
        __CLR4_4_1zzluut6nxc.R.inc(40);rooms = new ArrayList<>();
        __CLR4_4_1zzluut6nxc.R.inc(41);roomState = new HashMap<>();
        __CLR4_4_1zzluut6nxc.R.inc(42);roomType = new HashMap<>();
        __CLR4_4_1zzluut6nxc.R.inc(43);roomType2 = new HashMap<>();
        __CLR4_4_1zzluut6nxc.R.inc(44);roomType.put("Deluxe Room",2);
        __CLR4_4_1zzluut6nxc.R.inc(45);roomType.put("Advanced Room",3);
        __CLR4_4_1zzluut6nxc.R.inc(46);roomType.put("Standard Room",1);
        __CLR4_4_1zzluut6nxc.R.inc(47);roomType2.put("Deluxe Room",3);
        __CLR4_4_1zzluut6nxc.R.inc(48);roomType2.put("Advanced Room",2);
        __CLR4_4_1zzluut6nxc.R.inc(49);roomType2.put("Standard Room",1);
        __CLR4_4_1zzluut6nxc.R.inc(50);roomState.put("RoomState: Free",3);
        __CLR4_4_1zzluut6nxc.R.inc(51);roomState.put("RoomState: CheckIn",2);
        __CLR4_4_1zzluut6nxc.R.inc(52);roomState.put("RoomState: Booked",1);
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}

    public Hotel(){try{__CLR4_4_1zzluut6nxc.R.inc(53);
        __CLR4_4_1zzluut6nxc.R.inc(54);init();
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}


    /**
     * \u93cd\u89c4\u5d41\u6748\u64b3\u53c6\u9428\u52ec\u57e7\u95c2\u6751\u5f7f\u93cc\u30e8\ue1d7\u93b4\u5757\u68ff\u6dc7\u2103\u4f05\u951b\u5c83\u5ae2\u6d93\u5d85\u74e8\u9366\u3125\u57af\u93b6\u6d98\u56ad\u5bee\u509a\u7236
     * @param roomCode
     */
    public static void queryRoom(final int roomCode){try{__CLR4_4_1zzluut6nxc.R.inc(55);
        __CLR4_4_1zzluut6nxc.R.inc(56);Room temp = null;

        __CLR4_4_1zzluut6nxc.R.inc(57);for (Room r:rooms) {{
            __CLR4_4_1zzluut6nxc.R.inc(58);if((((r.getRoomCode()==roomCode)&&(__CLR4_4_1zzluut6nxc.R.iget(59)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(60)==0&false))){{
                __CLR4_4_1zzluut6nxc.R.inc(61);temp = r;
                __CLR4_4_1zzluut6nxc.R.inc(62);break;
            }
        }}
        }__CLR4_4_1zzluut6nxc.R.inc(63);if((((temp == null)&&(__CLR4_4_1zzluut6nxc.R.iget(64)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(65)==0&false))){{
            __CLR4_4_1zzluut6nxc.R.inc(66);throw new IllegalArgumentException("Room not exist: "+roomCode);
        }}else{{
            __CLR4_4_1zzluut6nxc.R.inc(67);System.out.print(temp.toString());
        }
    }}finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}


    private static void printRoomInfo ( Room temp){try{__CLR4_4_1zzluut6nxc.R.inc(68);
        __CLR4_4_1zzluut6nxc.R.inc(69);System.out.print(temp.toString());
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}

    /**
     * \u7035\u89c4\u588d\u93c8\u590b\u57e7\u95c2\u78cb\u7e58\u741b\u5c7e\u5e13\u6434\u5fd3\u82df\u93cd\u714e\u7d21\u9356\u6828\u58a6\u9357\u62cc\u7ded\u9351\u7334\u7d1d\u93b5\u64b3\u5d43\u93cd\u714e\u7d21\u9359\u509d\ufffd\u51a9\u7974\u7487\u66e0\u6564\u6e1a\u5b36\u7d1d\u93b4\u5757\u68ff\u93ba\u6391\u7c2d\u6d7c\u6a3a\u539b\u7efe\u0443\ue6e7\u6d93\u5b36\u7d30
     * 1. \u68e3\u6827\u539b\u93cd\u89c4\u5d41\u93b4\u5757\u68ff\u9418\u8235\ufffd\u4f79\u5e13\u6434\u5fe5\u7d1d\u7ecc\u6d2a\u68fd -> \u68f0\u52eb\u757e -> \u934f\u30e4\u7d87;
     * 2. \u934f\u8235\ue0bc\u93cd\u89c4\u5d41\u93b4\u5757\u68ff\u7eeb\u8bf2\u7037\u9428\u52eb\u74e7\u934f\u7a3f\u7c2d\u6769\u6d9c\ue511\u93ba\u6391\u7c2d;
     * 3. \u934f\u8235\ue0bc\u93cd\u89c4\u5d41\u93b4\u5757\u68ff\u6d60\u950b\u7278\u6769\u6d9c\ue511\u93ba\u6391\u7c2d\u951b\u5c84\u73ee -> \u6d63\ufffd
     * 4. \u934f\u8235\ue0bc\u93cd\u89c4\u5d41\u93b4\u5757\u68ff\u9359\u75af\u7e58\u741b\u5c7e\u5e13\u6434\ufffd,  \u6942\ufffd->\u6d63\ufffd
     */
    public static void printAllRoomsInfo(){try{__CLR4_4_1zzluut6nxc.R.inc(70);

        __CLR4_4_1zzluut6nxc.R.inc(71);Room [] data = new Room[rooms.size()];
        __CLR4_4_1zzluut6nxc.R.inc(72);for(int i =0;(((i<rooms.size())&&(__CLR4_4_1zzluut6nxc.R.iget(73)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(74)==0&false));i++){{
            __CLR4_4_1zzluut6nxc.R.inc(75);data[i] = rooms.get(i);
        }
        }__CLR4_4_1zzluut6nxc.R.inc(76);sortByValue(data);
        __CLR4_4_1zzluut6nxc.R.inc(77);for(int j = 0 ;(((j<data.length)&&(__CLR4_4_1zzluut6nxc.R.iget(78)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(79)==0&false));j++){{
            __CLR4_4_1zzluut6nxc.R.inc(80);printRoomInfo(data[j]);
        }
    }}finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}

    private static void sortByValue(Room [] data){try{__CLR4_4_1zzluut6nxc.R.inc(81);
        __CLR4_4_1zzluut6nxc.R.inc(82);for(int i =0;(((i<data.length)&&(__CLR4_4_1zzluut6nxc.R.iget(83)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(84)==0&false));i++){{
            __CLR4_4_1zzluut6nxc.R.inc(85);for(int j=i+1;(((j<data.length)&&(__CLR4_4_1zzluut6nxc.R.iget(86)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(87)==0&false));j++){{
                __CLR4_4_1zzluut6nxc.R.inc(88);if((((getValue(data[i])<getValue(data[j]))&&(__CLR4_4_1zzluut6nxc.R.iget(89)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(90)==0&false))){{
                    __CLR4_4_1zzluut6nxc.R.inc(91);swap(data,i,j);
                }
            }}
        }}
    }}finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}

    private static int getValue (Room data ){try{__CLR4_4_1zzluut6nxc.R.inc(92);
        __CLR4_4_1zzluut6nxc.R.inc(93);int res = 0 ;
        __CLR4_4_1zzluut6nxc.R.inc(94);res+=data.getRoomCode();
        __CLR4_4_1zzluut6nxc.R.inc(95);res+=data.getPrice()*1000;
        __CLR4_4_1zzluut6nxc.R.inc(96);res+=  roomType.get(data.getType())*1000000; // \u93cd\u89c4\u5d41\u6d93\u5a47\u6f70\u9428\u52ee\ue749\u9352\u6b19\u7d1d\u93b4\u5757\u68ff\u6d60\u950b\u7278\u6d93\u5d88\u79f4\u6769\ufffd1000 \u6d94\u71b7\u6c28\u93c4\ue219\u7b01\u6d63\u5d86\u669f
        __CLR4_4_1zzluut6nxc.R.inc(97);res+=roomState.get(data.getState().toString())*10000000;
        __CLR4_4_1zzluut6nxc.R.inc(98);return res;
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}



    private static void sortByValue2(Room [] data){try{__CLR4_4_1zzluut6nxc.R.inc(99);
        __CLR4_4_1zzluut6nxc.R.inc(100);for(int i =0;(((i<data.length)&&(__CLR4_4_1zzluut6nxc.R.iget(101)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(102)==0&false));i++){{
            __CLR4_4_1zzluut6nxc.R.inc(103);for(int j=i+1;(((j<data.length)&&(__CLR4_4_1zzluut6nxc.R.iget(104)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(105)==0&false));j++){{
                __CLR4_4_1zzluut6nxc.R.inc(106);if((((getValue2(data[i])<getValue2(data[j]))&&(__CLR4_4_1zzluut6nxc.R.iget(107)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(108)==0&false))){{
                    __CLR4_4_1zzluut6nxc.R.inc(109);swap(data,i,j);
                }
            }}
        }}
    }}finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}



    /**
     * \u6d5c\u3086\u5d32
     * @param data
     * @param left
     * @param right
     */
    private static void swap(Room [] data , int left ,int right ){try{__CLR4_4_1zzluut6nxc.R.inc(110);
        __CLR4_4_1zzluut6nxc.R.inc(111);Room temp = data[left];
        __CLR4_4_1zzluut6nxc.R.inc(112);data[left] = data[right];
        __CLR4_4_1zzluut6nxc.R.inc(113);data[right] = temp;
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}
    private static int getValue2 (Room data ){try{__CLR4_4_1zzluut6nxc.R.inc(114);
        __CLR4_4_1zzluut6nxc.R.inc(115);int res = 0 ;
        __CLR4_4_1zzluut6nxc.R.inc(116);res+=data.getRoomCode();
        __CLR4_4_1zzluut6nxc.R.inc(117);res+=data.getPrice()*1000;
        __CLR4_4_1zzluut6nxc.R.inc(118);res+=roomType2.get(data.getType())*10000000;
        __CLR4_4_1zzluut6nxc.R.inc(119);return res;
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}
    /**
     * \u93cc\u30e8\ue1d7\u93b5\ufffd\u93c8\u590c\u2516\u95c2\u832c\u59f8\u93ac\u4f7a\u6b91\u93b4\u5757\u68ff\u951b\u5c7e\u5e13\u6434\u5fd3\u6097\u6769\u65bf\u6d16\u951b\u5c7d\u82df\u93b5\u64b3\u5d43\u6769\u65bf\u6d16\u9428\u51f4oomList\u951b\u5c7e\u5e13\u6434\u5fce\u7d2d\u934f\u5822\u9a87\u6fe1\u5099\u7b05\u951b\ufffd
     * 1. \u68e3\u6827\u539b\u93cd\u89c4\u5d41\u93b4\u5757\u68ff\u7eeb\u8bf2\u7037\u9428\u52eb\u74e7\u934f\u7a3f\u7c2d\u6769\u6d9c\ue511\u93ba\u6391\u7c2d\u951b\u5c83\u8c79\u9357\u5ea2\u57e7 -> \u6942\u6a3c\u9a87\u93b4\ufffd -> \u93cd\u56e7\u566f\u93b4\ufffd;
     * 2. \u934f\u8235\ue0bc\u93cd\u89c4\u5d41\u93b4\u5757\u68ff\u6d60\u950b\u7278\u6769\u6d9c\ue511\u93ba\u6391\u7c2d\u951b\u5c84\u73ee -> \u6d63\ufffd
     * 3. \u934f\u8235\ue0bc\u93cd\u89c4\u5d41\u93b4\u5757\u68ff\u9359\u75af\u7e58\u741b\u5c7e\u5e13\u6434\ufffd
     * @return
     */
    public static List<Room> getFreeRooms(){try{__CLR4_4_1zzluut6nxc.R.inc(120);
        __CLR4_4_1zzluut6nxc.R.inc(121);List<Room> temp = new ArrayList<>();
        __CLR4_4_1zzluut6nxc.R.inc(122);for(Room r : rooms){{
            __CLR4_4_1zzluut6nxc.R.inc(123);if((((r.getState().toString().equals("RoomState: Free"))&&(__CLR4_4_1zzluut6nxc.R.iget(124)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(125)==0&false))){{
                __CLR4_4_1zzluut6nxc.R.inc(126);temp.add(r);
            }
        }}
        }__CLR4_4_1zzluut6nxc.R.inc(127);Room arrayTemp [] = new Room[temp.size()];
        __CLR4_4_1zzluut6nxc.R.inc(128);for( int i =0;(((i<temp.size())&&(__CLR4_4_1zzluut6nxc.R.iget(129)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(130)==0&false));i++){{
            __CLR4_4_1zzluut6nxc.R.inc(131);arrayTemp[i]  = temp.get(i);
        }
        }__CLR4_4_1zzluut6nxc.R.inc(132);sortByValue2(arrayTemp);
        __CLR4_4_1zzluut6nxc.R.inc(133);List<Room> res = new ArrayList<>();
        __CLR4_4_1zzluut6nxc.R.inc(134);for( int j = 0;(((j<arrayTemp.length)&&(__CLR4_4_1zzluut6nxc.R.iget(135)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(136)==0&false));j++){{
            __CLR4_4_1zzluut6nxc.R.inc(137);res.add(arrayTemp[j]);
        }
        }__CLR4_4_1zzluut6nxc.R.inc(138);return res;
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}

    /**
     * \u93b5\u2541\ue583\u93b4\u5757\u68ff
     * \u93b4\u5757\u68ff\u9359\u5cf0\u51e1\u701b\u6a3a\u6e6a\u951b\u5c7e\u57e7\u95c2\u5bf8\u88ab\u9368\u5b29\u7b09\u935a\u581f\u7876\u951b\u5c7e\u57e7\u95c2\u6751\ue190\u95b2\u5fce\u7b09\u935a\u581f\u7876\u951b\u5c84\u5158\u6434\u65c0\u59cf\u9351\u54c4\u7d13\u752f\u9769\u7d1d\u5bee\u509a\u7236\u6dc7\u2103\u4f05\u7459\u4f79\u7974\u7487\u66e0\u6564\u6e1a\u5b36\u7d31
     * \u93c2\u677f\ue583\u93b4\u5757\u68ff\u9428\u52ea\u73af\u93cd\u517c\u7274\u93b9\ue1bd\u57e7\u95c2\u5bf8\u88ab\u9368\ufffd(type)\u935c\u5c7e\u57e7\u95c2\u6751\ue190\u95b2\u5fd3\u5585\u7039\u6c3e\u7d1d\u934f\u8702\u7d8b\u7edb\u682b\u6690\u6fe1\u5099\u7b05\u951b\ufffd
     * \u951b\ufffd1\u951b\u590b\u57e7\u95c2\u6751\u7180\u7ead\ufffd\u9359\ue219\u7d87\u6d5c\u70d8\u669f\u6d93\ufffd1\u6d5c\u7334\u7d1d\u6d60\u950b\u7278\u6d93\ufffd100\u951b\u5c7d\u5f72\u6d63\u5fce\u6c49\u93c1\u7248\u7621\u6fa7\u70b2\u59de1\u6d5c\u7334\u7d1d\u6d60\u950b\u7278\u6fa7\u70b2\u59de20
     * \u951b\ufffd2\u951b\u590a\u6e6a\u951b\ufffd1\u951b\u590c\u6b91\u9369\u8679\ue505\u6d93\u5a4f\u7d1d\u93cd\u89c4\u5d41\u6d93\u5d85\u6093\u93b4\u5757\u68ff\u7eeb\u8bf2\u7037\u6769\u6d9c\ue511\u6d60\u950b\u7278\u9354\u72b3\u579a\u951b\u5c7e\u7223\u9351\u55d8\u57e7\u93c3\u72b2\u59de\u93b4\u6136\u7d1d\u6942\u6a3c\u9a87\u93b4\u57ae\u59de\u93b4\ufffd50%,\u749e\ue044\u5d15\u93b4\u57ae\u59de\u93b4\ufffd100%\u951b\u5b7f
     * \u6d5c\u70d8\u669f\u95c4\u612c\u757e\u9366\ufffd4\u6d93\ue043\u6c49\u6d60\u30e5\u5534\u951b\u581d\u5bd8\u93b7\ufffd4\u6d5c\u7334\u7d1a
     * @param type
     * @param roomCode
     * @param capacity
     * @return
     */
    public static void addRoom(String type, int roomCode, int capacity){try{__CLR4_4_1zzluut6nxc.R.inc(139);
        __CLR4_4_1zzluut6nxc.R.inc(140);for(Room rm : rooms){{
            __CLR4_4_1zzluut6nxc.R.inc(141);if((((rm.getRoomCode()==roomCode)&&(__CLR4_4_1zzluut6nxc.R.iget(142)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(143)==0&false))){{
                __CLR4_4_1zzluut6nxc.R.inc(144);throw new IllegalArgumentException("Room Exist:"+roomCode);
            }
        }}
        }__CLR4_4_1zzluut6nxc.R.inc(145);double price  = 100;
        __CLR4_4_1zzluut6nxc.R.inc(146);price+=(capacity-1)*20;
        __CLR4_4_1zzluut6nxc.R.inc(147);if((((type.equals("Advanced Room"))&&(__CLR4_4_1zzluut6nxc.R.iget(148)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(149)==0&false))){{
            __CLR4_4_1zzluut6nxc.R.inc(150);price*=1.5;
        }}else {__CLR4_4_1zzluut6nxc.R.inc(151);if((((type.equals("Deluxe Room"))&&(__CLR4_4_1zzluut6nxc.R.iget(152)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(153)==0&false))){{
            __CLR4_4_1zzluut6nxc.R.inc(154);price*=2;
        }
        }}__CLR4_4_1zzluut6nxc.R.inc(155);Room temp = new Room(roomCode,type,capacity,price);
        __CLR4_4_1zzluut6nxc.R.inc(156);rooms.add(temp);
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}

    /**
     * \u6d60\u5ea1\u57aa\u741b\u3124\u8151\u9352\u72b2\u5e53\u93b4\u5757\u68ff
     * \u947b\u30e6\u57e7\u95c2\u7fe0\u7b09\u701b\u6a3a\u6e6a\u93b4\u6828\u57e7\u95c2\u7fe0\u7b09\u93c4\ue21c\u2516\u95c2\u832c\u59f8\u93ac\u4f8a\u7d1d\u9352\u6b10\u59cf\u9351\u54c4\u7d13\u752f\u9769\u7d1d\u5bee\u509a\u7236\u6dc7\u2103\u4f05\u93cd\u714e\u7d21\u9359\u509d\ufffd\u51a9\u7974\u7487\u66e0\u6564\u6e1a\ufffd
     * @param roomCode
     */
    public static void removeRoomFromList(int roomCode){try{__CLR4_4_1zzluut6nxc.R.inc(157);
        __CLR4_4_1zzluut6nxc.R.inc(158);Room temp  = null;
        __CLR4_4_1zzluut6nxc.R.inc(159);for(Room r: rooms){{
            __CLR4_4_1zzluut6nxc.R.inc(160);if ((((r.getRoomCode() == roomCode)&&(__CLR4_4_1zzluut6nxc.R.iget(161)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(162)==0&false))){{
                __CLR4_4_1zzluut6nxc.R.inc(163);temp = r;
            }
        }}
        }__CLR4_4_1zzluut6nxc.R.inc(164);if((((temp==null)&&(__CLR4_4_1zzluut6nxc.R.iget(165)!=0|true))||(__CLR4_4_1zzluut6nxc.R.iget(166)==0&false))){{
            __CLR4_4_1zzluut6nxc.R.inc(167);throw new IllegalArgumentException("Room not Exist:"+roomCode);
        }
        }__CLR4_4_1zzluut6nxc.R.inc(168);rooms.remove(temp);
    }finally{__CLR4_4_1zzluut6nxc.R.flushNeeded();}}
}
