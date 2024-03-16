package ru.netology.statistic;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

 class KinopoiskTest {

    @Test
    public void testFindAll() {
        Kinopoisk manager = new Kinopoisk();
        String movie1 = "Звезда";
        String movie2 = "Луна";
        String movie3 = "Небо";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll2() {
        Kinopoisk manager = new Kinopoisk(12);
        String movie1 = "Звезда";
        String movie2 = "Луна";
        String movie3 = "Небо";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findAll();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll3() {
        Kinopoisk manager = new Kinopoisk();
        String movie1 = "Звезда";
        String movie2 = "Луна";
        String movie3 = "Небо";
        String movie4 = "Солнце";
        String movie5 = "Земля";
        String movie6 = "Космос";
        String movie7 = "Марс";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        String[] actual = manager.findAll();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll4() {
        Kinopoisk manager = new Kinopoisk(6);
        String movie1 = "Звезда";
        String movie2 = "Луна";
        String movie3 = "Небо";
        String movie4 = "Солнце";
        String movie5 = "Земля";
        String movie6 = "Космос";
        String movie7 = "Марс";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        String[] actual = manager.findAll();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};

        Assertions.assertArrayEquals(expected, actual);
    }
}



