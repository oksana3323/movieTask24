package services;

import models.Movie;

import java.util.List;

public interface Find {
    List<Movie> getAllMovies(List<Movie>movies);
    void findMovieByName(String name,List<Movie>movies);
    void findMovieByActorName(String name,List<Movie>movies);
    void findMovieByYear(int num,List<Movie>movies);
    void findMovieByDirector(String name,List<Movie>movies);
    void findMovieByDescription(String name,List<Movie>movies);
    void findMovieByRole(String name,List<Movie>movies);
}
