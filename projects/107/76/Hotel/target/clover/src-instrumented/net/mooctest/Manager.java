/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Optional;

public class Manager {public static class __CLR4_4_14p4pluut6ny7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * \u7f01\u5fd5\u608a\u6d93\u54c4\ue179\u93b4\u5cf0\u59d9\u941e\u55d7\u53c6\u6d63\u5fe5\u7d1d\u9a9e\u8235\u7274\u93b9\ue1bc\u53c6\u6d63\u5fd3\u3049\u93c1\u9881\u7b09\u935a\u5c7c\u97e9\u9359\u693e\u7b09\u935a\u5c7e\u59cc\u93b5\uff44\u7d2d\u93af\ufffd
     * @param days
     * @param roomCode
     * @return
     */
    public double checkIn(int days, int roomCode){try{__CLR4_4_14p4pluut6ny7.R.inc(169);
        __CLR4_4_14p4pluut6ny7.R.inc(170);Optional<Room> first = Hotel.rooms.stream().filter(room -> room.getRoomCode() == roomCode).findFirst();
        __CLR4_4_14p4pluut6ny7.R.inc(171);if ((((!first.isPresent())&&(__CLR4_4_14p4pluut6ny7.R.iget(172)!=0|true))||(__CLR4_4_14p4pluut6ny7.R.iget(173)==0&false)))
            {__CLR4_4_14p4pluut6ny7.R.inc(174);throw new NullPointerException("Room not exists: " + roomCode);
        }__CLR4_4_14p4pluut6ny7.R.inc(175);Room room = first.get();
        __CLR4_4_14p4pluut6ny7.R.inc(176);room.checkIn();
        __CLR4_4_14p4pluut6ny7.R.inc(177);if ((((days>7)&&(__CLR4_4_14p4pluut6ny7.R.iget(178)!=0|true))||(__CLR4_4_14p4pluut6ny7.R.iget(179)==0&false)))
            {__CLR4_4_14p4pluut6ny7.R.inc(180);return room.getPrice() * days * 0.8;
        }else {__CLR4_4_14p4pluut6ny7.R.inc(181);if ((((days>=4)&&(__CLR4_4_14p4pluut6ny7.R.iget(182)!=0|true))||(__CLR4_4_14p4pluut6ny7.R.iget(183)==0&false)))
            {__CLR4_4_14p4pluut6ny7.R.inc(184);return room.getPrice() * days * 0.9;
        }else {__CLR4_4_14p4pluut6ny7.R.inc(185);if ((((days>0)&&(__CLR4_4_14p4pluut6ny7.R.iget(186)!=0|true))||(__CLR4_4_14p4pluut6ny7.R.iget(187)==0&false)))
            {__CLR4_4_14p4pluut6ny7.R.inc(188);return room.getPrice() * days;
        }else
            {__CLR4_4_14p4pluut6ny7.R.inc(189);throw new IllegalArgumentException("Days should larger than zero.");
    }}}}finally{__CLR4_4_14p4pluut6ny7.R.flushNeeded();}}

    /**
     \u6d93\u8f70\u7c21\u9365\u4ecb\u6aaf\u9356\u682d\u6e36\u7455\u4f8a\u7d1d\u95b0\u6391\u7c35\u95c7\ufffd\u7455\u4f78\u76a2\u6d60\u950b\u7278\u675e\ue100\u5bf2\u93b4\u612e\u7d8f\u6939\ue101\u669f\u701b\u694b\u7d1d
     */
    public String transferPrice(double price){try{__CLR4_4_14p4pluut6ny7.R.inc(190);
        __CLR4_4_14p4pluut6ny7.R.inc(191);int pc = (int)Math.round(price);
        __CLR4_4_14p4pluut6ny7.R.inc(192);return intToRoman(pc);
    }finally{__CLR4_4_14p4pluut6ny7.R.flushNeeded();}}

    private String intToRoman(int num) {try{__CLR4_4_14p4pluut6ny7.R.inc(193);
        __CLR4_4_14p4pluut6ny7.R.inc(194);int[] numArray=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        __CLR4_4_14p4pluut6ny7.R.inc(195);String[] romaArray=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        __CLR4_4_14p4pluut6ny7.R.inc(196);StringBuffer sb=new StringBuffer();

        __CLR4_4_14p4pluut6ny7.R.inc(197);if((((num<0||num>3999)&&(__CLR4_4_14p4pluut6ny7.R.iget(198)!=0|true))||(__CLR4_4_14p4pluut6ny7.R.iget(199)==0&false)))
            {__CLR4_4_14p4pluut6ny7.R.inc(200);return null;
        }__CLR4_4_14p4pluut6ny7.R.inc(201);for(int i=0;(((i<numArray.length)&&(__CLR4_4_14p4pluut6ny7.R.iget(202)!=0|true))||(__CLR4_4_14p4pluut6ny7.R.iget(203)==0&false));i++)
        {{
            __CLR4_4_14p4pluut6ny7.R.inc(204);int temp=num/numArray[i];
            __CLR4_4_14p4pluut6ny7.R.inc(205);while((((temp>0)&&(__CLR4_4_14p4pluut6ny7.R.iget(206)!=0|true))||(__CLR4_4_14p4pluut6ny7.R.iget(207)==0&false)))
            {{
                __CLR4_4_14p4pluut6ny7.R.inc(208);sb.append(romaArray[i]);
                __CLR4_4_14p4pluut6ny7.R.inc(209);temp--;
            }
            }__CLR4_4_14p4pluut6ny7.R.inc(210);num=num%numArray[i];
        }
        }__CLR4_4_14p4pluut6ny7.R.inc(211);return sb.toString();
    }finally{__CLR4_4_14p4pluut6ny7.R.flushNeeded();}}




}
