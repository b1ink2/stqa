package net.mooctest;

import java.util.Optional;

public class Manager {

    /**
     * 经理为客户办理入住，并根据入住天数不同享受不同折扣优�?
     * @param days
     * @param roomCode
     * @return
     */
    public double checkIn(int days, int roomCode){
        Optional<Room> first = Hotel.rooms.stream().filter(room -> room.getRoomCode() == roomCode).findFirst();
        if (!first.isPresent())
            throw new NullPointerException("Room not exists: " + roomCode);
        Room room = first.get();
        room.checkIn();
        if (days>7)
            return room.getPrice() * days * 0.8;
        else if (days>=4)
            return room.getPrice() * days * 0.9;
        else if (days>0)
            return room.getPrice() * days;
        else
            throw new IllegalArgumentException("Days should larger than zero.");
    }

    /**
     为了国际化需要，酒店�?要将价格转化成罗马数字，
     */
    public String transferPrice(double price){
        int pc = (int)Math.round(price);
        return intToRoman(pc);
    }

    private String intToRoman(int num) {
        int[] numArray=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romaArray=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb=new StringBuffer();

        if(num<0||num>3999)
            return null;
        for(int i=0;i<numArray.length;i++)
        {
            int temp=num/numArray[i];
            while(temp>0)
            {
                sb.append(romaArray[i]);
                temp--;
            }
            num=num%numArray[i];
        }
        return sb.toString();
    }




}
