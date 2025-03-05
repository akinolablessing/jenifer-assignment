import main.java.com.semicolon.africa.model.SecondMultiple;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultipleTest {
    @Test
    public void testGenerateMultiples_NoMultiples() {
        SecondMultiple generator = new SecondMultiple();
        int[] result = generator.generateMultiples(1, 10, 11);
        assertEquals(0, result.length);
    }
    @Test
    public void testGenerateMultiples_MultipleMultiples() {
        SecondMultiple generator = new SecondMultiple();
        int[] result = generator.generateMultiples(1, 10, 2);
        assertEquals(5, result.length);
        assertEquals(2, result[0]);
        assertEquals(4, result[1]);
        assertEquals(6, result[2]);
        assertEquals(8, result[3]);
        assertEquals(10, result[4]);
    }


}
