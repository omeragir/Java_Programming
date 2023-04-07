package day25_constructor;

import java.time.LocalDate;

public class TestMovieObject {
    public static void main(String[] args) {

        String gene = "Adventure, Comedy, Thriller";
        String title = "Java Developer: Zero to Hero";
        String[] cast = {"Ozzy", "Ali", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

        Movie movie1 = new Movie("USA", title, gene, LocalDate.of(2021, 4, 18), "Kuzzat Altay");
        movie1.addCasts(cast);
        System.out.println(movie1);

    }
}
