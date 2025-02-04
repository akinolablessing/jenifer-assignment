package main.java.com.semicolon.africa.model;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;



public class MainApplication {
     static Scanner scanner = new Scanner(System.in);
     static Diary diary = new Diary();
    static int  random = new Random().nextInt(5);


    public static void main(String[] args) {

        mainMenu();
    }

    static String name = "";
    static String pin = "";
    static String nameForUnlock = "";
    static String pinForUnlock = "";
    static String nameForLock = "";
    static String pinForLock = "";

    public static void mainMenu() {
        System.out.println("Today's date is: " + LocalDate.now());
        String diaryMenu = input("""  
                       Welcome to the Diary Menu Application!!
                       1. Create a new diary
                       2. Lock Diary
                       3. Unlock Diary
                       4. Create Entry
                       0. Exit
                """);
        switch (diaryMenu) {
            case "1":
                createDiary();
                break;
            case "2":
                lockDiary();
                break;
            case "3":
                unlockDiary();
            case "4":
                createEntry();
                break;
            //case "0":
            //  mainMenu();
            // break;

        }


    }

    private static String input(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).nextLine();
    }

    private static void print(String prompt) {
        System.out.println(prompt);
    }

    public static void createDiary() {
        try {
           System.out.println("Fill in your details to create a new diary ");
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            System.out.println("Enter your pin: ");
            pin = scanner.nextLine();
            System.out.println("Would you like to go back to menu for other choices? Yes/No: ");
            String choice = scanner.nextLine();
            switch (choice.toLowerCase()) {
                case "yes":
                    mainMenu();
                    break;
                case "no":
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Diary diary1 = new Diary(name, pin);

    }

    public static Diary lockDiary() {
        System.out.println("Enter your name: ");
        nameForLock = scanner.nextLine();
        System.out.println("Enter your pin: ");
        pinForLock = scanner.nextLine();

        if (name.equals(nameForLock) && pin.equals(pinForLock)) {
            System.out.println("Your diary is locked!");
        }
        if (!name.equals(nameForLock) && pin.equals(pinForLock)) {
            System.out.println("Kindly enter correct name!!");
        }
        if (name.equals(nameForLock) && !pin.equals(pinForLock)) {
            System.out.print("Kindly enter correct pin!!");
        }
        System.out.println("Would you like to go back to menu for other choices? Yes/No: ");
        String choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "yes":
                mainMenu();
                break;
            case "no":
                break;
        }
        Diary diary1 = new Diary(nameForLock, pinForLock);
        return diary1;
    }

    public static Diary unlockDiary() {
        System.out.println("Enter your name: ");
        nameForUnlock = scanner.nextLine();
        System.out.println("Enter your pin: ");
        pinForUnlock = scanner.nextLine();
        if (name.equals(nameForUnlock) && pin.equals(pinForUnlock)) {
            System.out.println("Your diary is unlocked!");
        }
        if (!name.equals(nameForUnlock) && pin.equals(pinForUnlock)) {
            System.out.println("Kindly enter correct name!!");
        }
        if (name.equals(nameForUnlock) && !pin.equals(pinForUnlock)) {
            System.out.print("Kindly enter correct pin!!");
        }
        System.out.println("Would you like to go back to menu? Yes/No: ");
        String choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "yes":
                mainMenu();
                break;
            case "no":
                break;
        }
        Diary diary1 = new Diary(nameForUnlock, pinForUnlock);
        return diary1;
    }

    public static void createEntry() {
        System.out.print("Have you created  diary? Yes/No: ");
        String choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "yes":
                if (name.equals(nameForUnlock) && pin.equals(pinForUnlock)) {
                    //Diaries diaries = new Diaries();
                    //if (diaries.getDiaries().size() > 0) {
                    // System.out.println("Your diary is unlocked!");

                    System.out.println("This is your id number: "+random);

                    System.out.println("Enter the title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter the Body: ");
                    String body = scanner.nextLine();

                    System.out.println("This entry was created on : " + LocalDate.now());
                    Entry entry = new Entry(random, title, body);
                    Diary diary = new Diary();
                    diary.saveEntry(entry);
                    System.out.println(diary);
                    // } else {
                    // System.out.println("No diary found!");
                    // }
                } else {
                    System.out.println("Kindly unlock your entry first!!");
                }
                break;

            case "no":
                createDiary();
                break;

        }

    }

}

