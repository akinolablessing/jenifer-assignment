import main.java.com.semicolon.africa.model.MyTv;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTvTest {

    @Test
    public void test_that_offTv() {
        MyTv myTv = new MyTv();
        assertFalse(myTv.myTvIsOff());
    }
    @Test
    public void test_that_onTv2() {
        MyTv myTv = new MyTv();
        assertTrue(myTv.myTvIsOn());
    }

}
