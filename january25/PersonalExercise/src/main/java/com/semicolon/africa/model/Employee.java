package main.java.com.semicolon.africa.model;

public class Employee {

    private int salary;

    public Employee(int salary){
       this.salary = salary;
    }
    public void work(){
       System.out.println("Working as an Employee!!");
    }
    public int getSalary(){
        return salary;
    }

}
