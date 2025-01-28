import main.java.com.semicolon.africa.model.MyQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyQueueTest {
    @Test
    public void testThatMyQueueIsEmpty(){
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.isEmpthy());
    }
    @Test
    public void testThatEnqueueElement(){
     MyQueue myQueue = new MyQueue();
     myQueue.enqueue("Ayomide");
     assertEquals("Ayomide",myQueue.enqueueElement());

    }

}
