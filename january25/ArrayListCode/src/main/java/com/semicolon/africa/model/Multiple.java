package main.java.com.semicolon.africa.model;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number A:");
        int numberA = scanner.nextInt();

        System.out.println("Enter a number B:");
        int numberB = scanner.nextInt();

        System.out.println("Enter number C:");
        int numberC = scanner.nextInt();

        for(int count = numberC; count<=numberB; count+=numberC){
            System.out.println("The output is: "+count);
        }
    }
}
