package ru.netology.statistic;

public class Kinopoisk {
    private String[] movies = new String[0];
    private int limit;

    public Kinopoisk(int limit) {
        this.limit = limit;
    }

    public Kinopoisk() {
        limit = 5;
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
        if (limit < movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 -i];

        }
        return result;

    }

}
