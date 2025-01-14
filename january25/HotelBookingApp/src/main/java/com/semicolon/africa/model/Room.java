package main.java.com.semicolon.africa.model;


public class Room {
    private int roomId;
    private int roomNumber;
    private static String roomType;
    private int price;
    private boolean occupancy;


    public Room(int roomId, int roomNumber, int price, boolean occupancy){

        this.roomId = roomId;
        this.roomNumber = roomNumber;
        roomType = roomType;
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

    public String getRoomType(){
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

        public static void setRoomType(String roomType){
        Room.roomType = roomType;
        }
}
