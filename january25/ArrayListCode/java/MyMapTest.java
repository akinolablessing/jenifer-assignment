import main.java.com.semicolon.africa.model.MyMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class MyMapTest {
    private MyMap myMap;

    @BeforeEach
    public void setUp() {
      myMap = new MyMap();
    }
   @Test
  public void testIfTestIsEmpty(){
        Assertions.assertTrue(myMap.isEmpty());
   }
   @Test
    public void addValue1Value2_checkSize2_testMymap(){
      myMap.put("1","Ayomide");
      myMap.put("2","Blessing");
      assertEquals(2, myMap.size());
   }
   @Test
    public void addValue1Value2_geValue1Value2_testMymap(){
       myMap.put("1","Ayomide");
       myMap.put("2","Blessing");
       assertEquals("Ayomide",myMap.get("1"));
       assertEquals("Blessing", myMap.get("2"));
   }

}
