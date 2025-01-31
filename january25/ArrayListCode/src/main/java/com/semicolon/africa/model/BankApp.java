package main.java.com.semicolon.africa.model;

import java.util.Random;
import java.util.Scanner;

public class BankApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();
    public static long rand = new Random().nextLong(99999999995L);
    public static void main(String[] args) {
        showMainMenu();
    }

    public static void showMainMenu() {
        String firstName = input("""
                BankApp Main Menu:
                1. Create Bank Account
                2. Confirm pin 
                
                """);

        switch (firstName) {
            case "1":
                createBankAccount();
                break;

        }

    }

    private static String input(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).nextLine();
    }

    private static void print(String prompt) {
        System.out.println(prompt);
    }
    public static Bank createBankAccount() {

     System.out.print("Enter your First name: ");
     String fName = scanner.nextLine();
     System.out.print("Enter your Last name: ");
     String lName = scanner.nextLine();
     System.out.print("Enter your pinCode: ");
     String pinCode = scanner.nextLine();
     System.out.println("This is your accountnumber: " + rand);

     System.out.print("Enter your bank account number: ");
     String bankAccountNumber = scanner.nextLine();
     Bank bank = new Bank(fName,lName,pinCode,rand,bankAccountNumber);
        return bank;
    }
}
