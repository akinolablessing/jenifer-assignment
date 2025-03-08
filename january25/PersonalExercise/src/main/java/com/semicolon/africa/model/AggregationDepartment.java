package main.java.com.semicolon.africa.model;

import java.util.List;

public class AggregationDepartment {
    private String deptName;
    private List<AggregationStudent> students;

    public AggregationDepartment(String deptName, List<AggregationStudent> students) {
        this.deptName = deptName;
        this.students = students;
    }

    public List<AggregationStudent> getStudents() {
        return students;
    }
    public void addStudent(AggregationStudent student){
       students.add(student);
    }
}
