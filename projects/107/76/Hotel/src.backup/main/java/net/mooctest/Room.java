package net.mooctest;

public class Room {
    private int roomCode;   //房间�?
    private String type;    //房间类型
    private int capacity;   //可住人数
    private double price;   //房间价格
    private RoomState state;    //房间状�??
    String sep = System.getProperty("line.separator");

    public Room(){
        this.setState(new FreeTimeState());
    }

    public Room(int roomCode, String type, int capacity, double price){
        this.setRoomCode(roomCode);
        this.setType(type);
        this.setCapacity(capacity);
        this.setState(new FreeTimeState());
        this.setPrice(price);
    }

    public void book(){
        this.state.book(this);
    }

    public void unsubscribe(){
        this.state.unsubscribe(this);
    }

    public void checkIn(){
        this.state.checkIn(this);
    }

    public void checkOut(){
        this.state.checkOut(this);
    }

    /**
     * @param roomCode
     */
    public void setRoomCode(int roomCode) {
        if (roomCode>999 || roomCode <= 100 || (""+roomCode).contains("00"))
            throw new IllegalArgumentException("Illegal RoomCode: " + roomCode);
        this.roomCode = roomCode;
    }

    /**
     * 房间类型
     * @param type
     */
    public void setType(String type) {
        if (!RoomType.isRoomType(type))
            throw new IllegalArgumentException("Type not exists: " + type);
        this.type = type;
    }

    public void setCapacity(int capacity) {
        if (capacity<1 || capacity > 10)
            throw new IllegalArgumentException("Capacity should between 0~10.");
        this.capacity = capacity;
    }

    /**
     * 设置价格
     */
    public void setPrice(double price) {
        if(price<=0)
            throw new IllegalArgumentException("Price cannot less than zero: "+price);
        if((price+"").length()-(price+"").indexOf(".")-1 > 2){
            throw new IllegalArgumentException("Price length is wrong: "+price);
        }
        this.price = price;
    }

    public void setState(RoomState state) {
        this.state = state;
    }

    public int getRoomCode() {
        return roomCode;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public RoomState getState() {
        return state;
    }

    public String toString(){
        return "RoomCode: " + this.roomCode + sep
                + "RoomType: " + this.type + sep
                + "Capacity: " + this.capacity + sep
                + this.state.toString() + sep
                + "Price: "+this.price + sep;
    }
}
