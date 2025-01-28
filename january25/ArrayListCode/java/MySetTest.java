import main.java.com.semicolon.africa.model.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MySetTest {
    MySet mySet;

    @BeforeEach
   public void setUp(){
       mySet = new MySet();
   }
   @Test
    public void testThatMySetIsEmpty(){
        assertTrue(mySet.isEmpty());
   }
   @Test
    public void addValue1Value2_checkIfEmpty_testMySet(){
        mySet.add("Ayomide");
        mySet.add("Fish");
        assertFalse(mySet.isEmpty());
   }
   @Test
    public void addValue1Value2_getValue1Value2_testMySet(){
       mySet.add("Ayomide");
       mySet.add("Fish");
       assertEquals("Ayomide",mySet.get(0));
      // assertEquals("Fish",mySet.getElements(1));
   }
}
