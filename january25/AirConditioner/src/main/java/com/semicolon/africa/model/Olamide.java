package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Olamide {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int[][][] number = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
            for(int i = 0; i<number.length; i++){
                for(int j=0; j<number[i].length; j++){
                    for(int k=0; k<number[i][j].length; k++){
                        System.out.print(number[i][j][k]+" ");

                    }
                   System.out.println();
                }
            }
            System.out.print("Enter your name:");
            String name = scanner.nextLine();
             //arrayList.add(name);
        System.out.println( arrayList.add(name));
             System.out.print("Enter your age:");
             int age = scanner.nextInt();
             arrayList.add(String.valueOf(age));
             System.out.print("Enter your sex:");
             String sex = scanner.nextLine();
             arrayList.add(sex);
           System.out.println(arrayList.add(sex));
    }
}
