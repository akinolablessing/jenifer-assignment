import main.java.com.semicolon.africa.model.MovieApp;
import main.java.com.semicolon.africa.model.Movies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class movieTest {
    @Test
    public void test_that_add_movie() {
    MovieApp movieApp = new MovieApp();
    Movies movies = new Movies("kesari", 2021, 15);
    movieApp.addMovie(movies);
    assertEquals(1,movieApp.getAllMovies().size());
    assertEquals("kesari",movieApp.getAllMovies().get(0).getTitle());
}
@Test
    public void test_that_search_movie_by_title(){
    MovieApp movieApp = new MovieApp();
    Movies movies = new Movies("kesari", 2021, 15);
    movieApp.addMovie(movies);
    Movies result = movieApp.searchMovieByTittle("kesari");
    assertEquals("kesari",result.getTitle());
}
@Test
    public void test_that_get_all_movies(){
        MovieApp movieApp = new MovieApp();
        movieApp.addMovie(new Movies("JayeOba",2001,21));
        movieApp.addMovie(new Movies("Lakitipo",2000,12));
        assertEquals(2,movieApp.getAllMovies().size());
}
}
