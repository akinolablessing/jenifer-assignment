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

    static String pinCode = "";
    static String bankAccountNumber = "";
    static int money = 0;
    static int amount = 0;
    public static void showMainMenu() {
        String firstName = input("""
                BankApp Main Menu:
                1. Create Bank Account
                2. Confirm pin
                3.Deposit Money
                4.Transfer Money 
                5.Check Balance
                0. Exit
                """);

        switch (firstName) {
            case "1":
                createBankAccount();
                break;
            case "2":
                confirmPin();
                break;
            case "3":
                depositMoney();
                break;
            case "4":
                transferMoney();
                break;
            case "5":
                checkBalance();
            case "0":
                showMainMenu();
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
      pinCode = scanner.nextLine();
     System.out.println("This is your accountnumber: " + rand);

    // System.out.print("Enter your bank account number: ");
     //String bankAccountNumber = scanner.nextLine();
        System.out.print("Do u want to confirm your accountPin or have access to order choices? Yes/No: ");
        String confirmPin = scanner.nextLine();
        switch (confirmPin) {
            case "Yes":
                showMainMenu();
                break;
                case "No":
                System.out.print("Have a nice day? : ");
        }
     Bank bank = new Bank(fName,lName,pinCode,rand,bankAccountNumber);
        return bank;

    }
    public static void confirmPin() {
      System.out.print("Enter bank pin code to confirm: ");
      String confirmPin = scanner.nextLine();
      if (confirmPin.equals(pinCode)) {
          System.out.println("Your account has been confirmed.");
      }
      else {
          System.out.println("Your account has been rejected.");
      }
      //Bank bank = new Bank(confirmPin,);
    }
    public static void depositMoney() {
        System.out.print("Do you have an account before? Yes/No: ");
        String question = scanner.nextLine();
        switch (question){
            case "Yes":
                System.out.print("Enter your pin code: ");
                String quesPin = scanner.nextLine();
                if(quesPin.equals(pinCode)){
                    System.out.print("Enter money to deposit: ");
                     money = Integer.parseInt(scanner.nextLine());
                    if (money <= 0) {
                        System.out.println("Your money cannot be negative");
                    }
                    else {
                        System.out.println("Your money has been deposited");
                    }
                if(!quesPin.equals(pinCode)){
                  System.out.print("Dear customer, please enter a valid pin: ");
                }

                }
                break;
            case "No":
                System.out.print("Dear customer, Kindly create an account before you can deposit: ");
               break;
        }
        System.out.print("Would u like to continue? Yes/No: ");
        String choise = scanner.nextLine();
        switch (choise){
            case "Yes":
                showMainMenu();
                break;
        }

    }
    public static void transferMoney(){
        System.out.println("Enter user account number: ");
        bankAccountNumber = scanner.nextLine();

        System.out.print("Enter amount to transfer:");
          amount = Integer.parseInt(scanner.nextLine());
        if(money < amount){
           System.out.println("Insufficient funds");
        }
        if (amount <= 0 ) {
            System.out.println("Your money cannot be negative");
        }
        System.out.println("Enter your pin code: ");
        String transferCode = scanner.nextLine();

        if (transferCode.equals(pinCode)) {
            System.out.println("Amount transfer Successful!!! ");
        }
         else{
                System.out.println("Amount transfer Failed!!! ");
            }
        System.out.println("Would u like to continue? Yes/No: ");
        String chois = scanner.nextLine();
        switch (chois){
            case "Yes":
                showMainMenu();
                break;
        }

    }
    public static void checkBalance() {
        System.out.print("Enter your pin code: ");
        String pinCodeForBalance = scanner.nextLine();
        if(pinCodeForBalance.equals(pinCode)){

          if(money >= amount){
              money -= amount;
              System.out.println("Your balance is: " + money);
          }
          else{
              System.out.println("Insufficient funds");
          }
        }
        else {
            System.out.println("Your pin code does not match");
        }
    }
}
