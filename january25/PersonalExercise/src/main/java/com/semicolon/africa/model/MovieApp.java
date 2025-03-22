package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class MovieApp {
    private List<Movies> movies;

    public MovieApp() {
        this.movies = new ArrayList<>();
    }
   public void addMovie(Movies movie){
        movies.add(movie);
   }
   public List<Movies>  getAllMovies(){
        return movies;
    }
    public Movies searchMovieByTittle(String title){
        for(Movies userMovie : movies){
            if(userMovie.getTitle().equalsIgnoreCase(title)){
               return userMovie;
            }
        }

        return null;
    }
}
