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
       Entry entry = new Entry(1, "My Story","I love myself");
       assertNotNull(entry);

   }
   @Test
    public void testThatSaveDiaryEntry(){
       Entry entry = new Entry(1, "My Story","I love myself");
       Diary diary = new Diary();
       diary.saveEntry(entry);
       assertTrue(diary.saveEntry(entry));

   }
   @Test
    public void testThatDeleteDiaryEntry(){
       Diary diary = new Diary();
       Entry entry = new Entry(1, "My Story","I love myself");
       diary.saveEntry(entry);
       assertTrue(diary.deleteEntry(entry));
   }
   @Test
    public void testThatFindEntryById(){
       Diary diary = new Diary();
       Entry entry = new Entry(1, "My Story","I love myself");
       Entry entry1 = new Entry(2, "My Sty","I love mlf");
       diary.saveEntry(entry);
       diary.saveEntry(entry1);
       assertEquals(entry,diary.findEntryById(entry));
   }
   @Test
    public void testThatUpdateDiaryEntry(){
       Diary diary = new Diary();
       Entry entry = new Entry(1, "My Story","I love myself");
       Entry entry1 = new Entry(2, "My Story","I love self");
       Entry entry2 = new Entry(3, "My Story","I love myself,I love self");
       diary.saveEntry(entry);
       diary.updateDiary(entry2);
       assertEquals(entry2,diary.findEntryById(entry2));
   }
}
