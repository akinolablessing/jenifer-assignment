package main.java.com.semicolon.africa.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private String appointmentID;
    private LocalDate date;
    private LocalTime time;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String appointmentID, LocalDate date, LocalTime time, Patient patient, Doctor doctor) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }
    public void schedule(){

    }
    public void cancel(){

    }
}
