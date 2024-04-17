/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.evosuite.shaded.org.hibernate.criterion.NullExpression;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class HotelTest {static class __CLR4_4_1e3e3luut6o4d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0031\u0030\u0037\u005c\u005c\u0037\u0036\u005c\u005c\u0048\u006f\u0074\u0065\u006c\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712813921426L,8589935092L,545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test(timeout = 4000)
    public void test1() {__CLR4_4_1e3e3luut6o4d.R.globalSliceStart(getClass().getName(),507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beue3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e3e3luut6o4d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e3e3luut6o4d.R.globalSliceEnd(getClass().getName(),"net.mooctest.HotelTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),507,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beue3(){try{__CLR4_4_1e3e3luut6o4d.R.inc(507);
        __CLR4_4_1e3e3luut6o4d.R.inc(508);Hotel hotel = new Hotel();
        __CLR4_4_1e3e3luut6o4d.R.inc(509);List<Room> rooms = new ArrayList<>();
        __CLR4_4_1e3e3luut6o4d.R.inc(510);rooms.add(new Room(121, RoomType.DELUXE, 7, 440));
        __CLR4_4_1e3e3luut6o4d.R.inc(511);rooms.add(new Room(122, RoomType.ADVANCED, 7, 330));
        __CLR4_4_1e3e3luut6o4d.R.inc(512);hotel.addRoom(RoomType.ADVANCED, 121, 7);
        __CLR4_4_1e3e3luut6o4d.R.inc(513);assertEquals(1, hotel.rooms.size());
        __CLR4_4_1e3e3luut6o4d.R.inc(514);hotel.addRoom(RoomType.DELUXE, 122, 7);
        __CLR4_4_1e3e3luut6o4d.R.inc(515);try {
            __CLR4_4_1e3e3luut6o4d.R.inc(516);hotel.queryRoom(122);
        } catch (IllegalArgumentException e) {
        }

        __CLR4_4_1e3e3luut6o4d.R.inc(517);try {
            __CLR4_4_1e3e3luut6o4d.R.inc(518);hotel.queryRoom(123);
        } catch (IllegalArgumentException e) {

        }

        __CLR4_4_1e3e3luut6o4d.R.inc(519);hotel.printAllRoomsInfo();

        __CLR4_4_1e3e3luut6o4d.R.inc(520);try {
            __CLR4_4_1e3e3luut6o4d.R.inc(521);hotel.removeRoomFromList(122);
        } catch (IllegalArgumentException e) {

        }

        __CLR4_4_1e3e3luut6o4d.R.inc(522);try {
            __CLR4_4_1e3e3luut6o4d.R.inc(523);hotel.removeRoomFromList(123);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }
        __CLR4_4_1e3e3luut6o4d.R.inc(524);hotel.getFreeRooms();
    }finally{__CLR4_4_1e3e3luut6o4d.R.flushNeeded();}}

    @Test(timeout = 4000)
    public void test2() {__CLR4_4_1e3e3luut6o4d.R.globalSliceStart(getClass().getName(),525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1e3e3luut6o4d.R.rethrow($CLV_t2$);}finally{__CLR4_4_1e3e3luut6o4d.R.globalSliceEnd(getClass().getName(),"net.mooctest.HotelTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bel(){try{__CLR4_4_1e3e3luut6o4d.R.inc(525); // test manager
        __CLR4_4_1e3e3luut6o4d.R.inc(526);Hotel hotel = new Hotel();
        __CLR4_4_1e3e3luut6o4d.R.inc(527);hotel.addRoom(RoomType.ADVANCED, 101, 5);
        __CLR4_4_1e3e3luut6o4d.R.inc(528);hotel.addRoom(RoomType.DELUXE, 102, 6);
        __CLR4_4_1e3e3luut6o4d.R.inc(529);hotel.addRoom(RoomType.STANDARD, 103, 4);
        __CLR4_4_1e3e3luut6o4d.R.inc(530);hotel.addRoom(RoomType.ADVANCED, 104, 7);
        __CLR4_4_1e3e3luut6o4d.R.inc(531);hotel.addRoom(RoomType.DELUXE, 105, 3);

        __CLR4_4_1e3e3luut6o4d.R.inc(532);Manager manager = new Manager();
        __CLR4_4_1e3e3luut6o4d.R.inc(533);try {
            __CLR4_4_1e3e3luut6o4d.R.inc(534);double cost = manager.checkIn(8, 101);
            __CLR4_4_1e3e3luut6o4d.R.inc(535);String romanCost = manager.transferPrice(cost);
        } catch (Exception e) {
            // TODO: handle exception
        }
        __CLR4_4_1e3e3luut6o4d.R.inc(536);try {
            __CLR4_4_1e3e3luut6o4d.R.inc(537);double cost1 = manager.checkIn(4, 102);
            __CLR4_4_1e3e3luut6o4d.R.inc(538);double cost2 = manager.checkIn(1, 103);
            __CLR4_4_1e3e3luut6o4d.R.inc(539);double cost3 = manager.checkIn(7, 104);
            __CLR4_4_1e3e3luut6o4d.R.inc(540);double cost4 = manager.checkIn(0, 105);
        } catch (IllegalArgumentException e){

        }

        __CLR4_4_1e3e3luut6o4d.R.inc(541);try{
            __CLR4_4_1e3e3luut6o4d.R.inc(542);double cost = manager.checkIn(2, 106);
        } catch(NullPointerException e) {

        }
        __CLR4_4_1e3e3luut6o4d.R.inc(543);manager.transferPrice(4000);
        __CLR4_4_1e3e3luut6o4d.R.inc(544);manager.transferPrice(-1);
    }finally{__CLR4_4_1e3e3luut6o4d.R.flushNeeded();}}
}
