package services.impl;

import models.Movie;
import services.Sort;

import java.util.Comparator;
import java.util.List;

public class SortImpl implements Sort {
    public static Comparator<Movie> sortByMovieName2 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Movie> sortByMovieName1 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    @Override
    public void sortByMovieName(int num, List<Movie> movies) {
        if (num == 2) {
            movies.sort(sortByMovieName1);
        } else if (num == 1) {
            movies.sort(sortByMovieName2);
        } else {
            System.err.println("error");
        }

        for (Movie movie : movies) {
            System.out.println(movie);
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`8");
        }
    }

    public static Comparator<Movie> getSortByYear1 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - o2.getYear();
        }
    };
    public static Comparator<Movie> getSortByYear2 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear() - o1.getYear();
        }
    };

    @Override
    public void sortByYear(int num, List<Movie> movies) {
        if (num == 2) {
            movies.sort(getSortByYear1);
        } else if (num == 1) {
            movies.sort(getSortByYear2);
        } else {
            System.err.println("error");
        }
        for (Movie movies1 : movies) {
            System.out.println("Год выпуска: " + movies1.getYear());
            System.out.println("Названния фильма: " + movies1.getName());
            System.out.println("Описание: " + movies1.getDescription());
            System.out.println("Директор: " + movies1.getDirector());
            System.out.println("Актеры: " + movies1.getCast());
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            System.out.println("");
        }


    }

    public static Comparator<Movie> sortByDirector1 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };
    public static Comparator<Movie> sortByDirector2 = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getDirector().getName().compareTo(o1.getDirector().getName());
        }
    };

    @Override
    public void sortByDirector(int num, List<Movie> movies) {
        if (num == 1) {
            movies.sort(sortByDirector1);
        } else if (num == 2) {
            movies.sort(sortByDirector2);
        }
        for (Movie movies1 : movies) {
            System.out.println("Директор: " + movies1.getDirector());
            System.out.println("Названния фильма: " + movies1.getName());
            System.out.println("Год выпуска: " + movies1.getYear());
            System.out.println("Описание: " + movies1.getDescription());
            System.out.println("Актеры: " + movies1.getCast());
            System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
            System.out.println("");
        }


    }
}
