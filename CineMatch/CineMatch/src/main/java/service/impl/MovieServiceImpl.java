package com.cinematch.cinematch.service.impl;

import com.cinematch.cinematch.entity.Movie;
import com.cinematch.cinematch.repository.MovieRepository;
import com.cinematch.cinematch.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> searchMovies(String query) {
        return movieRepository.findByTitleContainingIgnoreCase(query);
    }
}
