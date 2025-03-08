package main.java.com.semicolon.africa.model;

import java.util.List;

public class AggregationInstitute {
    private String instituteName;
    private List<AggregationDepartment> departments;

    public AggregationInstitute(String instituteName, List<AggregationDepartment> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }
    public void addDepartment(AggregationDepartment department ){
        departments.add(department);
    }
    public int getTotalStudentsInInstitute(){
        int noOfStudent = 0;
        List<AggregationStudent> students=null;
        for(AggregationDepartment dept : departments){
            students = dept.getStudents();
            for(AggregationStudent student : students){
               noOfStudent++;
            }
        }
        return noOfStudent;
    }
}
