import main.java.com.semicolon.africa.model.Admin;
import main.java.com.semicolon.africa.model.Booking;
import main.java.com.semicolon.africa.model.Guest;
import main.java.com.semicolon.africa.model.Room;

import java.awt.print.Book;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
   static int bookingId = new Random().nextInt(2000);
    static int randomForRoomNumber = new Random().nextInt(3);

    static Admin admin = new Admin();
   static Guest guest = new Guest();

    public static void main(String[] args) {

        mainMenu();
    }
    public static void mainMenu() {

            System.out.println("""
                    Welcome, Our Esteemed Customer!!
                    Options:
                    1. Book Room
                    2. View Booking
                    3. Edit Profile
                    4. Check Room Availability
                    5. Payment Status
                    6. Cancel Booking
                    7. View All Available Room
                    8. View Notification
                    0. Go back to manu
                    """);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1 -> bookRoom();
                case 6 -> cancelReservation();
                case 7 -> viewAvailableRooms();
                case 0 -> mainMenu();

            }

    }
    public static void bookRoom(){
        admin.createRoom();
        System.out.println("""
                Welcome to Naija Comfort Inn!
                
                Please enter your name:
                """);
        String name = scanner.next();

        scanner.nextLine();

        System.out.println("Enter your phone number: ");
        String  number = scanner.next();

        System.out.println("Enter your email address");
        String emailAddress = scanner.next();
        System.out.println("""
                Select room type: 
                Single
                Double
                Suite
                """);
        String type = scanner.next();
        System.out.println("Enter number of nights: ");
        int night = scanner.nextInt();
        System.out.println("""
                Booking Successful !!!
                
                Guest Details:
                """);
        System.out.println("Name: "+name);
        System.out.println("Phone: "+number);
        System.out.println("Email: "+emailAddress);

        LocalDate localDate = LocalDate.now();
        int checkOut =  localDate.getDayOfMonth() + night;
        System.out.println("""
                
                Room Details:
                """);
        Booking booking = new Booking(bookingId, checkOut, localDate.getDayOfMonth());
        for (Room room : admin.getRoom()) {
            if(room.isOccupancy()) {
                System.out.println("Room Number: " + room.getRoomNumber());
                System.out.println("Type: " + room.getRoomType());
                System.out.println("Price Per Night: 10,000");
                int totalPayment = room.getPrice() * night;
                System.out.println("Total Payment: " + totalPayment);
                System.out.println("Booking Reference Number: RES" + room.getRoomId());
                booking.setRoom(room);
                break;
            }
        }
        System.out.printf("Your Check In Date is  %dth , and Check Out Date is %dth%n", localDate.getDayOfMonth(),checkOut);
        guest.setCustomerName(name);
        guest.setCustomerPhoNumber(number);
        guest.setCustomerEmail(emailAddress);
        admin.setGuests(guest);
        booking.setGuest(guest);
        System.out.println(admin.getGuests());
        System.out.println(booking);
        System.out.println("""
                Would you like to go back to menu
                yes/no
                """);
        String decision = scanner.next();
        if(decision.equals("yes")){
            mainMenu();
        }

    }
    public static void cancelReservation() {
        System.out.println("Enter your booking reference number: ");
        int cancel = scanner.nextInt();
        admin.createRoom();
        for(Room room : admin.getRoom()){
            if(room.getRoomId() == cancel) {
                System.out.println("Reservation canceled successfully.\n" +
                        "Room Number " + room.getRoomNumber() + " is now available.");
               room.setOccupancy(false);
            }
        }
    }

    public static void viewAvailableRooms(){
        admin.createRoom();
        admin.getRoom();
        System.out.println("Available Rooms:");
        System.out.println(admin);
        System.out.println("""
                Would you like to go back to menu
                yes/no
                """);
        String select = scanner.next();
        if(select.equals("yes")){
            mainMenu();
        }

    }
}