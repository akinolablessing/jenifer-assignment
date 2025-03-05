import main.java.com.semicolon.africa.model.TikTakToe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TikTakToeTest {
   @Test
   public void testSetSize() {
       TikTakToe tikTakToe = new TikTakToe();
       int[] segments = new int[7];
       tikTakToe.setSize(segments);
       assertEquals(7, segments.length);
   }

}
