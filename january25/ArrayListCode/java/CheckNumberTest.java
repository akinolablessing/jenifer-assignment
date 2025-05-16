import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CheckNumberTest {

    @Test
    public void testIsRotation() {
        String actual = "abcde";
        String expected = "cdeab";
        assertTrue(CheckNumber.isRotation(actual,expected ));

    }
    @Test
    public void testTheNumber(){
        String actual = "13456";
        String excepted = "56134";
        assertTrue(CheckNumber.isRotation(actual,excepted));
    }
    @Test
    public void testTheLetter(){
        String actual = "cba";
        String excepted = "abc";
        assertFalse(CheckNumber.isRotation(actual,excepted));
    }
}
