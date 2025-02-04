package main.java.com.semicolon.africa.model;

import java.util.Scanner;
import java.time.LocalDate;



public class MainApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Diary diary = new Diary();


    public static void main(String[] args) {

        mainMenu();
    }
       static String name = "";
       static String pin = "";
       static String nameForUnlock = "";
       static  String pinForUnlock = "";

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

    Diary diary1 = new Diary(name, pin);
    }
    public static Diary lockDiary() {
        System.out.println("Enter your name: ");
        String nameForLock = scanner.nextLine();
        System.out.println("Enter your pin: ");
        String pinForLock = scanner.nextLine();

        if(name.equals(nameForLock) && pin.equals(pinForLock)) {
          System.out.println("Your diary is locked!");
        }
        if(!name.equals(nameForLock) && pin.equals(pinForLock)) {
           System.out.println("Kindly enter correct name!!");
        }
        if(name.equals(nameForLock) && !pin.equals(pinForLock)) {
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
            if(name.equals(nameForUnlock) && pin.equals(pinForUnlock)) {
                System.out.println("Your diary is unlocked!");
            }
            if(!name.equals(nameForUnlock) && pin.equals(pinForUnlock)) {
                System.out.println("Kindly enter correct name!!");
            }
            if(name.equals(nameForUnlock) && !pin.equals(pinForUnlock)) {
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
    public static Entry createEntry(){

        if(name.equals(nameForUnlock) && pin.equals(pinForUnlock)) {
            System.out.println("Your diary is unlocked!");

            System.out.println("Enter your id number: ");
            int idNumber = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the title: ");
            String title = scanner.nextLine();

            System.out.println("Enter the Body: ");
            String body = scanner.nextLine();

            System.out.println("This entry was created on : " + LocalDate.now());
            Entry entry = new Entry(idNumber, title, body);
            return entry;

        }
        else {
            System.out.println("Kindly enter correct name and pin!!");
        }

        return null;
    }
}
