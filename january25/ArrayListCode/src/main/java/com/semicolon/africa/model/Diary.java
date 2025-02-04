package main.java.com.semicolon.africa.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Diary {
private String username;
private String password;
private boolean isLocked = true;
private boolean iHaveDiary = true;
private boolean isEmptyDiary = true;
ArrayList<Entry> entries = new ArrayList<>();

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Diary(){

    }

   public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
   }

   public boolean isLocked() {
        return isLocked;
   }
   public void setIHaveDiary(boolean iHaveDiary) {
        this.iHaveDiary = iHaveDiary;
   }
   public boolean isIHaveDiary() {
        return iHaveDiary;
   }
   public void setEmptyDiary(boolean emptyDiary) {
        this.isEmptyDiary = emptyDiary;
   }
   public boolean isEmptyDiary() {
        return isEmptyDiary;
   }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String pinCode) {
      this.password = pinCode;
    }

    public String getPassword() {
        return password;
    }

    public boolean lockDiary(String number, String name) {
        if (this.password.equals(password) && this.username.equals(username)) {
            this.isLocked = true;
        }
        return false;
    }
    public boolean unlockDiary(String password, String username) {
        if (this.password.equals(password) && this.username.equals(username)) {
            this.isLocked = false;
        }
        return true;
    }
    public boolean saveEntry(Entry entry){
        this.entries.add(entry);
        if(this.entries.size() > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean deleteEntry(Entry entry1) {
        for (Entry entry : entries) {
            if (entry.getId() == entry1.getId()) {
                entries.remove(entry1);
                return true;
            }
            if (entries.contains(entry)) {
                return false;
            }
        }
        return false;
    }


    public Entry findEntryById(Entry entry2) {
      for (Entry entryTwo : entries) {
          if(entryTwo.getId() == entry2.getId()){
            return entryTwo;
          }
      }

        return entry2;
    }

    public Object updateDiary(Entry entry) {
        for(Entry entry2 : entries){
          if(entry2.getId() == entry.getId()){
            entry2.setTitle(entry.getTitle());
            entry2.setBody(entry.getBody());
            entries.add(entry2);
          }
        }
        return entries;
    }

    @Override
    public String toString() {
        return this.username + this.entries.toString()
                +this.iHaveDiary + this.isEmptyDiary
                +this.entries.toString()+ this.password
                +this.isEmptyDiary + this.isLocked();
    }

}
