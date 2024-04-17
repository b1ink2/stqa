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
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(121, RoomType.DELUXE, 7, 440));
        rooms.add(new Room(122, RoomType.ADVANCED, 7, 330));
        hotel.addRoom(RoomType.ADVANCED,121,7);
        assertEquals(1,hotel.rooms.size());
        hotel.addRoom(RoomType.DELUXE, 122, 7);
        try {
            hotel.queryRoom(122);
        } catch (IllegalArgumentException e){
        }

        try {
            hotel.queryRoom(123);
        } catch (IllegalArgumentException e){

        }

        hotel.printAllRoomsInfo();

        hotel.removeRoomFromList(122);

        try {
            hotel.removeRoomFromList(123
            );
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
        }
        hotel.getFreeRooms();
    }
}
