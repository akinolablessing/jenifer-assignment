package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPractices {
        public static void main(String[] args){

            addStudent();

}
        public static void addStudent(){
            Scanner  scanner = new Scanner(System.in);
            List<String> arrayList = new ArrayList<>();
          System.out.println("How many student do you have: ");
          int student = scanner.nextInt();
          for(int count = 1; count<=student; count++){
           System.out.println("Student "+count+" study which course:");
           String course = scanner.next();

           System.out.println("Student "+count+" score what:");
           String score = scanner.next();

              arrayList.add(course);
              arrayList.add(score);
           System.out.println(arrayList);

          }
        }

    }

