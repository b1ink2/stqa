package net.mooctest;

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

public class HotelTest {

    @Test(timeout = 4000)
    public void test1() {
        Hotel hotel = new Hotel();
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(121, RoomType.DELUXE, 7, 440));
        rooms.add(new Room(122, RoomType.ADVANCED, 7, 330));
        hotel.addRoom(RoomType.ADVANCED, 121, 7);
        assertEquals(1, hotel.rooms.size());
        hotel.addRoom(RoomType.DELUXE, 122, 7);
        try {
            hotel.queryRoom(122);
        } catch (IllegalArgumentException e) {
        }

        try {
            hotel.queryRoom(123);
        } catch (IllegalArgumentException e) {

        }

        hotel.printAllRoomsInfo();

        try {
            hotel.removeRoomFromList(122);
        } catch (IllegalArgumentException e) {

        }

        try {
            hotel.removeRoomFromList(123);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }
        hotel.getFreeRooms();
    }

    @Test(timeout = 4000)
    public void test2() { // test manager
        Hotel hotel = new Hotel();
        hotel.addRoom(RoomType.ADVANCED, 101, 5);
        hotel.addRoom(RoomType.DELUXE, 102, 6);
        hotel.addRoom(RoomType.STANDARD, 103, 4);
        hotel.addRoom(RoomType.ADVANCED, 104, 7);
        hotel.addRoom(RoomType.DELUXE, 105, 3);

        Manager manager = new Manager();
        try {
            double cost = manager.checkIn(8, 101);
            String romanCost = manager.transferPrice(cost);
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            double cost1 = manager.checkIn(4, 102);
            double cost2 = manager.checkIn(1, 103);
            double cost3 = manager.checkIn(7, 104);
            double cost4 = manager.checkIn(0, 105);
        } catch (IllegalArgumentException e){

        }

        try{
            double cost = manager.checkIn(2, 106);
        } catch(NullPointerException e) {

        }
        manager.transferPrice(4000);
        manager.transferPrice(-1);
    }
}
