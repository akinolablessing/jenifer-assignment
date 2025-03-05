import main.java.com.semicolon.africa.model.MissingNumber;
import org.junit.Test;

import static main.java.com.semicolon.africa.model.MissingNumber.missingNumber;
import static org.junit.Assert.assertEquals;

public class MissingNumberTest {
    @Test
    public void test_that_get_missing_number() {
         int[] arr = { 1, 2, 3, 5 };
        assertEquals(4,MissingNumber.missingNumber(arr));

    }
    @Test
    public void test_that_get_another_number(){
        int[] arr = {77,78,80};
        int expected = 79;
        assertEquals(expected,MissingNumber.missingNumber(arr));
    }
}
