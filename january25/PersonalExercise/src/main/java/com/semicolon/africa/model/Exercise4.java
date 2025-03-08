package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Yellow");
        arrayList.add("White");
        if(arrayList.contains("Yellow")){
           System.out.println("Yeah !! we found it");
        }
        else {
            System.out.println("No such thing!!");
        }
        Collections.sort(arrayList);
        System.out.println("List after sort "+arrayList);
    }
}
