package ru.netology.statistic;

public class Kinopoisk {
    private String[] movies = new String[0];
    private int Limit;

    public Kinopoisk(int Limit) {
        this.Limit = Limit;
    }

    public Kinopoisk() {
        Limit = 5;
    }

    public void add(String movie) {
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
        int resultLength;
        if (Limit < movies.length) {
            resultLength = Limit;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[0] = movies[movies.length - 1];
            result[1] = movies[movies.length - 2];
            result[2] = movies[movies.length - 3];
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }

}
