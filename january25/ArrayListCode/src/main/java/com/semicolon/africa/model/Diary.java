package main.java.com.semicolon.africa.model;

import java.time.LocalDate;

public class Diary {
private String username;
private String password;
private boolean isLocked = true;
private boolean iHaveDiary = true;
private boolean isEmptyDiary = true;


    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Diary(){

    }

    public void createEntry(String content, LocalDate time, String title){
        this.content = content;
        this.time = time;
        this.title = title;
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

}
