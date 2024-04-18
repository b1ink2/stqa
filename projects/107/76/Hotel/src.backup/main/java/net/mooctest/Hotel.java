package net.mooctest;

import net.mooctest.Room;

import java.util.*;

/**
 * @author: Diors.Po
 * @Email: 171256175@qq.com
 * @date 2019-09-16 09:56
 */
public class Hotel {
    public static List<Room> rooms = new ArrayList<>();
    private static Map<String,Integer> roomState ;
    private static Map<String,Integer> roomType ;
    private static Map<String,Integer> roomType2;

    static {
        init();
    }

    public static void main (String args [] ){
        System.out.println(Integer.MAX_VALUE);
    }


    private static void init (){
        rooms = new ArrayList<>();
        roomState = new HashMap<>();
        roomType = new HashMap<>();
        roomType2 = new HashMap<>();
        roomType.put("Deluxe Room",2);
        roomType.put("Advanced Room",3);
        roomType.put("Standard Room",1);
        roomType2.put("Deluxe Room",3);
        roomType2.put("Advanced Room",2);
        roomType2.put("Standard Room",1);
        roomState.put("RoomState: Free",3);
        roomState.put("RoomState: CheckIn",2);
        roomState.put("RoomState: Booked",1);
    }

    public Hotel(){
        init();
    }


    /**
     * 根据输入的房间号查询房间信息，若不存在则抛出异常
     * @param roomCode
     */
    public static void queryRoom(final int roomCode){
        Room temp = null;

        for (Room r:rooms) {
            if(r.getRoomCode()==roomCode){
                temp = r;
                break;
            }
        }
        if(temp == null){
            throw new IllegalArgumentException("Room not exist: "+roomCode);
        }else{
            System.out.print(temp.toString());
        }
    }


    private static void printRoomInfo ( Room temp){
        System.out.print(temp.toString());
    }

    /**
     * 对所有房间进行排序并格式化打印输出，打印格式参�?�测试用例，房间排序优先级如下：
     * 1. 首先根据房间状�?�排序，空闲 -> 预定 -> 入住;
     * 2. 其次根据房间类型的字典序进行排序;
     * 3. 其次根据房间价格进行排序，高 -> �?
     * 4. 其次根据房间号进行排�?,  �?->�?
     */
    public static void printAllRoomsInfo(){

        Room [] data = new Room[rooms.size()];
        for(int i =0;i<rooms.size();i++){
            data[i] = rooms.get(i);
        }
        sortByValue(data);
        for(int j = 0 ;j<data.length;j++){
            printRoomInfo(data[j]);
        }
    }

    private static void sortByValue(Room [] data){
        for(int i =0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(getValue(data[i])<getValue(data[j])){
                    swap(data,i,j);
                }
            }
        }
    }

    private static int getValue (Room data ){
        int res = 0 ;
        res+=data.getRoomCode();
        res+=data.getPrice()*1000;
        res+=  roomType.get(data.getType())*1000000; // 根据上面的规则，房间价格不超�?1000 也就是三位数
        res+=roomState.get(data.getState().toString())*10000000;
        return res;
    }



    private static void sortByValue2(Room [] data){
        for(int i =0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(getValue2(data[i])<getValue2(data[j])){
                    swap(data,i,j);
                }
            }
        }
    }



    /**
     * 交换
     * @param data
     * @param left
     * @param right
     */
    private static void swap(Room [] data , int left ,int right ){
        Room temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }
    private static int getValue2 (Room data ){
        int res = 0 ;
        res+=data.getRoomCode();
        res+=data.getPrice()*1000;
        res+=roomType2.get(data.getType())*10000000;
        return res;
    }
    /**
     * 查询�?有空闲状态的房间，排序后返回，并打印返回的RoomList，排序优先级如下�?
     * 1. 首先根据房间类型的字典序进行排序，豪华房 -> 高级�? -> 标准�?;
     * 2. 其次根据房间价格进行排序，高 -> �?
     * 3. 其次根据房间号进行排�?
     * @return
     */
    public static List<Room> getFreeRooms(){
        List<Room> temp = new ArrayList<>();
        for(Room r : rooms){
            if(r.getState().toString().equals("RoomState: Free")){
                temp.add(r);
            }
        }
        Room arrayTemp [] = new Room[temp.size()];
        for( int i =0;i<temp.size();i++){
            arrayTemp[i]  = temp.get(i);
        }
        sortByValue2(arrayTemp);
        List<Room> res = new ArrayList<>();
        for( int j = 0;j<arrayTemp.length;j++){
            res.add(arrayTemp[j]);
        }
        return res;
    }

    /**
     * 扩增房间
     * 房间号已存在，房间类型不合法，房间容量不合法，都应抛出异常，异常信息见测试用例；
     * 新增房间的价格根据房间类�?(type)和房间容量决定，具体策略如下�?
     * �?1）房间基�?可住人数�?1人，价格�?100，可住人数每增加1人，价格增加20
     * �?2）在�?1）的基础上，根据不同房间类型进行价格加成，标准房无加成，高级房加�?50%,豪华房加�?100%，\
     * 人数限定�?4个人以内（包�?4人）
     * @param type
     * @param roomCode
     * @param capacity
     * @return
     */
    public static void addRoom(String type, int roomCode, int capacity){
        for(Room rm : rooms){
            if(rm.getRoomCode()==roomCode){
                throw new IllegalArgumentException("Room Exist:"+roomCode);
            }
        }
        double price  = 100;
        price+=(capacity-1)*20;
        if(type.equals("Advanced Room")){
            price*=1.5;
        }else if(type.equals("Deluxe Room")){
            price*=2;
        }
        Room temp = new Room(roomCode,type,capacity,price);
        rooms.add(temp);
    }

    /**
     * 从列表中删去房间
     * 若房间不存在或房间不是空闲状态，则抛出异常，异常信息格式参�?�测试用�?
     * @param roomCode
     */
    public static void removeRoomFromList(int roomCode){
        Room temp  = null;
        for(Room r: rooms){
            if (r.getRoomCode() == roomCode){
                temp = r;
            }
        }
        if(temp==null){
            throw new IllegalArgumentException("Room not Exist:"+roomCode);
        }
        rooms.remove(temp);
    }
}
