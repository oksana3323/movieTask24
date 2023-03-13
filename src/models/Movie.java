package models;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDescription() {
        return description;
    }

    public Director getDirector() {
        return director;
    }

    public List<Cast> getCast() {
        return cast;
    }

    @Override
    public String toString() {
        return "Названния фильма: " + name + '\n' +
                "Год выпуска: " + year +"\n"+
                "Описание: " + description + "\n" +
                "Директор: " + director +"\n"+
                "Актеры: " + cast +"\n";
    }
}
