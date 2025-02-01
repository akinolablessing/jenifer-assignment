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
    }

}

