package com.ics.soap;

import localhost.movies.Movie;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class MovieRepository {

    private static Map<String, Movie> movies = new HashMap<>();
    @PostConstruct
    public void populateMovies(){
        Movie movie = new Movie();
        movie.setGenre("Science Fiction");
        movie.setName("The Flash");
        movie.setYearReleased(2016);

        Movie movie1 = new Movie();
        movie.setGenre("Science Fiction");
        movie.setName("The Flash");
        movie.setYearReleased(2016);

        Movie movie2 = new Movie();
        movie.setGenre("Science Fiction");
        movie.setName("The Flash");
        movie.setYearReleased(2016);

        movies.put(movie.getName(), movie);
    }

    public Movie getMovie(String name){
        return movies.get(name);
    }
}
