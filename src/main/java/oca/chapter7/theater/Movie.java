package oca.chapter7.theater;

public class Movie extends Cinema {
    public Movie(String movie) {

    }

    public static void main(String[] showing) {
        System.out.print(new Movie("Another Trilogy").name);
    }
}
