package services;

import models.Movie;

import java.util.List;

public interface Sort {
    void sortByMovieName(int num, List<Movie> movies);
    void sortByYear(int num,List<Movie>movies);
    void sortByDirector(int num,List<Movie>movies);
}
