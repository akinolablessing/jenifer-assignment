import main.java.com.semicolon.africa.model.MyBike;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyBikeTest {

    @Test
    public void testThatIHaveBike() {
        MyBike myBike = new MyBike();
        assertTrue(myBike.setIHaveBike());
    }

    @Test
    public void testThatTheBikeIsOff() {
        MyBike myBike = new MyBike();
        assertFalse(myBike.getMyBikeIsOff());
    }

    @Test
    public void testThatTheBikeIsOn() {
        MyBike myBike = new MyBike();
        assertTrue(myBike.setMyBikeIsON());
    }

    @Test
    public void testThatMyBikeCanBeAccelerated() {
        MyBike myBike = new MyBike();
        assertTrue(myBike.getMyBikeCanBeAccelerated());
    }

    @Test
    public void testThatMyBikeCanChangeGear() {
        MyBike myBike = new MyBike();
        myBike.setGear();
        myBike.acceleration();
        myBike.acceleration();

        assertEquals(myBike.getGear(), 1);
    }

    @Test
    public void testThatIncrementGearOne() {
        MyBike myBike = new MyBike();

        myBike.acceleration();
        myBike.acceleration();

        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.acceleration();
        myBike.setGear();
        assertEquals(myBike.getGear(), 2);
    }
}

