package main.java.com.semicolon.africa.model;

import java.time.LocalDate;

public class MedicalRecord {
    private String recordID;
    private String diagnosis;
    private String treatment;
    private LocalDate date;

    public MedicalRecord(String recordID, String diagnosis, String treatment, LocalDate date) {
        this.recordID = recordID;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
    }

    public String getRecordID() {
        return recordID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public LocalDate getDate() {
        return date;
    }
    public void addRecord(String diagnosis, String treatment){

    }
    public void viewRecords(){

    }
}
