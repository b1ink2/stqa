/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

public class Room {public static class __CLR4_4_19l9lluut6o05{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private int roomCode;   //\u93b4\u5757\u68ff\u9359\ufffd
    private String type;    //\u93b4\u5757\u68ff\u7eeb\u8bf2\u7037
    private int capacity;   //\u9359\ue219\u7d87\u6d5c\u70d8\u669f
    private double price;   //\u93b4\u5757\u68ff\u6d60\u950b\u7278
    private RoomState state;    //\u93b4\u5757\u68ff\u9418\u8235\ufffd\ufffd
    String sep = System.getProperty("line.separator");

    public Room(){try{__CLR4_4_19l9lluut6o05.R.inc(345);
        __CLR4_4_19l9lluut6o05.R.inc(346);this.setState(new FreeTimeState());
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public Room(int roomCode, String type, int capacity, double price){try{__CLR4_4_19l9lluut6o05.R.inc(347);
        __CLR4_4_19l9lluut6o05.R.inc(348);this.setRoomCode(roomCode);
        __CLR4_4_19l9lluut6o05.R.inc(349);this.setType(type);
        __CLR4_4_19l9lluut6o05.R.inc(350);this.setCapacity(capacity);
        __CLR4_4_19l9lluut6o05.R.inc(351);this.setState(new FreeTimeState());
        __CLR4_4_19l9lluut6o05.R.inc(352);this.setPrice(price);
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public void book(){try{__CLR4_4_19l9lluut6o05.R.inc(353);
        __CLR4_4_19l9lluut6o05.R.inc(354);this.state.book(this);
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public void unsubscribe(){try{__CLR4_4_19l9lluut6o05.R.inc(355);
        __CLR4_4_19l9lluut6o05.R.inc(356);this.state.unsubscribe(this);
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public void checkIn(){try{__CLR4_4_19l9lluut6o05.R.inc(357);
        __CLR4_4_19l9lluut6o05.R.inc(358);this.state.checkIn(this);
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public void checkOut(){try{__CLR4_4_19l9lluut6o05.R.inc(359);
        __CLR4_4_19l9lluut6o05.R.inc(360);this.state.checkOut(this);
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    /**
     * @param roomCode
     */
    public void setRoomCode(int roomCode) {try{__CLR4_4_19l9lluut6o05.R.inc(361);
        __CLR4_4_19l9lluut6o05.R.inc(362);if ((((roomCode>999 || roomCode <= 100 || (""+roomCode).contains("00"))&&(__CLR4_4_19l9lluut6o05.R.iget(363)!=0|true))||(__CLR4_4_19l9lluut6o05.R.iget(364)==0&false)))
            {__CLR4_4_19l9lluut6o05.R.inc(365);throw new IllegalArgumentException("Illegal RoomCode: " + roomCode);
        }__CLR4_4_19l9lluut6o05.R.inc(366);this.roomCode = roomCode;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    /**
     * \u93b4\u5757\u68ff\u7eeb\u8bf2\u7037
     * @param type
     */
    public void setType(String type) {try{__CLR4_4_19l9lluut6o05.R.inc(367);
        __CLR4_4_19l9lluut6o05.R.inc(368);if ((((!RoomType.isRoomType(type))&&(__CLR4_4_19l9lluut6o05.R.iget(369)!=0|true))||(__CLR4_4_19l9lluut6o05.R.iget(370)==0&false)))
            {__CLR4_4_19l9lluut6o05.R.inc(371);throw new IllegalArgumentException("Type not exists: " + type);
        }__CLR4_4_19l9lluut6o05.R.inc(372);this.type = type;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public void setCapacity(int capacity) {try{__CLR4_4_19l9lluut6o05.R.inc(373);
        __CLR4_4_19l9lluut6o05.R.inc(374);if ((((capacity<1 || capacity > 10)&&(__CLR4_4_19l9lluut6o05.R.iget(375)!=0|true))||(__CLR4_4_19l9lluut6o05.R.iget(376)==0&false)))
            {__CLR4_4_19l9lluut6o05.R.inc(377);throw new IllegalArgumentException("Capacity should between 0~10.");
        }__CLR4_4_19l9lluut6o05.R.inc(378);this.capacity = capacity;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    /**
     * \u7481\u5267\u7586\u6d60\u950b\u7278
     */
    public void setPrice(double price) {try{__CLR4_4_19l9lluut6o05.R.inc(379);
        __CLR4_4_19l9lluut6o05.R.inc(380);if((((price<=0)&&(__CLR4_4_19l9lluut6o05.R.iget(381)!=0|true))||(__CLR4_4_19l9lluut6o05.R.iget(382)==0&false)))
            {__CLR4_4_19l9lluut6o05.R.inc(383);throw new IllegalArgumentException("Price cannot less than zero: "+price);
        }__CLR4_4_19l9lluut6o05.R.inc(384);if(((((price+"").length()-(price+"").indexOf(".")-1 > 2)&&(__CLR4_4_19l9lluut6o05.R.iget(385)!=0|true))||(__CLR4_4_19l9lluut6o05.R.iget(386)==0&false))){{
            __CLR4_4_19l9lluut6o05.R.inc(387);throw new IllegalArgumentException("Price length is wrong: "+price);
        }
        }__CLR4_4_19l9lluut6o05.R.inc(388);this.price = price;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public void setState(RoomState state) {try{__CLR4_4_19l9lluut6o05.R.inc(389);
        __CLR4_4_19l9lluut6o05.R.inc(390);this.state = state;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public int getRoomCode() {try{__CLR4_4_19l9lluut6o05.R.inc(391);
        __CLR4_4_19l9lluut6o05.R.inc(392);return roomCode;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public String getType() {try{__CLR4_4_19l9lluut6o05.R.inc(393);
        __CLR4_4_19l9lluut6o05.R.inc(394);return type;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public int getCapacity() {try{__CLR4_4_19l9lluut6o05.R.inc(395);
        __CLR4_4_19l9lluut6o05.R.inc(396);return capacity;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public double getPrice() {try{__CLR4_4_19l9lluut6o05.R.inc(397);
        __CLR4_4_19l9lluut6o05.R.inc(398);return price;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public RoomState getState() {try{__CLR4_4_19l9lluut6o05.R.inc(399);
        __CLR4_4_19l9lluut6o05.R.inc(400);return state;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}

    public String toString(){try{__CLR4_4_19l9lluut6o05.R.inc(401);
        __CLR4_4_19l9lluut6o05.R.inc(402);return "RoomCode: " + this.roomCode + sep
                + "RoomType: " + this.type + sep
                + "Capacity: " + this.capacity + sep
                + this.state.toString() + sep
                + "Price: "+this.price + sep;
    }finally{__CLR4_4_19l9lluut6o05.R.flushNeeded();}}
}
