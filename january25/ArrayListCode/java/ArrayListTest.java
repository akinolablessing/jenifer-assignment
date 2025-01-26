import main.java.com.semicolon.africa.model.ArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {
    @Test
    public void testThatTheArrayListIsEmpthy(){
        ArrayList arrayList = new ArrayList();
        assertTrue(arrayList.isEmpty());
    }
    @Test
    public void addToEmptyOfArrayList(){
      ArrayList arrayList = new ArrayList();
      arrayList.add(2);
      arrayList.add("Blessing");
      arrayList.add("Joy");
      arrayList.add("Christianah");
      arrayList.add("Ayo");
        arrayList.add("Blessing");
        arrayList.add("Joy");
        arrayList.add("Christianah");
        arrayList.add("Ayo");
        arrayList.add("Blessing");
        arrayList.add("Joy");
        arrayList.add("Christianah");
        arrayList.add("Ayo");
        arrayList.add("Blessing");
        arrayList.add("Joy");
        arrayList.add("Christianah");
      assertEquals(16,arrayList.size());
    }

    @Test
public void removeMethod(){
   ArrayList arrayList = new ArrayList();
    arrayList.add("Ayo");
    arrayList.add("Blessing");
    arrayList.add("Joy");
    assertEquals(true,arrayList.removeMethod("Joy"));
    assertEquals(2,arrayList.size());

}
@Test
public void sizeMethod(){
    ArrayList arrayList = new ArrayList();
    arrayList.add("Ayo");
    arrayList.add("Blessing");
    arrayList.add("Joy");
    assertEquals("joy",arrayList.getElements(2));
    //assertEquals("joy",arrayList.size());

}

}
