package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

import controllers.MovieController;
import controllers.TheatreController;
import enums.City;
import models.Movie.Movie;
import models.Theatre.Show;
import models.Theatre.Theatre;
import utility.BookingDataFactory;

public class BookingService {
    private static BookingService instance;

    private final MovieController movieController;
    private final TheatreController theatreController;
    private final Scanner scanner;

    private BookingService() {
        movieController = new MovieController();
        theatreController = new TheatreController();
        scanner = new Scanner(System.in);
    }

    public static BookingService getInstance() { // Singelton method
        if (instance == null) {
            instance = new BookingService();
        }
        return instance;
    }

    public void initialize() {
        BookingDataFactory.createMovies(movieController);
        BookingDataFactory.createTheatres(movieController, theatreController);
    }

    public void startBookingSession() {
        printHeader("Welcome to BookMyShow");
        boolean continueBooking = true;

        while (continueBooking) {
            City userCity = selectCity();
            Movie selectedMovie = selectMovie(userCity);
            Show selectedShows = selectShow(userCity, selectedMovie);
            bookSeat(selectedShows);

            System.out.print("Do you want to book another ticket? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            continueBooking = response.equals("yes");
        }

        printSuccess("Thank you for using BookMyShow! 🎬 Have a great day!");
    }

    private City selectCity() {
        printSection("Select Your city");
        for (City city : City.values()) {
            System.out.println(" " + (city.ordinal() + 1) + ". " + city);
        }
        return City.values()[getUserChoice(1, City.values().length) - 1];
    }

    private Movie selectMovie(City city) {
        List<Movie> movies = movieController.getMoviesByCity(city);
        printSection("Available Movies in " + city);
        for (int i = 0; i < movies.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + movies.get(i).getMovieName());
        }
        return movies.get(getUserChoice(1, movies.size()) - 1);
    }

    private Show selectShow(City city, Movie movie) {
        Map<Theatre, List<Show>> showsMap = theatreController.getAllShows(city, movie);

        List<Show> availableShows = new ArrayList<>();
        printSection("Available shows for " + movie.getMovieName() + " in city " + city);

        int index = 1;
        for (Map.Entry<Theatre, List<Show>> entry : showsMap.entrySet()) {
            for (Show show : entry.getValue()) {
                System.out.println(
                        "  " + index + ". " + show.getShowStartTime() + " at " + entry.getKey().getTheatreName());
                availableShows.add(show);
                index++;
            }
        }
        return availableShows.get(getUserChoice(1, availableShows.size()) - 1);
    }

    private void bookSeat(Show show) {
        printSection("Select Your Seat (1-100)");
        int seatNumber = getUserChoice(1, 100);
        if (show.getBookedSeatsIds().contains(seatNumber)) {
            System.out.println("Seat already booked");
            bookSeat(show);
        } else {
            show.getBookedSeatsIds().add(seatNumber);
            PaymentService paymentService = new PaymentService();
            Boolean paymentSuccess = paymentService.processPayment(250);

            if (paymentSuccess) {
                System.out.println("Payment success, Seat " + seatNumber + " is booked.");
                generateTicket(show, seatNumber);
            } else {
                System.out.println("Payment is not succesfull");
                show.getBookedSeatsIds().remove(seatNumber);
            }
        }
    }

    private void generateTicket(Show show, int seatNumber) {
        System.out.println("\n========================================");
        System.out.println("🎟️       MOVIE TICKET CONFIRMATION       🎟️");
        System.out.println("========================================");
        System.out.println("🎬 Movie: " + show.getMovie().getMovieName());
        System.out.println("⏰ Show Time: " + show.getShowStartTime() + ":00");
        System.out.println("💺 Seat Number: " + seatNumber);
        System.out.println("----------------------------------------");
        System.out.println("📅 Date: " + java.time.LocalDate.now());
        System.out.println("🆔 Booking ID: " + UUID.randomUUID());
        System.out.println("========================================");
        System.out.println("🎉 Enjoy your movie! 🍿 Have a great time!");
        System.out.println("========================================\n");
    }

    private void printHeader(String text) {
        System.out.println("\n══════════════════════════════════════════");
        System.out.println("          " + text);
        System.out.println("══════════════════════════════════════════\n");
    }

    private void printSection(String text) {
        System.out.println("\n🔹 " + text);
        System.out.println("──────────────────────────────────────────");
    }

    private void printSuccess(String text) {
        System.out.println("\n🎉 " + text + "\n");
    }

    private int getUserChoice(int min, int max) {
        int choice;
        do {
            System.out.println("Enter choice (" + min + "-" + max + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < min || choice > max);
        return choice;
    }
}
