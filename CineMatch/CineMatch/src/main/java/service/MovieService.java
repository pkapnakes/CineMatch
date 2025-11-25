package com.cinematch.cinematch.service;

import com.cinematch.cinematch.entity.Movie;
import java.util.List;

public interface MovieService {
    List<Movie> searchMovies(String query);
}
