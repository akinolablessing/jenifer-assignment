package main.java.com.semicolon.africa.model;

import javax.swing.*;
import javax.xml.namespace.QName;

public class Joption {
    public static void main(String[] args){
     String name = new String();
       name = JOptionPane.showInputDialog(null, """
               Order your choices Now!!!
               1.DODO Pizza
               2.Chicken
               3.Chicken salad
               4.Fry yam and chicken
               """);
       switch (name){
           case "1":
               JOptionPane.showMessageDialog(null,"Welcome to dodo pizza website");
               break;
           case "2":
               JOptionPane.showMessageDialog(null,"Welcome to Chicken website");
               break;
           case "3":
               JOptionPane.showMessageDialog(null,"Welcome to Chicken salad website");
       }

    }
}
