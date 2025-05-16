package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String fName;
    private String sName;
    private String email;
    private Object password;
    private List<Course> enrolledCourses;
    private List<Double> scores;

    public Student(String fName,String sName, String email, Object password) {
        this.fName = fName;
        this.sName = sName;
        this.email = email;
        this.password = password;
        this.enrolledCourses = new ArrayList<>();
        this.scores = new ArrayList<>();
    }

    public String getfName() {
        return fName;
    }
    public String getsName(){
      return sName;
    }
    public String getEmail() {
        return email;
    }

    public Object getPassword() {
        return password;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public List<Double> getScores() {
        return scores;
    }

    public void enrollCourses(Course course){
       enrolledCourses.add(course);
    }
    public void dropCourses(Course course){
        enrolledCourses.remove(course);
    }
    public void setScore(Course course,double score){
        enrolledCourses.add(course);
        scores.add(score);
    }

    @Override
    public String toString() {
        return email +" _ "+ fName;
    }
}
