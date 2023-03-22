package ru.netology.movie;

public class MovieManager {

    private String[] movies = new String[0];
    private int limit = 5;

    public MovieManager() {

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public String[] findAll() {
        return movies;

    }


    public String[] findLast() {
        int resultLength = movies.length;
        if (resultLength >= limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            tmp[i] = movies[index];

        }
        return tmp;
    }

}
