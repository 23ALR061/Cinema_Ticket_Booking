import java.util.ArrayList;
import java.util.List;

public class CinemaManager {
    private List<Movie> movies;

    public CinemaManager() {
        movies = new ArrayList<>();
        // Predefined movie list
        movies.add(new Movie(1, "Avengers: Endgame", "6:00 PM", 50));
        movies.add(new Movie(2, "The Dark Knight", "8:00 PM", 40));
        movies.add(new Movie(3, "Inception", "10:00 PM", 30));
    }

    public void displayMovies() {
        System.out.println("\n--- Available Movies ---");
        for (Movie movie : movies) {
            System.out.println(movie);
            System.out.println("-------------------");
        }
    }

    public Movie findMovieById(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }

    public boolean bookTicket(int movieId, int seats) {
        Movie movie = findMovieById(movieId);
        if (movie != null) {
            if (movie.getAvailableSeats() >= seats) {
                movie.bookSeats(seats);
                System.out.println("Booking successful! " + seats + " seats booked for " + movie.getName());
                return true;
            } else {
                System.out.println("Not enough seats available!");
                return false;
            }
        } else {
            System.out.println("Movie not found!");
            return false;
        }
    }
}
