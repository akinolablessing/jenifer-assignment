package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("john");
        arrayList.add("femi");
        arrayList.add("lara");
        arrayList.add("funmi");
        arrayList.add("ayo");
        System.out.print(arrayList);
        System.out.println(" ");
        String firstPerson = arrayList.get(0);
        System.out.println("The first person is :"+firstPerson);
        String second = arrayList.get(3);
        System.out.println("The third person is: "+second);

    }
}
