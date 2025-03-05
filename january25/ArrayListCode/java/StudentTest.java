import main.java.com.semicolon.africa.model.Course;
import main.java.com.semicolon.africa.model.Student;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class StudentTest {


@Test
    public void test_student_constructor(){
    Student student = new Student("Ayomide","STU001",2001);
    assertEquals("Ayomide",student.getStudentName());
    assertEquals("STU001",student.getStudentID());
    assertEquals(2001,student.getPassword());
}
@Test
    public void test_that_enrollCourses(){
    Student student = new Student("Ayomide","STU001",2001);
    Course course = new Course("Math","STU001");
    student.enrollCourses(course);
    assertTrue(student.getEnrolledCourses().contains(course));
}
@Test
    public void test_that_drop_courses(){
    Student student = new Student("Ayomide","STU001",2001);
    Course course = new Course("Math","STU001");
    student.enrollCourses(course);
    student.dropCourses(course);
    assertFalse(student.getEnrolledCourses().contains(course));
}
}
