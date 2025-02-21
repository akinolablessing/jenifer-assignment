package main.java.com.semicolon.africa.model;

public class Movies {
    private static String title;
    private static String director;
    private static int duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static String getMovieDetails(){
        return "Movie!! Title : "+title+" Director : "+ director+ " Duration :"+duration;
    }
}
