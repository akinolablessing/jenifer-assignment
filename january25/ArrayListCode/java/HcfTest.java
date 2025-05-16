import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HcfTest {
    @Test
    public void testMoreThanTwoNumbers() {
        int result = Hcf.getHcf(12, 15, 18);
        assertEquals(3, result);
    }
    @Test
    public void testTwoNumber(){
        int result = Hcf.getHcf(24,36,48);
        assertEquals(12,result);
    }

}
