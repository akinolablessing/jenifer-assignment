package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String firstName;
    private String lastName;
    private Object password;
    private String gmail;
    private List<Course> courses;

    public Instructor(String instructorName,String lastName,Object password,String gmail) {
        this.firstName = instructorName;
        this.lastName = lastName;
        this.lastName = lastName;
        this.courses = new ArrayList<>();
        this.password = password;
        this.gmail = gmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Object getPassword(){
        return password;
}
  public String getGmail(){
  return gmail;
}
    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
       courses.add(course);
    }
    public void viewEnrolledStudents(Course course){
        System.out.println( "Enrolled student for "+course.getCourseName()+ ":") ;

      for(Student student : course.getEnrolledStudents()){
          System.out.println(student.getfName());
      }
    }
    public boolean scoreStudent(Course course,Student student,double score){
        student.setScore(course,score);
        return true;
    }
}
