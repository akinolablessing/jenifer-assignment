package main.java.com.semicolon.africa.model;

import java.util.Scanner;

public class SecondPraticalApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        PraticalApp app = new PraticalApp();
        app.age=45;
        app.secondAge = 23;
        System.out.println("Your age yes / no"+app.age);
        String check = scanner.next();

        System.out.println("Your age yes/no"+app.secondAge);
        String checkTwo = scanner.next();

    }
}
