package main.java.com.semicolon.africa.model;

public class HRmanager extends Employee{
    public HRmanager(int salary) {
        super(salary);
    }
    public void work(){
        System.out.println("\nManaging employees");
    }
    public void addEmployee(){
        System.out.println("\nAdding new employee!");
    }
}
