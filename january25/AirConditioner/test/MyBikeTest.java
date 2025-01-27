import main.java.com.semicolon.africa.model.MyBike;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyBikeTest {

    @Test
    public void testThatIHaveBike(){
      MyBike myBike = new MyBike();
      assertTrue(myBike.setIHaveBike());
    }
    @Test
    public void testThatTheBikeIsOff(){
        MyBike myBike = new MyBike();
        assertFalse(myBike.getMyBikeIsON());
    }
    @Test
    public void testThatTheBikeIsOn(){
        MyBike myBike = new MyBike();
        assertTrue(myBike.setMyBikeIsON());
    }
    @Test
    public void testThatMyBikeCanBeAccelerated(){
        MyBike myBike = new MyBike();
        assertTrue(myBike.getMyBikeCanBeAccelerated());
    }
    @Test
    public void testThatMyBikeCanChangeGear(){
        MyBike myBike = new MyBike();
        myBike.setGear();
        myBike.setSpeed();
        myBike.setSpeed();
        assertEquals(myBike.getGear(),2);
    }
    @Test
    public void testThatIncrementGearOne(){
        MyBike myBike = new MyBike();
        myBike.setGear();
        myBike.setGear();
        myBike.setSpeed();
        //myBike.setMyBikeGear();
        assertEquals(myBike.getGear(),3);
    }
 @Test
    public void testThatIncreaseGearTwo(){
       MyBike myBike = new MyBike();
     myBike.setSpeed();
     myBike.setSpeed();
     myBike.setSpeed();
     myBike.setSpeed();
     myBike.setSpeed();
     myBike.setSpeed();
     myBike.setGear();
        assertEquals(myBike.getGear(),2);
 }


}
