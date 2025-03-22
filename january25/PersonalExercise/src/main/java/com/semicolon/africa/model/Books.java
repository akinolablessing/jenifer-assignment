package main.java.com.semicolon.africa.model;

public class Books {
    private String title;
    private String author;
    private int year;

    public Books(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Books(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
