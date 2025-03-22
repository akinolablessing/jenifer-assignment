package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagement {
    private List<Books> library;

    public LibraryManagement(){
        this.library = new ArrayList<>();
    }
    public void addBook(Books books){
      library.add(books);
    }
    public void removeBooks(Books books){
        library.remove(books);
    }
    public List<Books> viewBooks(){
      return library;
    }
    public Books searchBooks(String book){
        for(Books books : library){
           if(books.getTitle().equalsIgnoreCase(book)){
               return books;
           }
        }
        return null;
    }
}
