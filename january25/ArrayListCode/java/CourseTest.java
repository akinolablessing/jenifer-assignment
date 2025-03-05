import main.java.com.semicolon.africa.model.Course;
import main.java.com.semicolon.africa.model.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseTest {
    @Test
    public void test_that_test_the_constructor(){
        Course course = new Course("Math","CSD101");
        assertEquals("Math",course.getCourseName());
        assertEquals("CSD101",course.getCourseID());
    }
}
