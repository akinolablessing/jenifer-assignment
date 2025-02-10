package main.java.com.semicolon.africa.model;

import jdk.jshell.spi.ExecutionControl;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class invalidPinException  {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try {
           System.out.print("Enter Pin: ");
           int pin = sc.nextInt();
       }
       catch (Exception e) {
       System.out.println("Enter an Integer: ");
       }
       try {
           System.out.print("What is your name: ");
           String name = sc.nextLine();
       }
       catch (Exception e) {
           System.out.println("Enter a String not Integer");
       }
   }
}
