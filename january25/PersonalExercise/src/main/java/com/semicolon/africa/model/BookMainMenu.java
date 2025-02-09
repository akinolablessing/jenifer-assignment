package main.java.com.semicolon.africa.model;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book: ");
        String name = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the year of the book: ");
        int year = sc.nextInt();


        Book book1 = new Book(name,author,year);
        Book book2 = new Book(year);
        Book.addBook(book1);
        Book.addBook(book2);

        ArrayList<Book> books = Book.getBooks();
        System.out.println("List of books: ");

        for(Book book : books){
            System.out.println("{TITLE: "+book.getTitle()+ " |AUTHOR: " + book.getAuthor() + " |YEAR:" + book.getYear()+"}");
        }
        Book.removeBook(book2);
        System.out.println("After Removing Books: ");
        for(Book book : books){
            System.out.println("{TITLE: "+book.getTitle()+ " |AUTHOR: " + book.getAuthor() + " |YEAR:" + book.getYear()+"}");
        }
       }
    }
