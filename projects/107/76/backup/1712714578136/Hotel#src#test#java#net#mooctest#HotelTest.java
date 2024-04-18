package net.mooctest;
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
        hotel.addRoom(RoomType.ADVANCED,122,7);
        assertEquals(1,hotel.rooms.size());
        hotel.addRoom(RoomType.ADVANCED, 121, 7);
        try {
            hotel.queryRoom(122);
        } catch (IllegalArgumentException e){
        }

        try {
            hotel.queryRoom(123);
        } catch (IllegalArgumentException e){

        }

        hotel.printAllRoomsInfo();

        List<Room> rooms = hotel.getFreeRooms();
        List<Room> expRooms = new ArrayList<Room>();
        expRooms.add(new Room(121, RoomType.ADVANCED, 7, 220));
        assertEquals(expRooms, rooms);
    }
}