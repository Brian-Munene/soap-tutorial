package com.ics.soap;

import localhost.movies.GetMovieRequest;
import localhost.movies.GetMovieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class MovieEndpoint {
    private static final String NAMESPACE_URI = "http://localhost/movies";


    private MovieRepository movieRepository;


    @Autowired
    public MovieEndpoint(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMovieRequest")
    @ResponsePayload
    public GetMovieResponse getCountry(@RequestPayload GetMovieRequest request) {
        GetMovieResponse response = new GetMovieResponse();
        response.setMovie(movieRepository.getMovie(request.getName()));
        return response;
    }
}


































































