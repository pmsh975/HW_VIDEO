package ru.netology.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MovieManagerTest {

    @Test
    public void addMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");

        String[] expected = {"FILM I", "FILM II", "FILM III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addMovieLimitNull() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addMovieLimitOne() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FILM I");

        String[] expected = {"FILM I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");
        manager.addMovie("FILM IV");
        manager.addMovie("FILM V");

        String[] expected = {"FILM V", "FILM IV", "FILM III", "FILM II", "FILM I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLessLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");

        String[] expected = {"FILM III", "FILM II", "FILM I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");
        manager.addMovie("FILM IV");
        manager.addMovie("FILM V");
        manager.addMovie("FILM VI");
        manager.addMovie("FILM VII");

        String[] expected = {"FILM VII", "FILM VI", "FILM V", "FILM IV", "FILM III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastShouldThreeLastMovies() {
        MovieManager manager = new MovieManager(3);

        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");
        manager.addMovie("FILM IV");
        manager.addMovie("FILM V");
        manager.addMovie("FILM VI");
        manager.addMovie("FILM VII");
        manager.addMovie("FILM VIII");
        manager.addMovie("FILM IX");
        manager.addMovie("FILM X");

        String[] expected = {"FILM X", "FILM IX", "FILM VIII"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastShouldSevenLastMovies() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");
        manager.addMovie("FILM IV");
        manager.addMovie("FILM V");
        manager.addMovie("FILM VI");
        manager.addMovie("FILM VII");
        manager.addMovie("FILM VIII");
        manager.addMovie("FILM IX");
        manager.addMovie("FILM X");

        String[] expected = {"FILM X", "FILM IX", "FILM VIII", "FILM VII", "FILM VI", "FILM V", "FILM IV"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }



}