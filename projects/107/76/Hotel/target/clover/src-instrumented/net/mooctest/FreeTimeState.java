/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

public class FreeTimeState implements RoomState {public static class __CLR4_4_1nnluut6nvw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813920933L,8589935092L,35,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String sep = System.getProperty("line.separator");

    public void book(Room room) {try{__CLR4_4_1nnluut6nvw.R.inc(23);
        __CLR4_4_1nnluut6nvw.R.inc(24);System.out.print("Operation: Book Room" + sep
                + "Room: " + room.getRoomCode() +sep
                +"Result: Success" + sep);
        __CLR4_4_1nnluut6nvw.R.inc(25);room.setState(new BookedState());
    }finally{__CLR4_4_1nnluut6nvw.R.flushNeeded();}}
    public void unsubscribe(Room room) {try{__CLR4_4_1nnluut6nvw.R.inc(26);
        __CLR4_4_1nnluut6nvw.R.inc(27);throw new IllegalStateException("Cannot unsubscribe under current state, "+this.toString());
    }finally{__CLR4_4_1nnluut6nvw.R.flushNeeded();}}

    public void checkIn(Room room) {try{__CLR4_4_1nnluut6nvw.R.inc(28);
        __CLR4_4_1nnluut6nvw.R.inc(29);System.out.print("Operation: Check In" + sep
                + "Room: " + room.getRoomCode() +sep
                +"Result: Success" + sep);
        __CLR4_4_1nnluut6nvw.R.inc(30);room.setState(new CheckInState());
    }finally{__CLR4_4_1nnluut6nvw.R.flushNeeded();}}

    public void checkOut(Room room) {try{__CLR4_4_1nnluut6nvw.R.inc(31);
        __CLR4_4_1nnluut6nvw.R.inc(32);throw new IllegalStateException("Cannot check out under current state, " + this.toString());
    }finally{__CLR4_4_1nnluut6nvw.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1nnluut6nvw.R.inc(33);
        __CLR4_4_1nnluut6nvw.R.inc(34);return "RoomState: Free";
    }finally{__CLR4_4_1nnluut6nvw.R.flushNeeded();}}
}
