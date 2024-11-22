import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CinemaManager cinemaManager = new CinemaManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Cinema Ticket Booking System ---");
            System.out.println("1. View Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cinemaManager.displayMovies();
                    break;
                case 2:
                    System.out.print("Enter Movie ID: ");
                    int movieId = sc.nextInt();
                    System.out.print("Enter Number of Seats to Book: ");
                    int seats = sc.nextInt();
                    cinemaManager.bookTicket(movieId, seats);
                    break;
                case 3:
                    System.out.println("Exiting... Thank you for using the system!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

