package main.java.com.semicolon.africa.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("yellow");
        arrayList.add("Blue");
        arrayList.add("pink");
        arrayList.add("purple");
        for(String color:arrayList){
            System.out.println(color);

        }


    }
}
