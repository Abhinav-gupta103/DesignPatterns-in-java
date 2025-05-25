package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import enums.City;
import models.Movie.Movie;

public class MovieController {
    Map<City, List<Movie>> cityVsMovie;
    List<Movie> allMovies;

    public MovieController() {
        cityVsMovie = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);

        List<Movie> movies = cityVsMovie.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovie.put(city, movies);
    }

    public Movie getMovieByName(String name) {
        for (Movie movie : allMovies) {
            if (movie.getMovieName().equals(name))
                return movie;
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city) {
        return cityVsMovie.get(city);
    }
}
