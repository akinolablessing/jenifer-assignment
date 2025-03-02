package main.java.com.semicolon.africa.model;

import javax.swing.*;
import java.util.Scanner;

public class SemicolonMenu {
    public static void main(String[] args) {

        mainMenu();
    }
    static String  input = new String();

        public static void mainMenu() {
            input = JOptionPane.showInputDialog(null, """
                    Who would you like to attend to?:
                    1.Priest.
                    2.Priestest.
                    3.Food Priest""");
            switch (input){
                case "1":
                    System.out.println("ohhhhhhhhhhhhhhh");
            }
        }

}

