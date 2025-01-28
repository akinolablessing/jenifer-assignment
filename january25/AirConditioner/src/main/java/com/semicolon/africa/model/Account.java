package main.java.com.semicolon.africa.model;

public class Account {
    private boolean iHaveAnAccount = true;
    private String number;
    private int balance ;
    private String customerName;
    //private String updateBalance ;
    private String customerGmail;
    private String customerPhoneNumber;


    public boolean iHaveAnAccount() {
        return iHaveAnAccount;
    }
    public void depositAmount(int depositeMoney){
       balance+=depositeMoney;
    }
    public int withdrawAmount(int moneyWithdraw){
        if(balance - moneyWithdraw < 0){
         return this.balance;
        }
        else{
            balance -= moneyWithdraw;
            return balance;
        }

    }
    public int checkBalance() {
        return this.balance;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public int getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
       this.customerName = customerName;
    }
    public String getCustomerGmail(){
        return customerGmail;
    }
    public void setCustomerGmail(String customerGmail){
        this.customerGmail = customerGmail;
    }
    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }


    public int getUpdateBalance(int amount) {
        balance+=amount;
        return amount;
    }
}
