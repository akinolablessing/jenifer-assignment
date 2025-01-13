package main.java.com.semicolon.africa.model;

import java.time.LocalDate;

public class Booking {

    private int bookingId;
    private int endDate;
    private int startDate;
    private Room room;
    private Guest guest;


    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", endDate=" + endDate +
                ", startDate=" + startDate +
                ", room=" + room +
                ", guest=" + guest +
                '}';
    }

    public Booking(int bookingId
            , int endDate, int startDate){

       this.bookingId = bookingId;
       this.endDate = endDate;
       this.startDate = startDate;


    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {

        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public int getBookingId(){
        return bookingId;
    }
    public int getEndDate(){
        return endDate;
    }
    public int getStartDate(){
        return startDate;
    }
}
