package main.java.com.semicolon.africa.model;

public class Guest {

    private String customerName;
    private String customerPhoNumber;
    private String customerEmail;

    public String getCustomerName(){
        return customerName;
    }
    public String getCustomerPhoNumber(){
        return customerPhoNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "customerName='" + customerName + '\'' +
                ", customerPhoNumber='" + customerPhoNumber + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }


    public String getCustomerEmail(){
        return customerEmail;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setCustomerPhoNumber(String customerPhoNumber){
        this.customerPhoNumber = customerPhoNumber;

    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

}
