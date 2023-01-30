package oca_test_50.chapter8.q1;

public class Movie extends Cinema {
    public Movie(String movie) {
        super(movie);
    };

    public static void main(String[] showing) {
        //System.out.print(new Movie("Another Trilogy").name);
        Cinema cinema = new Cinema("kris");
        cinema.getCinemaName();
        Movie movie = new Movie("krs");
        movie.getCinemaName();
    }
}
