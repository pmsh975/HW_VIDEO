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
    public void findLast() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");

        String[] expected = {"FILM III", "FILM II", "FILM I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}