package main.java.com.semicolon.africa.model;


import main.java.com.semicolon.africa.model.constant.RoomType;

public class Room {
    private int roomId;
    private int roomNumber;
    private RoomType roomType;
    private int price;
    private boolean occupancy;


    public Room(int roomId, int roomNumber, RoomType roomType , int price, boolean occupancy){

        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.occupancy = occupancy;

    }

        public int getRoomNumber(){
          return roomNumber;
        }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", price=" + price +
                ", occupancy=" + occupancy +
                '}';
    }

    public RoomType getRoomType(){
          return roomType;
        }
        public int getPrice (){
        return price;
        }
        public boolean isOccupancy(){
          return occupancy;
        }
        public int getRoomId(){
        return roomId;
        }

        public void setOccupancy(boolean occupancy){
            this.occupancy = occupancy;
        }
}
