import main.java.com.semicolon.africa.model.Course;
import main.java.com.semicolon.africa.model.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CourseTest {
    @Test
    public void test_that_test_the_constructor(){
        Course course = new Course("Math","CSD101");
        assertEquals("Math",course.getCourseName());
        assertEquals("CSD101",course.getCourseID());
    }
    @Test
    public void test_that_enroll_students(){
        Course course = new Course("Eng","CSD001");
        Student student = new Student("Onyii","ayomide","ayomi@312","love12");
        course.enrollStudents(student);
        assertTrue(course.getEnrolledStudents().contains(student));
    }
}
