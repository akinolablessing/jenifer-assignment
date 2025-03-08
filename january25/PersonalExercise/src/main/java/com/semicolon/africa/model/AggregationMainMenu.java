package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class AggregationMainMenu {
    public static void main(String[] args){
        AggregationStudent stu1 = new AggregationStudent("Ayo",54);
        AggregationStudent stu2 = new AggregationStudent("Estee",2);
        AggregationStudent stu3 = new AggregationStudent("Onyii",12);
        AggregationStudent stu4 = new AggregationStudent("chris",2);

        List<AggregationStudent> es_student = new ArrayList<>();
        es_student.add(stu1);
        es_student.add(stu2);

        List<AggregationStudent> cs_student = new ArrayList<>();
        cs_student.add(stu3);
        cs_student.add(stu4);

        AggregationDepartment cce = new AggregationDepartment("Eng",es_student);
        AggregationDepartment sse = new AggregationDepartment("Math",cs_student);

        List<AggregationDepartment> depart = new ArrayList<>();
        depart.add(cce);
        depart.add(sse);

        AggregationInstitute institute = new AggregationInstitute("Semicolon",depart);

        System.out.println("Total students in institute: ");
        System.out.print(institute.getTotalStudentsInInstitute());
    }
}
