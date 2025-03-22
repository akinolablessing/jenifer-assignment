package main.java.com.semicolon.africa.model;

import java.util.Scanner;

public class BookMainApp {
    static Scanner scanner = new Scanner(System.in);
   static LibraryManagement libraryManagement = new LibraryManagement();
public static void main(String[] args){

while (true) {
    System.out.println("""
            ~~~AYO'S BOOKS APP MANAGEMENT~~~
            1.Add Book
            2.Remove Book
            3.View Books
            4.Search Books
            """);
    int choice = scanner.nextInt();
    switch (choice){
        case 1:
            addBook();
            break;
        case 2:
            deleteBook();
            break;
        case 3:
            viewBooks();
            break;
        case 4:
            searchBook();
            break;
        default:
            System.out.println("Invalid Input!!!");
            break;
    }
}
}
public static void addBook(){
    System.out.println("Enter the name of the title:");
    String title = scanner.next();
    System.out.println("Enter the Author name: ");
    String author = scanner.next();
    System.out.println("Enter the year: ");
    int year = scanner.nextInt();
    Books books = new Books(title,author,year);
    libraryManagement.addBook(books);
    System.out.println("Book Added Successfully");
}
public static void deleteBook(){
    System.out.println("Enter the title name:");
    String fineTitle = scanner.next();
    Books books = libraryManagement.searchBooks(fineTitle);
    libraryManagement.removeBooks(books);
    if(books != null){
        System.out.println("Book deleted:"+books);
    }
    else {
        System.out.println("Not deleted!!");
    }
}
public static void viewBooks(){
    System.out.println("""
            ~~~View Books~~~
            """);
    for(Books books: libraryManagement.viewBooks()){
        System.out.println(books);
    }
}
public static void searchBook(){
    System.out.println("Enter the title name:");
    String fineTitle = scanner.next();
    Books books = libraryManagement.searchBooks(fineTitle);
    if(books != null){
        System.out.println("Book Found:"+books);
    }
    else {
        System.out.println("Book Not Found!!");
    }
}
}
