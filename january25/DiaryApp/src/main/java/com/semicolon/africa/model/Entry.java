package main.java.com.semicolon.africa.model;

import java.time.LocalDateTime;
public class Entry{
  private LocalDateTime time;
  private String title;
  private String content;

  public LocalDateTime getTime(){
      return time;
  }
  public String getTitle(){
     return title;
  }
  public String getContent(){
     return content;
  }
  public void setTime(LocalDateTime time){
      this.time = time;

  }
  public void setTitle(String title){
      this.title = title;

  }
  public void setContent(String content){
      this.content = content;

  }
}
