package main.java.com.semicolon.africa.model;

public class StudentCourseMenu {
    public static void main(String[] args) {
        StudentCourse studentCourse1 = new StudentCourse("Esther",11);
        StudentCourse studentCourse2 = new StudentCourse("Joy",12);
        StudentCourse studentCourse3 = new StudentCourse("Ayo",13);
        System.out.println("Student details");
        studentCourse1.addCourse("physics");
        studentCourse1.addCourse("math");
        studentCourse1.addCourse("chemistry");
        studentCourse1.addCourse("engineering");
        System.out.println("Adding courses for studend1 : "+studentCourse1.getName()+""+studentCourse1.getCourses());
        studentCourse2.addCourse("java");
        studentCourse2.addCourse("python");
        studentCourse2.addCourse("c++");
        studentCourse2.addCourse("javascript");
        System.out.println("Adding courses for studend2 : "+studentCourse2.getName()+""+studentCourse2.getCourses());
        studentCourse3.addCourse("internet");
        studentCourse3.addCourse("programming");
        studentCourse3.addCourse("chm");
        studentCourse3.addCourse("engineer");
        System.out.println("Adding courses for studend3 : "+studentCourse3.getName()+""+studentCourse3.getCourses());

        System.out.println("Removing physics for:"+studentCourse1.getName());
        studentCourse1.removeCourse("physics");
        System.out.println(studentCourse1.getName()+" don't have physics"+studentCourse1.getCourses());
    }
}
