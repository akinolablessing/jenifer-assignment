package main.java.com.semicolon.africa.model;

import javax.swing.*;
import java.util.Random;


public class BankApp {

    private static Bank bank = new Bank();
    public static long rand = new Random().nextLong(99999999995L);
    public static void main(String[] args) {

        showMainMenu();
    }
    static String input = new String();
    static int number = 0;
    static String pinCode = "";
    static String bankAccountNumber = "";
    static int money = 0;
    static int amount = 0;
    public static void showMainMenu() {
        input = JOptionPane.showInputDialog(null,"""                
                BankApp Main Menu:
                1. Create Bank Account
                2. Confirm pin
                3.Deposit Money
                4.Transfer Money 
                5.Check Balance
                0. Exit
                """) ;

        switch (input) {
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
//            case "5":
//                checkBalance();
//            case "0":
//                showMainMenu();
//                break;
        }

    }

//    private static String input(String prompt) {
//        System.out.print(prompt);
//        return new Scanner(System.in).nextLine();
//    }

//    private static void print(String prompt) {
//        System.out.println(prompt);
//    }
    public static Bank createBankAccount() {

        String firstName = JOptionPane.showInputDialog(null, "Enter your First name: ");
        //String fName = scanner.nextLine();
        String lastName = JOptionPane.showInputDialog(null, "Enter your Last name: ");
        //String lName = scanner.nextLine();
     pinCode = JOptionPane.showInputDialog(null,"Enter your pinCode: ");
//      pinCode = scanner.nextLine();
     JOptionPane.showMessageDialog(null,"This is your accountnumber: " + rand);

        String account = JOptionPane.showInputDialog(null,"Enter your bank account number: ");
        //String bankAccountNumber = scanner.nextLine();
         String confirmPin = JOptionPane.showInputDialog(null,"Do u want to confirm your accountPin or have access to other choices? Yes/No: ");
//        String confirmPin = scanner.nextLine();
         switch (confirmPin.toLowerCase()) {
            case "yes":
               showMainMenu();
                break;
                case "no":
                JOptionPane.showMessageDialog(null,"Have a nice day!!!! ");
      }
     Bank bank = new Bank(firstName,lastName,pinCode,rand,bankAccountNumber);
       return bank;

   }
   public static void confirmPin() {
      String confirmPin = JOptionPane.showInputDialog(null,"Enter bank pin code to confirm: ");
//     String confirmPin = scanner.nextLine();
      if (confirmPin.equals(pinCode)) {
         JOptionPane.showMessageDialog(null,"Your account has been confirmed.");
     }
     else {
         JOptionPane.showMessageDialog(null,"Your account has been rejected.");
    }
     String previous = JOptionPane.showInputDialog(null,"Kindly click yes for other options: yes/no");

   }
    public static void depositMoney() {
       String question = JOptionPane.showInputDialog(null,"Do you have an account before? Yes/No: ");
//        String question = scanner.nextLine();
        switch (question.toLowerCase()){
            case "yes":
               String quesPin = JOptionPane.showInputDialog(null,"Enter your pin code: ");
//                String quesPin = scanner.nextLine();
                if(quesPin.equals(pinCode)){
                    number = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter money to deposit: "));
//                     money = Integer.parseInt(scanner.nextLine());
                   if (money <= 0) {
                         JOptionPane.showMessageDialog(null,"Your money cannot be negative");
                   }
                   else {
                       JOptionPane.showMessageDialog(null,"Your money has been deposited");
                   }
               if(!quesPin.equals(pinCode)){
                   JOptionPane.showMessageDialog(null,"Dear customer, please enter a valid pin: ");
               }
               }


                break;
            case "no":

               String depo = JOptionPane.showInputDialog(null,"Dear customer, Kindly create an account before you can deposit:");
               switch (depo){

               }
               break;
        }
        String choise= JOptionPane.showInputDialog(null,"Would u like to continue? Yes/No: ");
//       String choise = scanner.nextLine();
        switch (choise.toLowerCase()){
            case "yes":
                showMainMenu();
                break;
        }

    }
      public static void transferMoney(){
         String bankAccountNumber = JOptionPane.showInputDialog(null,"Enter user account number: ");
//        bankAccountNumber = scanner.nextLine();
//
         int amount = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter amount to transfer:"));
//          amount = Integer.parseInt(scanner.nextLine());
         if(money < amount){
            JOptionPane.showMessageDialog(null,"Insufficient funds");
         }
         if (amount <= 0 ) {
             JOptionPane.showMessageDialog(null,"Your money cannot be negative");
        }
         String transferCode = JOptionPane.showInputDialog(null,"Enter your pin code: ");
//        String transferCode = scanner.nextLine();
//
         if (transferCode.equals(pinCode)) {
            JOptionPane.showMessageDialog(null,"Amount transfer Successful!!! ");
         }
         else{
                JOptionPane.showMessageDialog(null,"Amount transfer Failed!!! ");
            }
         String chois = JOptionPane.showInputDialog (null,"Would u like to continue? Yes/No: ");
//        String chois = scanner.nextLine();
        switch (chois.toLowerCase()){
           case "yes":
                showMainMenu();
               break;
        }

    }
    public static void checkBalance() {
        String pinCodeForBalance = JOptionPane.showInputDialog(null,"Enter your pin code: ");
//        String pinCodeForBalance = scanner.nextLine();
        if(pinCodeForBalance.equals(pinCode)){

          if(money >= amount){
              money -= amount;
               JOptionPane.showMessageDialog(null,"Your balance is: " + money);
           }
          else{
              JOptionPane.showMessageDialog(null,"Insufficient funds");
          }
        }
       else {
           JOptionPane.showMessageDialog(null,"Your pin code does not match");
        }
        }
}
