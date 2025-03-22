package main.java.com.semicolon.africa.model;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MovieApp movieApp = new MovieApp();
        Exceptional exceptional = new Exceptional();

        while (true){
            System.out.println("""
                   `~~~~~~ Welcome to Ayo's Movie App Menu~~~~~~
                   1.Add a Movie
                   2.View All Movies
                   3.Search for a Movies
                   4.Exist
                    """);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter movie title:");
                    String title = scanner.next();
                    if(!exceptional.checkForTitle(title)){
                        System.out.println("Error \uD83D\uDC94❌\uD83D\uDC97");
                    }
                    System.out.println("Enter the year:");
                    int year = scanner.nextInt();

                    System.out.println("Rate the movie: ");
                    int rate = scanner.nextInt();

                    Movies movies = new Movies(title,year,rate);
                   movieApp.addMovie(movies);
                   System.out.println("Movie Added Successfully ✅");

                   break;
                case 2:
                    System.out.println("""
                            ~~List of movies~~
                            """);
                    for(Movies move : movieApp.getAllMovies()){
                       System.out.println(move);
                    }
                    break;
                case 3:
                    System.out.println("Enter movie title:");
                    String findMovie = scanner.next();
                    Movies foundMovie = movieApp.searchMovieByTittle(findMovie);
                    if(foundMovie != null){
                        System.out.println("Movie Found:"+foundMovie);
                    }
                    else {
                        System.out.println("Movie Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Existing the App.Thank you!!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid input!!");
            }

        }
    }
}
