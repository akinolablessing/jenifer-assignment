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
    static int randomForRoomNumber = new Random().nextInt(3);

    static Admin admin = new Admin();
   static Guest guest = new Guest();

    public static void main(String[] args) {
        roleChecking();
    }
    public static void roleChecking(){
        System.out.println("Login as admin or guest:");
        String adminGuest = scanner.next();

        if(adminGuest.equalsIgnoreCase("admin")) {

            System.out.println("Enter admin password:");
            String adminPassword = scanner.next();
            if(adminPassword.equals("admin123")) {

                System.out.println("""
                        Welcome, Madam Gloria!
                        
                        Options:
                        1. View All Rooms
                        2. Manage Reservations
                        3. Generate Reports
                        4. Mark Rooms for Maintenance
                        5. Add rooms
                        6. View guest Details
                        """);
                int adminMenu = scanner.nextInt();
            }
                else{
                   System.out.println("Wrong password!!.");
                    roleChecking();
                }
        }
        if(adminGuest.equalsIgnoreCase("guest")){
            mainMenu();
        }
    }
    public static void mainMenu() {

            System.out.println("""
                    Welcome, Our Esteemed Customer!!
                    Options:
                    1. Book Room
                    2. View Booking
                    3. Role Checking
                    4. Calculate Payment
                    5. Check Room Availability
                    6. Cancel Booking
                    7. Payment Status
                    8. View All Available Room
                    9. View Notification
                    10. Go back to manu
                    """);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1 -> bookRoom();
                case 2 -> viewBooking();
                case 3 -> roleChecking();
                case 4 -> calculatePayment();
                case 7 -> paymentStatus();
                case 6 -> cancelReservation();
                case 8 -> viewAvailableRooms();
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
        int bookingId = new Random().nextInt(2000);
        for (Booking booking: admin.getBookings()){
            if(bookingId == booking.getBookingId()){
               System.out.println("Booking ID already exist!!");
            }
            else{
                booking.setBookingId(bookingId);
            }
        }
        Booking booking = new Booking(checkOut, localDate.getDayOfMonth());
        Room.setRoomType(type);
        for (Room room : admin.getRoom()) {
            if(room.isOccupancy()) {
                System.out.println("Room Number: " + room.getRoomNumber());
                System.out.println("Type: " + room.getRoomType());
                System.out.println("Price Per Night: 10,000");
                int totalPayment = room.getPrice() * night;
                System.out.println("Total Payment: " + totalPayment);
                System.out.println("Booking Reference Number: RES" + room.getRoomId());
                break;
            }
            if(!room.isOccupancy()){
                booking.setRoom(room);
            }
        }

        System.out.printf("Your Check In Date is  %dth , and Check Out Date is %dth%n", localDate.getDayOfMonth(),checkOut);
        guest.setCustomerName(name);
        guest.setCustomerPhoNumber(number);
        guest.setCustomerEmail(emailAddress);
        admin.setGuests(guest);
        booking.setGuest(guest);
        admin.setBookings(booking);
        System.out.println(admin.getGuests());
        System.out.println(booking);
        System.out.println("""
                Would you like to go back to menu
                yes/no
                """);
        String decision = scanner.next();
        if(decision.equalsIgnoreCase("yes")){
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
        if(select.equalsIgnoreCase("yes")){
            mainMenu();
        }
    }

    public static void viewBooking(){

            System.out.println(admin.getBookings());
            System.out.println("Enter your Booking Number:");
            int bookingNumber = scanner.nextInt();

            for(Booking empty: admin.getBookings()){
                if(bookingNumber == empty.getBookingId()){
                    System.out.println(empty);
                }

            }


        System.out.println("""
                    Would you like to go back to manu:
                    yes/no
                    """);
            String back = scanner.next();

            if (back.equalsIgnoreCase("yes")) {
                mainMenu();
            }

    }
    public static void paymentStatus(){
        System.out.println("""
                Room Pricing During Festive Period:
                
                 Single Room: ₦12,000 per night
                 Double Room: ₦18,000 per night
                 Suite: ₦30,000 per night
                """);
        System.out.println("Would you like to go back to menu: yes/no");
        String yesNo = scanner.next();

        if (yesNo.equalsIgnoreCase("yes")) {
            mainMenu();
        }
    }
    public static void calculatePayment(){
        System.out.println("""
                Enter room type : Single
                                  Double
                                  Suite:
                """);
        String  roomType = scanner.next();

        switch (roomType) {
            case "Single":
            System.out.println("Enter number of nights: ");
            int night = scanner.nextInt();

            System.out.println("Is this a festive period? (Yes/No):");
            String festive = scanner.next();
            if (festive.equalsIgnoreCase("yes")) {

                int calculation = night * 12000;
                System.out.println("Price per Night: 12,000");
                System.out.println("Room Type: "+roomType);
                System.out.println("Festive Period Surcharge: 20%");
                System.out.println("Total Payment: "+calculation);
            }
            else {
                bookRoom();
            }
            case "Double":
                System.out.println("Enter number of nights: ");
                int nightDouble = scanner.nextInt();

                System.out.println("Is this a festive period? (Yes/No):");
                String festiveDouble = scanner.next();
                if (festiveDouble .equalsIgnoreCase("yes")) {

                    int calculation = nightDouble * 18000;
                    System.out.println("Price per Night: 18,000");
                    System.out.println("Room Type: "+roomType);
                    System.out.println("Festive Period Surcharge: 20%");
                    System.out.println("Total Payment: "+calculation);
                }
                else {
                    bookRoom();
                }
            case "Suite":
                System.out.println("Enter number of nights: ");
                int nightSuite = scanner.nextInt();

                System.out.println("Is this a festive period? (Yes/No):");
                String festiveSuite = scanner.next();
                if (festiveSuite .equalsIgnoreCase("yes")) {

                    int calculation = nightSuite * 18000;
                    System.out.println("Price per Night: 18,000");
                    System.out.println("Room Type: "+roomType);
                    System.out.println("Festive Period Surcharge: 20%");
                    System.out.println("Total Payment: "+calculation);
                }
                else {
                    bookRoom();
                }

        }
    }
}