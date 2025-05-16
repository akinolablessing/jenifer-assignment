package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String courseID;
    private List<Student> enrolledStudents;

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void enrollStudents(Student student){
      enrolledStudents.add(student);
    }
    public String toString(){
        return courseID +" _ "+courseName;

    }
}
