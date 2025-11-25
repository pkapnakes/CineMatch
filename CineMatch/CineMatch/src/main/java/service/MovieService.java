package com.cinematch.service;

import com.cinematch.entity.Movie;
import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();
    List<Movie> searchMovies(String query);
    Movie getMovieById(Long id);
    Movie addMovie(Movie movie);
}
