package main.java.com.semicolon.africa.model;

public class AggregationStudent {
    private String studentName;
    private int studentId;

    public AggregationStudent(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }
}
