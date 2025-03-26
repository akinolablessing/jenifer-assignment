package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String specialty;
    private String doctorID;
    private List<Patient> patients;

    public Doctor(String name, String specialty, String doctorID) {
        this.name = name;
        this.specialty = specialty;
        this.doctorID = doctorID;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getDoctorID() {
        return doctorID;
    }
    public List<Patient> viewAllPatient(){
        return patients;
    }
    public Patient seePatient(String patientId){
    for(Patient patient : patients){
       if(patient.getPatientID().equalsIgnoreCase(patientId)){
          return patient;
       }
    }
        return null;
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }
    public void checkPatientID(String patientId) {
        for (Patient patient : patients) {
            if (patient.getPatientID().equalsIgnoreCase(patientId)) {
                System.out.println("Duplicate ID is not allowed");
            } else {
                System.out.println("Verified Successfully!!");
            }
        }
    }

//    public void updateMedicalRecord(MedicalRecord record){
//
//    }
}
