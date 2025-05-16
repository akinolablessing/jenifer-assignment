package main.java.com.semicolon.africa.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static StudentCourseManagement.fileName;

public class StudentCourseManagement {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static String fileName = "C:\\Users\\DELL\\Desktop\\StudentCourseManagement\\output.txt";
    static Instructor instructor ;
    public static void main(String[] args) throws InvalidNameException {
//        while (true){
//            System.out.println("""
//                        Welcome to Ayo's SMC
//                        1.Facilitator
//                        2.Student
//                        0.Exist
//                    """);
//            int choise = scanner.nextInt();
//            switch (choise){
//                case 1->facilitator();
//
//
//            }
//        }
//    }
//    public static void facilitator(){
//
//        System.out.println("""
//                Facilitator Menu!!!
//                1.Register Student
//                2.Enroll in course
//                3.view Enrolled courses
//                0.Exist
//                """);
//        int facilitatorMenu = scanner.nextInt();
//        switch (facilitatorMenu){
//            case 1-> registerStudent();
//
//        }
//    }
//    public static void registerStudent(){
//        try {
//            System.out.println("Enter your firstName:");
//            String fName = scanner.next();
//
//            System.out.println("Enter your lastName:");
//            String sName = scanner.next();
//
//            System.out.println("Enter your gmail:");
//            String gmail = scanner.next();
//
//            System.out.println("Enter your password:");
//            Object password = scanner.next();
//
//            if (getStudentByEmail(gmail) != null) {
//                System.out.println("❌ Email already registered!");
//            }
//
//            Student student = new Student(fName, sName, gmail, password);
//            students.add(student);
//            System.out.println("✅ Student registered successfully!");
//
//        }catch (InvalidNameException e){
//            System.out.println("❌ Error: " + e.getMessage());
//        }
//
//    }
//    public static Student getStudentByEmail(String email){
//        for(Student student : students){
//        if(student.getEmail().equals(email)){
//        return student;
//        }
//        }
//        return null;
    }
}

