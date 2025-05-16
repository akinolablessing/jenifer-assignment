import main.java.com.semicolon.africa.model.Course;
import main.java.com.semicolon.africa.model.Instructor;
import main.java.com.semicolon.africa.model.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InstructorTest {
    @Test
    public void test_instructor_constructor(){
        Instructor instructor = new Instructor("Chibuzo", "Shikiru",12345,"ayomi13@gmail.com");
        assertEquals("Chibuzo",instructor.getFirstName());
        assertEquals("Shikiru",instructor.getLastName());
        assertEquals(12345,instructor.getPassword());
        assertEquals("ayomi13@gmail.com",instructor.getGmail());
    }
    @Test
    public void test_that_add_course(){
        Instructor instructor = new Instructor("Chibuzo", "Shikiru","john@12","ayomi13@gmail.com");
        Course course = new Course("French","CSD21");
        instructor.addCourse(course);
        assertTrue(instructor.getCourses().contains(course));
    }
    @Test
    public void test_that_view_enrolled_course(){
        Instructor instructor = new Instructor("Chibuzo", "Shibuzo",43456,"ayomi13@gmail.com");
        Course course = new Course("Bio","CSD31");
        Student student1 = new Student("Steven","dog","ajhrej@321",321);
        Student student2 = new Student("Gloria","beauty","hjreiiiii##4",1234);
        course.enrollStudents(student1);
        course.enrollStudents(student2);
        instructor.addCourse(course);
        instructor.viewEnrolledStudents(course);

    }
    @Test
    public void test_that_score_students(){
        Instructor instructor = new Instructor("Chibuzo", "Shibuzo","lamon123","ayomi13@gmail.com");
        Course course = new Course("Bio","CSD31");
        Student student1 = new Student("Steven","STU5","loveth@!23",13);
        course.enrollStudents(student1);
        instructor.addCourse(course);
        instructor.scoreStudent(course,student1,4.2);
        assertTrue(instructor.scoreStudent(course,student1,4.2));
    }
}
