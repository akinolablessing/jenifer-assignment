package main.java.com.semicolon.africa.model;

public class CustomerMenu {
public static void main(String[] args) {
Customer customer = new Customer("Ayomide",5000.0,"Ayomi@gmail.com");
 System.out.println(customer.getName());
 System.out.println(customer.getCreditLimit());
 System.out.println(customer.getEmailAddress());

 System.out.println("Second customer menu");
    Customer secoCustomer = new Customer();
    System.out.println(secoCustomer.getName());
    System.out.println(secoCustomer.getCreditLimit());
    System.out.println(secoCustomer.getEmailAddress());

    System.out.println("Third customer menu");
    Customer thirdCustomer = new Customer();
    System.out.println(thirdCustomer.getName());
    System.out.println(thirdCustomer.getCreditLimit());
    System.out.println(thirdCustomer.getEmailAddress());

}

}
