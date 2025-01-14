package main.java.com.semicolon.africa.model;


import java.util.ArrayList;
import java.util.Random;

public class Admin {

    ArrayList<Room> room  = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();
    ArrayList<Guest> guests = new ArrayList<>();

    public void setRoom(Room room){
        this.room.add(room);

    }
    public void setBookings(Booking reservations){
        this.bookings.add(reservations);
    }
    public void setGuests(Guest guests){

        this.guests.add(guests);
    }
    public ArrayList<Room> getRoom(){
        return room;
    }

    public ArrayList<Booking> getBookings(){
            return bookings;
    }

    public ArrayList<Guest> getGuests(){
        return guests;
    }

    public void createRoom(){

        int firstRandom = new Random().nextInt(200);
        int secondRandom = new Random().nextInt(100);
        int thirdNumber = new Random().nextInt(210);

        Room firstRoom = new Room(firstRandom, 001  ,10000, false);
        Room secondRoom = new Room(secondRandom, 002, 20000, false);
        Room thirdRoom = new Room(thirdNumber, 003,  30000, false);

        room.add(firstRoom);
        room.add(secondRoom);
        room.add(thirdRoom);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "room=" + room +
                '}';
    }
}
