package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class RegisterDoctor {
    private List<Doctor> doctors;

    public RegisterDoctor() {
        this.doctors = new ArrayList<>();
    }
    public void addDoctor(Doctor details){
        doctors.add(details);
    }
    public List<Doctor> getAllDoctor(){
        return doctors;
    }


}
