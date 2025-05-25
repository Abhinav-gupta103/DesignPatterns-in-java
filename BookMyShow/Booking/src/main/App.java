package main;

import services.BookingService;

public class App {
    public static void main(String[] args) throws Exception {
        BookingService bookingService = BookingService.getInstance();
        bookingService.initialize();
        bookingService.startBookingSession();
    }
}
