import main.java.com.semicolon.africa.model.CountXO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCountXO {

    @Test
public void test_X_to_return_1(){
        CountXO countXO = new CountXO();
        String[] actual = {"x"} ;
        int expected = 1  ;
        assertEquals(expected,countXO.countXandO(actual));
    }
@Test
    public void test_O_to_return_0(){
    CountXO countXO = new CountXO();
    String[] actual = {"o"};
    int expected = 0;
    assertEquals(expected,countXO.countXandO(actual));
 }
//@Test
//    public void test_XO_to_return_1_and_0(){
//    CountXO countXO = new CountXO();
//    String[] actual = {"x","o"};
//    int expected = 10;
//    assertEquals(expected,countXO.countXandO(actual));
//}

}
