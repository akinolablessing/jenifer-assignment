package main.java.com.semicolon.africa.model;

public class Bank {
private String firstName;
private String lastName;
private String pinCode;
private int balance;
private long accountNumber;
private String userAccountNumber;

public Bank(String firstName, String lastName, String pinCode,long accountNumber, String userAccountNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.pinCode = pinCode;
    this.accountNumber = accountNumber;
    this.userAccountNumber = userAccountNumber;
}

    public Bank() {
     balance = 0;
    }
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }
    public String getFirstName() {
    return firstName;
}
public String getLastName(){
    return lastName;
}
public String getPinCode(){
    return pinCode;
}

    public boolean confirmPin(String pin) {
    if(pinCode.equals(pin)){
       return true;
    }
    return false;
    }
   public int getBalance() {
    return balance;
   }
    public int depositeAmount(int amount) {
    balance += amount;
        return amount;
    }


    public void withdrawMoney(String pin, int i, String accountNumber) {
     if(pinCode.equals(pin)){
         if(balance >= i){
             balance -= i;
         }
         if(accountNumber.equals(this.accountNumber)){

         }

     }
    }

    public void transferMoney(String pin, int money, String userAccountNumber) {
    if(this.pinCode.equals(pin)){
      if(balance >= money){
          balance -= money;
          if(userAccountNumber.equals(this.userAccountNumber)){

          }
      }
    }
    }

    public void checkBalance(String pinNumber, int remainingBalance, String accountNumber) {
    if(pinCode.equals(pinNumber)){
        if(balance >= remainingBalance){
            balance -= remainingBalance;

        }
        if(accountNumber.equals(this.accountNumber)){

        }
    }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", userAccountNumber='" + userAccountNumber + '\'' +
                '}';
    }
}
