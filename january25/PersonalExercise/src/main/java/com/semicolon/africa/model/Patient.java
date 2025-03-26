package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private int age;
    private String patientID;


    public Patient(String name, int age, String patientID) {
        this.name = name;
        this.age = age;
        this.patientID = patientID;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPatientID() {
        return patientID;
    }


//    public void makeAppointment(Doctor doctor){
//        for(Doctor doctor1 : doctors){
//
//        }
//    }
//    public void viewMedicalRecord(){
//
//    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", patientID='" + patientID + '\'' +
                '}';
    }
}
