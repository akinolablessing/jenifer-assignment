import main.java.com.semicolon.africa.model.MyArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyArrayListTest {
    @Test
    public void testThatTheArrayListIsEmpthy(){
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addToEmptyOfArrayList(){
      MyArrayList myArrayList = new MyArrayList();
      myArrayList.add(2);
      myArrayList.add("Blessing");
      myArrayList.add("Joy");
      myArrayList.add("Christianah");
      myArrayList.add("Ayo");
        myArrayList.add("Blessing");
        myArrayList.add("Joy");
        myArrayList.add("Christianah");
        myArrayList.add("Ayo");
        myArrayList.add("Blessing");
        myArrayList.add("Joy");
        myArrayList.add("Christianah");
        myArrayList.add("Ayo");
        myArrayList.add("Blessing");
        myArrayList.add("Joy");
        myArrayList.add("Christianah");
      assertEquals(16, myArrayList.size());
    }

    @Test
public void removeMethod(){
   MyArrayList myArrayList = new MyArrayList();
    myArrayList.add("Ayo");
    myArrayList.add("Blessing");
    myArrayList.add("Joy");
    assertEquals(true, myArrayList.removeMethod("Joy"));
    assertEquals(2, myArrayList.size());

}
@Test
public void sizeMethod(){
    MyArrayList myArrayList = new MyArrayList();
    myArrayList.add("Ayo");
    myArrayList.add("Blessing");
    myArrayList.add("Joy");
    assertEquals("joy", myArrayList.getElements(2));
    //assertEquals("joy",myArrayList.size());

}

}
