package main.java.com.semicolon.africa.model;

import java.util.Random;
import java.util.Scanner;

public class HotelBookingApp {
    public static void main(String[] args) {
        hotelMenu ();
        bookRoom();
    }

        public static void hotelMenu () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("""
                    Welcome, Our Esteemed Customer!
                    Option:
                    1. Book Room
                    2. View Booking
                    3. Edit profile
                    4. Check Room Availability
                    5. Payment Status
                    6. Cancel Booking
                    7. View All Available room
                    8. View Notification
                    """);
            System.out.print("Select>>");
            int select = scanner.nextInt();
            switch (select){
                case 1:
                    bookRoom();
                    break;
            }
        }
   public static void bookRoom(){
       Scanner scanner = new Scanner(System.in);
       int random = new Random().nextInt(20);
       System.out.println("Name: ");
       String name = scanner.nextLine();

       System.out.println("Phone Number: ");
       long number = scanner.nextLong();

       System.out.println("Email: ");
       String email = scanner.next();

       System.out.println("""
               Select room type:
               1. Single
               2. Double
               3. Suit
               """);
       String selectRoom = scanner.nextLine();

       System.out.println("Enter number of night: ");
       int night = scanner.nextInt();

       System.out.println("Booking successfil >>>>>>>>>>");
       System.out.println("Quest Details:");
       System.out.println("Name: "+name+ "\n Phone number: "+number);
   }
}