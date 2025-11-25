package com.cinematch.service.impl;

import com.cinematch.entity.Movie;
import com.cinematch.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private List<Movie> movies = new ArrayList<>(List.of(
            new Movie(1L, "Avatar", "Sci-fi movie about Pandora.", 8.5,
                    "https://image.tmdb.org/t/p/w500/jRXYjXNq0Cs2TcJjLkki24MLp7u.jpg"),
            new Movie(2L, "Avatar 2", "The Way of Water.", 8.2,
                    "https://image.tmdb.org/t/p/w500/t6HIqrRAclMCA60NsSmeqe9RmNV.jpg"),
            new Movie(3L, "Avengers", "Marvel superhero movie.", 9.0,
                    "https://image.tmdb.org/t/p/w500/RYMX2wcKCBAr24UyPD7xwmjaTn.jpg"),
            new Movie(4L, "The Dark Knight", "Batman vs Joker.", 9.1,
                    "https://image.tmdb.org/t/p/w500/qJ2tW6WMUDux911r6m7haRef0WH.jpg"),
            new Movie(5L, "Inception", "Dream within a dream.", 8.8,
                    "https://image.tmdb.org/t/p/w500/edv5CZvWj09upOsy2Y6IwDhK8bt.jpg"),
            new Movie(6L, "Interstellar", "Space-time epic.", 8.6,
                    "https://image.tmdb.org/t/p/w500/rAiYTfKGqDCRIIqo664sY9XZIvQ.jpg"),
            new Movie(7L, "Titanic", "Classic romance.", 7.8,
                    "https://image.tmdb.org/t/p/w500/9xjZS2rlVxm8SFx8kPC3aIGCOYQ.jpg"),
            new Movie(8L, "John Wick", "Revenge action film.", 7.4,
                    "https://image.tmdb.org/t/p/w500/fZPSd91yGE9fCcCe6OoQr6E3Bev.jpg"),
            new Movie(9L, "Shutter Island", "Detective investigates asylum.", 8.1,
                    "https://image.tmdb.org/t/p/w500/kve20tXwUZpu4GUX8l6X7Z4jmL6.jpg"),
            new Movie(10L, "Pulp Fiction", "Tarantino masterpiece.", 8.9,
                    "https://image.tmdb.org/t/p/w500/dM2w364MScsjFf8pfMbaWUcWrR.jpg")
    ));

    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public List<Movie> searchMovies(String query) {
        return movies.stream()
                .filter(movie -> movie.getTitle().toLowerCase().contains(query.toLowerCase()))
                .toList();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Movie addMovie(Movie movie) {
        movies.add(movie);
        return movie;
    }
}
