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
     * ��������ķ���Ų�ѯ������Ϣ�������������׳��쳣
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
     * �����з���������򲢸�ʽ����ӡ�������ӡ��ʽ�ο����������������������ȼ����£�
     * 1. ���ȸ��ݷ���״̬���򣬿��� -> Ԥ�� -> ��ס;
     * 2. ��θ��ݷ������͵��ֵ����������;
     * 3. ��θ��ݷ���۸�������򣬸� -> ��
     * 4. ��θ��ݷ���Ž�������,  ��->��
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
        res+=  roomType.get(data.getType())*1000000; // ��������Ĺ��򣬷���۸񲻳���1000 Ҳ������λ��
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
     * ����
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
     * ��ѯ���п���״̬�ķ��䣬����󷵻أ�����ӡ���ص�RoomList���������ȼ����£�
     * 1. ���ȸ��ݷ������͵��ֵ���������򣬺����� -> �߼��� -> ��׼��;
     * 2. ��θ��ݷ���۸�������򣬸� -> ��
     * 3. ��θ��ݷ���Ž�������
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
     * ��������
     * ������Ѵ��ڣ��������Ͳ��Ϸ��������������Ϸ�����Ӧ�׳��쳣���쳣��Ϣ������������
     * ��������ļ۸���ݷ�������(type)�ͷ�����������������������£�
     * ��1�����������ס����Ϊ1�ˣ��۸�Ϊ100����ס����ÿ����1�ˣ��۸�����20
     * ��2���ڣ�1���Ļ����ϣ����ݲ�ͬ�������ͽ��м۸�ӳɣ���׼���޼ӳɣ��߼����ӳ�50%,�������ӳ�100%��\
     * �����޶���4�������ڣ�����4�ˣ�
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
     * ���б���ɾȥ����
     * �����䲻���ڻ򷿼䲻�ǿ���״̬�����׳��쳣���쳣��Ϣ��ʽ�ο���������
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
