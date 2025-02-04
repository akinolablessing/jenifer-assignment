package main.java.com.semicolon.africa.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id, String title,String body){
      this.title=title;
      this.body=body;
      this.id=id;
      this.dateCreated=LocalDateTime.now();
    }
 public int getId() {
        return id;
 }
 public void setId(int id) {
        this.id = id;
 }
 public String getTitle() {
        return title;
 }
 public void setTitle(String title) {
        this.title = title;
 }
 public String getBody() {
        return body;
 }
 public void setBody(String body) {
        this.body = body;
 }
 public LocalDateTime getDateCreated() {
        return dateCreated;
 }
 public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
 }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }
}

