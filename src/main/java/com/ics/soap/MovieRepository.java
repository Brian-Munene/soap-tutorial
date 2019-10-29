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
        movie.setName("The Boys");
        movie.setYearReleased(2019);

        Movie movie1 = new Movie();
        movie1.setGenre("Science Fiction");
        movie1.setName("Titans");
        movie1.setYearReleased(2016);

        Movie movie2 = new Movie();
        movie2.setGenre("Science Fiction");
        movie2.setName("The Flash");
        movie2.setYearReleased(2016);

        movies.put(movie.getName(), movie);
        movies.put(movie1.getName(),movie1);
        movies.put(movie2.getName(), movie2);
    }

    public Movie getMovie(String name){
        return movies.get(name);
    }
}
