package com.cinematch.cinematch.controller;

import com.cinematch.cinematch.entity.Movie;
import com.cinematch.cinematch.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies/search")
    public List<Movie> searchMovies(@RequestParam String query) {
        return movieService.searchMovies(query);
    }
}
