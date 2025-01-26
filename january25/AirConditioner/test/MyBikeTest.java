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
    public void testThatMyBikeDeccelerateAtGear1DecreamentByOne(){
        MyBike myBike = new MyBike();
        myBike.setDecreaseGearOne();
        myBike.setDecreaseGearOne();
        myBike.setDecreaseGearOne();
        assertEquals(myBike.getDecreaseGearOne(),17);
    }
    @Test
    public void testThatMyBikeAccelerateAtGear1(){
      MyBike myBike = new MyBike();
      assertEquals(myBike.getIncreseGearOne(),20);
    }
   @Test
    public void testThatMyBikeDeccelerateAtGear2DecrementByTwo(){
        MyBike myBike = new MyBike();
        myBike.setDecreaseGearTwo();
        myBike.setDecreaseGearTwo();
        myBike.setDecreaseGearTwo();
        myBike.setDecreaseGearTwo();
        myBike.setDecreaseGearTwo();
        myBike.setDecreaseGearTwo();
        myBike.setDecreaseGearTwo();
        myBike.setDecreaseGearTwo();
        assertEquals(myBike.getDecreaseGearTwo(),14);
   }

}
