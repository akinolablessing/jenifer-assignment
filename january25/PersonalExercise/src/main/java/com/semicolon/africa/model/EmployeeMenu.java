package main.java.com.semicolon.africa.model;

public class EmployeeMenu {
    public static void main(String[] args){
        Employee employee = new Employee(5000);
        HRmanager hRmanager = new HRmanager(8000);

        employee.work();
        System.out.println("Employee salary: "+employee.getSalary());

        hRmanager.work();
        System.out.println("Manager salary is: "+hRmanager.getSalary());
        hRmanager.addEmployee();
    }
}
