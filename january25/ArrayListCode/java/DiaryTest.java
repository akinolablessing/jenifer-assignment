import main.java.com.semicolon.africa.model.Diary;
import main.java.com.semicolon.africa.model.Entry;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class DiaryTest {
   @Test
    public void testThatCreateDiary() {
       Diary diary = new Diary("Ayomide","1234");
       diary.setPassword("1234");
       assertEquals("Ayomide",diary.getUsername());
       //assertEquals("1234",diary.pinCode());
   }
  @Test
  public void testThatLockedDiary() {
     Diary diary = new Diary("Ayomide","1234");
     assertFalse(diary.lockDiary("1234","Ayomide"));
  }
   @Test
   public void testThatUnlockedDiary() {
      Diary diary = new Diary("Ayomide","1234");
      assertTrue(diary.unlockDiary("1234","Ayomide"));

   }
   @Test
    public void testThatCreateEntry(){
       Diary diary = new Diary("Ayomide","1234");
       diary.setPassword("1234");
   }
   @Test
    public void testThatCreateDiaryEntry(){
       Diary diary = new Diary();
       diary.createEntry();

   }
}
