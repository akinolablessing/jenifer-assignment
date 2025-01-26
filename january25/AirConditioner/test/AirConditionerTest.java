import main.java.com.semicolon.africa.model.AirConditioner;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirConditionerTest {

    @Test
    public void testThatIhaveAnAc(){
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.setIhaveAnAc());
    }
    @Test
    public void testThatTheACisOff(){
        AirConditioner airConditioner = new AirConditioner();
        assertFalse(airConditioner.getIsOn());
    }
    @Test
    public void testThatTheACisOn(){
        AirConditioner airConditioner = new AirConditioner();
        assertTrue(airConditioner.setIsOn());
    }
    @Test
    public void testThatTheTemperatureDecreases(){
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.setDecreaseTemperature();
        airConditioner.setDecreaseTemperature();
        airConditioner.setDecreaseTemperature();
        assertEquals(airConditioner.getDecreaseTemperature(), 27);
    }
    @Test
    public void testThatTheTemperatureIncreases(){
        AirConditioner airConditioner = new AirConditioner();

        assertEquals(airConditioner.getIncreaseTemperature(),30);
    }

}
