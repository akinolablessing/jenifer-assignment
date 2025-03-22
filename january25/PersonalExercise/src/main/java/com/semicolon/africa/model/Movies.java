package main.java.com.semicolon.africa.model;

public class Movies {
    private String title;
    private int year;
    private int rate;

    public Movies(String title, int year, int rate) {
        this.title = title;
        this.year = year;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movie='" + title + '\'' +
                ", year=" + year +
                ", rate=" + rate +
                '}';
    }
}
