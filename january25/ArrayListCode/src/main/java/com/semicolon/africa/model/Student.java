package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentName;
    private String studentID;
    private Object password;
    private List<Course> enrolledCourses;

    public Student(String studentName, String studentID, Object password) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.password = password;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public Object getPassword() {
        return password;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
    public void enrollCourses(Course course){
       enrolledCourses.add(course);
    }
    public void dropCourses(Course course){
        enrolledCourses.remove(course);
    }
}
