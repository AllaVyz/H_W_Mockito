package ru.netology.statistic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 public class KinopoiskTest {

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
     public void testFindLastWhenLimitLessThanSize() {
         Kinopoisk manager = new Kinopoisk();
         String movie1 = "Звезда";
         String movie2 = "Луна";
         String movie3 = "Небо";
         String movie4 = "Солнце";
         String movie5 = "Земля";
         String movie6 = "Космос";

         manager.add(movie1);
         manager.add(movie2);
         manager.add(movie3);
         manager.add(movie4);
         manager.add(movie5);
         manager.add(movie6);

         String[] actual = manager.findLast();
         String[] expected = {"Космос", "Земля", "Солнце", "Небо", "Луна"};

         Assertions.assertArrayEquals(expected, actual);

     }

     @Test
     public void testFindLastWhenLimitLessThanSize2() {
         Kinopoisk manager = new Kinopoisk(3);
         String movie1 = "Звезда";
         String movie2 = "Луна";
         String movie3 = "Небо";
         String movie4 = "Солнце";
         String movie5 = "Земля";
         String movie6 = "Космос";

         manager.add(movie1);
         manager.add(movie2);
         manager.add(movie3);
         manager.add(movie4);
         manager.add(movie5);
         manager.add(movie6);

         String[] actual = manager.findLast();
         String[] expected = {"Космос", "Земля", "Солнце"};

         Assertions.assertArrayEquals(expected, actual);

     }
     @Test
     public void testFindLastWhenLimitMoreThanSize() {
         Kinopoisk manager = new Kinopoisk();
         String movie1 = "Звезда";
         String movie2 = "Луна";
         String movie3 = "Небо";


         manager.add(movie1);
         manager.add(movie2);
         manager.add(movie3);


         String[] actual = manager.findLast();
         String[] expected = {"Небо", "Луна", "Звезда"};

         Assertions.assertArrayEquals(expected, actual);

     }
     @Test
     public void testFindLastWhenLimitMoreThanSize2() {
         Kinopoisk manager = new Kinopoisk(4);
         String movie1 = "Звезда";
         String movie2 = "Луна";
         String movie3 = "Небо";


         manager.add(movie1);
         manager.add(movie2);
         manager.add(movie3);


         String[] actual = manager.findLast();
         String[] expected = {"Небо", "Луна", "Звезда"};

         Assertions.assertArrayEquals(expected, actual);

     }
 }





