package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Coke");
        arrayList.add("Fish");
        arrayList.add("Semo");
        System.out.print(arrayList);
        System.out.print(" ");
        arrayList.add(0,"Jollofrice");
        arrayList.add(3,"Amala");
        System.out.print(arrayList);
        System.out.print(" ");
    }
}
