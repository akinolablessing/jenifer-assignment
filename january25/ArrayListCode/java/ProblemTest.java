import main.java.com.semicolon.africa.model.Problem;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProblemTest {
    @Test
    public void testThatHaveProblem(){

        Problem problem = new Problem();
      assertFalse(problem.getIsSolved());
    }


}