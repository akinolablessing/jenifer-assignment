import main.java.com.semicolon.africa.model.Doctor;
import main.java.com.semicolon.africa.model.Patient;
import main.java.com.semicolon.africa.model.RegisterDoctor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatientTest {
    @Test
    public void test_that_register_patients(){
        Patient patient = new Patient("Ayin",21,"PAT12");
        Doctor doctor = new Doctor("Dr.JeJe","Dentist","DOC1");
        doctor.addPatient(patient);
        assertEquals(1,doctor.viewAllPatient().size());

    }
    @Test
    public void test_that_register_two_patient(){
        Patient firstPatient = new Patient("Onyii",25,"PAT1");
        Patient secondPatient = new Patient("Ester",23,"PAT3");
        Doctor doctor = new Doctor("Dr.Kim","Physicist","DOC4");
        doctor.addPatient(firstPatient);
        doctor.addPatient(secondPatient);
        assertEquals(2,doctor.viewAllPatient().size());
    }
    @Test
    public void test_that_register_doctor(){
    Doctor doctor = new Doctor("Dr.Joy","Fishist","DOC7");
        RegisterDoctor registerDoctor = new RegisterDoctor();
        registerDoctor.addDoctor(doctor);
        assertEquals(1,registerDoctor.getAllDoctor().size());
    }
    @Test
    public void test_that_register_two_doctor(){
        Doctor firstDoctor = new Doctor("Dr.NiYi","Chemist","DOC1");
        Doctor secondDoctor = new Doctor("Dr.Wale","Dentist","DOC2");
        RegisterDoctor registerDoctor = new RegisterDoctor();
        registerDoctor.addDoctor(firstDoctor);
        registerDoctor.addDoctor(secondDoctor);
        assertEquals(2,registerDoctor.getAllDoctor().size());

    }
    @Test
    public void test_that_check_patientID(){
        Patient patient = new Patient("Ayin",21,"PAT12");
        Doctor doctor = new Doctor("Mr.Shibuzo","Dental","DOC1");
        doctor.addPatient(patient);
        doctor.checkPatientID("PAT12");
        assertEquals("PAT12",doctor.viewAllPatient().get(0).getPatientID());
    }
}
