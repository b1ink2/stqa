/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * @comment \u93b4\u5757\u68ff\u9418\u8235\ufffd\u4f79\u5e34\u9359\uff4f\u7d1d\u7039\u6c2b\u7b9f
 */
public interface RoomState {

    void book(Room room);

    void unsubscribe(Room room);

    void checkIn(Room room);

    void checkOut(Room room);

}
